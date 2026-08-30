class Cache {
    public int val;
    public int used = 0;
    public int ts;

    Cache(int val, int ts) {
        this.val = val;
        this.used = 1;
        this.ts = ts;
    }
}

class LFUCache {
    private Map<Integer, Cache> map;
    private TreeSet<Integer> set;
    private int n = -1;
    int ts = 1;
    public LFUCache(int capacity) {
        n = capacity;
        map = new HashMap<>();
        set = new TreeSet<>((a, b) -> {
            Cache x = map.get(a);
            Cache y = map.get(b);
            if (x.used != y.used)
                return Integer.compare(x.used, y.used);
            if (x.ts != y.ts)
                return Integer.compare(x.ts, y.ts);
            return Integer.compare(a, b);
        });
    }
    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        Cache c = map.get(key);
        set.remove(key);
        c.ts = ts++;
        c.used++;
        map.put(key, c);
        set.add(key);
        return c.val;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Cache c = map.get(key);
            set.remove(key);
            c.val = value;
            c.used++;
            c.ts = ts++;
            map.put(key, c);
            set.add(key);
            return;
        }
        if (n == 0)
            return;
        if (map.size() == n) {
            int lk = set.first();
            set.remove(lk);
            map.remove(lk);
        }
        Cache c = new Cache(value, ts++);
        map.put(key, c);
        set.add(key);
    }
}
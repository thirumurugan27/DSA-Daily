class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> map = new HashMap<>();

        int a = 0;
        int b = 0;

        for(char c : secret.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                a++;
                map.put(secret.charAt(i), map.get(secret.charAt(i)) - 1);
            }
        }

        for(int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) != guess.charAt(i)) {
                char c = guess.charAt(i);

                if(map.getOrDefault(c, 0) > 0) {
                    b++;
                    map.put(c, map.get(c) - 1);
                }
            }
        }

        return a + "A" + b + "B";
    }
}
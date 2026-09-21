class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        String normalizedStr = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String[] words = normalizedStr.split("\\s+");
        
        Map<String, Integer> map = new HashMap<>();
        String mword = "";
        int max = 0;
        
        for (String word : words) {
            if (!ban.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
                if (map.get(word) > max) {
                    max = map.get(word);
                    mword = word;
                }
            }
        }
        
        return mword;
    }
}

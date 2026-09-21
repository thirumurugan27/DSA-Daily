class Pair {
    String first;
    int second;
    Pair(String _first, int _second) {
        this.first = _first;
        this.second = _second;
    }
}

class Solution {
    public int ladderLength(String startWord, String targetWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(startWord, 1));
        
        Set<String> st = new HashSet<>(wordList);
        st.remove(startWord);
        
        while (!q.isEmpty()) {
            String word = q.peek().first;
            int steps = q.peek().second;
            q.remove();
            
            if (word.equals(targetWord)) return steps;
            for (int i = 0; i < word.length(); i++) {
                char[] replacedCharArray = word.toCharArray();
                
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    char originalChar = replacedCharArray[i];
                    replacedCharArray[i] = ch;
                    String replacedWord = new String(replacedCharArray);
                    
                    if (st.contains(replacedWord)) {
                        st.remove(replacedWord);
                        q.add(new Pair(replacedWord, steps + 1));
                    }
                    
                    replacedCharArray[i] = originalChar; // Restore character for the next loop iteration
                }
            }
        }
        return 0;
    }
}
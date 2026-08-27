class Solution {
    public String sortVowels(String s) {
        List<Character> li=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if("AEIOUaeiou".indexOf(s.charAt(i))!=-1){
                li.add(s.charAt(i));
            }
        }
        
        Collections.sort(li);
        String ans="";int idx=0;
        for(int i=0;i<s.length();i++){
            if("AEIOUaeiou".indexOf(s.charAt(i))!=-1){
                ans+=li.get(idx++);
            }
            else{
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
}
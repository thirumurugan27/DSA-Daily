class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        if(arr.length==0) return "";
        String[] ans=new String[arr.length];
        for(String word:arr){
            ans[word.charAt(word.length()-1)-'1']=word.substring(0,word.length()-1);
        }
        return String.join(" ",ans);

    }
}
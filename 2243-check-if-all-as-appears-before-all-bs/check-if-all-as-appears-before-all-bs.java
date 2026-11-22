class Solution {
    public boolean checkString(String s) {
        boolean isB=false;
        for(char c:s.toCharArray()){
            if(c=='a'){
                if(isB)return false;
            }
            else{
                isB=true;
            }
        }
        return true;
    }
}
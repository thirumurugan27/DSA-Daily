class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> st=new Stack();
        int lc=0,rc=0;
        for(char c:s.toCharArray()){
            if(c=='(') lc++;
            if(c==')')rc++;
            if(rc>lc){
                rc--;
                continue;
            }
            else{
                st.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            char c=st.pop();
            if(lc> rc && c=='(') lc--;
            else ans.append(c);
        }
        return ans.reverse().toString();
    }
}
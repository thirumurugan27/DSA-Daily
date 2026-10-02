class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        backtrack(n,0,0,"",ans);
        return ans;
    }
    public void backtrack(int n,int open,int close,String s,List<String> ans){
        if(open==n && close==n){
            ans.add(s);
            return;
        }
        if(open<n){
            backtrack(n,open+1,close,s+"(",ans);
        }
        if(close<open){
            backtrack(n,open,close+1,s+")",ans);
        }
    }
}
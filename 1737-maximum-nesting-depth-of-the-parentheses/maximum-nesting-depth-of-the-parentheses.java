class Solution {
    public int maxDepth(String s) {
        int d=0,m=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                d++;
            }
            else if(c==')')
            {
                if(m<d)
                {
                    m=d;
                }
                d--;
            }
        }
        return m;
        
    }
}
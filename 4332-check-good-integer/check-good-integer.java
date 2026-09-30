class Solution {
    public boolean checkGoodInteger(int n) {
        int digsum=0,sqrsum=0;
        while(n!=0){
            int dig=n%10;
            n/=10;
            digsum+=dig;
            sqrsum+=dig*dig;
        }
        return sqrsum-digsum>=50;
    }
}
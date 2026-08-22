class Solution {
    public static boolean checkDivisibility(int n) {
        int sum=0,mul=1;
        int temp=n;
        while(temp!=0){
            int l=temp%10;
            sum+=l;
            mul*=l;
            temp/=10;
        }
        return n%(sum+mul)==0;
    }
}
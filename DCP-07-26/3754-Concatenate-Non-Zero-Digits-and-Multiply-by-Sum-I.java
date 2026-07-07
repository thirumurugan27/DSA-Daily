class Solution {
    public long sumAndMultiply(int n) {
        long num = 1;
        long sum = 0;
        long ans = 0;
        while(n > 0) {
            int digit =  n % 10;
            if(digit!=0) {
                ans = digit * num + ans;
                sum += digit;
                num *= 10;
            }
            n /= 10;
        }
        return ans*sum;
    }
}
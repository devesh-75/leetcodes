class Solution {
    public boolean checkDivisibility(int n) {
        int c = n;
        int s1 = 0;
        int s2 = 1;
        while(n > 0)
        {
            int rem = n%10;
            s1 += rem;
            s2 *= rem;
            n /= 10;
        }
        return c%(s1+s2) == 0;
    }
}
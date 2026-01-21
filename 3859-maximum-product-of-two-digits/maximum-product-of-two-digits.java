class Solution {
    public int maxProduct(int n) {
        int f = n % 10;
        int f2 = Integer.MIN_VALUE;
        n = n/10;
        while(n>0)
        {
            int rem = n % 10;
            if(rem >= f)
            {
                f2 = f;
                f = rem;
            }
            else if(rem > f2)
            {
                f2 = rem;
            }
            n /= 10;
        }
        return f * f2;
    }
}
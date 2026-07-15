class Solution {
    public int gcdOfOddEvenSums(int n) {
        int esum = 0;
        int osum = 0;
        while(n != 0)
        {
            esum += n*2;
            osum += n*2 - 1;
            n--;
        }
        return gcd(esum, osum);
    }
    public int gcd(int a, int b)
    {
        while(b != 0)
        {
            int temp = b;
            b = a % temp;
            a = temp;
        }
        return Math.abs(a);
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        int rem;
        long sum = 0;
        long n = x;
        if( x < 0)
        {
            return false;
        }
        while(n!=0){
            rem = (int)(n%10);
            sum = sum*10 + rem;
            n= n/10;
        }
        
    return (sum == x);
    }
}
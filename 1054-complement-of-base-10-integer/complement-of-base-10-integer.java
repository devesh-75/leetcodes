class Solution {
    public int bitwiseComplement(int n) {
         if(n == 0) return 1;
        int i = 0;
        int ans = 0;
        while(n > 0) {
            ans = (((n & 1) == 1 ? 0 : 1) << i) + ans;
            i++;
            n >>= 1;
        }
        return ans;
    }
}
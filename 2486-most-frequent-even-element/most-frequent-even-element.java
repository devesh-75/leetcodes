class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] freq = new int[100001]; 
        int ans = -1;
        int maxFreq = 0;

        for (int x : nums) {
            if (x % 2 == 0) {
                freq[x]++;
                if (freq[x] > maxFreq || 
                   (freq[x] == maxFreq && x < ans)) {
                    maxFreq = freq[x];
                    ans = x;
                }
            }
        }
        return ans;
    }
}

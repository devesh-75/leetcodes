class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n = nums.size();
        int ans = -1;

        for (int i = 1; i < n; i++) {
            if (nums.get(i) < nums.get(i - 1))
            {
                ans = i;
                break;
            }
        }

        if (ans == -1) return 0;

        for (int i = ans + 1; i < n; i++) {
            if (nums.get(i) < nums.get(i - 1))
            {
                return -1;
            }
        }

        if (nums.get(n - 1) > nums.get(0)) 
        {
            return -1;
        }
        return n - ans;
    }
}

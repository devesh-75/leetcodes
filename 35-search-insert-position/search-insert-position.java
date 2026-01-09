class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int ans = nums.length;
        int f = nums.length - 1;

        while (s <= f) {
            int mid = s + (f - s) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                f = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
}

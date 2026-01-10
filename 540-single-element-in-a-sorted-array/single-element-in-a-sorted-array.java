class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s = 0, f = nums.length - 1;

        while (s < f) {
            int mid = s + (f - s) / 2;

            if (mid % 2 == 1) 
            {
                mid--;
            }
            if (nums[mid] == nums[mid + 1]) 
            {
                s = mid + 2;
            } 
            else 
            {
                f = mid;
            }
        }
        return nums[s];
    }
}

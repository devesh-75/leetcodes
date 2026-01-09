class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s = 0;
        int f = nums.length-1;
        int x = -1;
        int y = -1;
        while(s <= f)
        {
            int mid = s + (f - s)/2;
            if(nums[mid] == target)
            {
                x = mid;
                f = mid - 1;
            }
            else if(nums[mid] < target)
            {
                s = mid + 1;
            }
            else
            {
                f = mid - 1;
            }
        }
        s = 0;
        f = nums.length-1;
        while(s <= f)
        {
            int mid = s + (f - s)/2;
            if(nums[mid] == target)
            {
                y = mid;
                s = mid + 1;
            }
            else if(nums[mid] < target)
            {
                s = mid + 1;
            }
            else
            {
                f = mid - 1;
            }
        }
        return new int[]{x,y};
    }
}
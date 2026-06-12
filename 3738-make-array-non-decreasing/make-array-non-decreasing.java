class Solution {
    public int maximumPossibleSize(int[] nums) {
        Stack<Integer> s = new Stack<>();
        s.push(nums[0]);
        for(int i=1;i<nums.length; i++)
        {
            if(s.peek() <= nums[i])
            {
                s.push(nums[i]);
            }
        }
        return s.size();
    }
}
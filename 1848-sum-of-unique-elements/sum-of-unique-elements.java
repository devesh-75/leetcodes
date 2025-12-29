class Solution {
    public int sumOfUnique(int[] nums) {
        int max = nums[0];
        for(int num : nums){
            if(num > max){
                max = num;
            }
        }
        int temp[] = new int[max+1];
        for(int i=0; i<nums.length; i++)
        {
            temp[nums[i]]++;
        }
        int sum = 0;
        for(int i=0; i<temp.length; i++)
        {
            if(temp[i] == 1)
            {
                sum+=i;
            }
        }
        return sum;
    }
}
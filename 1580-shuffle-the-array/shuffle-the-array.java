class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int j = n;
        int k = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(i % 2 == 0)
            {
                arr[i] = nums[k];
                k++;
            }
            else
            {
                arr[i] = nums[j];
                j++;
            } 
        }
    return arr;
    }
}
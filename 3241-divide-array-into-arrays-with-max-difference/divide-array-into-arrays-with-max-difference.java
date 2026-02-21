class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int h = 0;
        int[][] arr = new int[nums.length/3][3];
        for(int i = 0; i<nums.length/3; i++)
        {
            for(int j=0; j <= 2; j++)
            {
                arr[i][j] = nums[h];
                h++;
            }
        }
        
        for(int i = 0; i<nums.length/3; i++)
        {
            if(arr[i][2] - arr[i][0] > k)
            {
                return new int[0][0];
            }
        }
        return arr;
    }
}
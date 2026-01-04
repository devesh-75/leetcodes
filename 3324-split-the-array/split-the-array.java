class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int max = 0;
        for(int n : nums)
        {
            max = Math.max(n,max);
        }
        int arr[] = new int[max+1];
        for(int n : nums)
        {
            arr[n]++;
            if(arr[n] > 2)
            {
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int arr[] = new int[101];
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
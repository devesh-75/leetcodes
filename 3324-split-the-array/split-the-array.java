class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int arr[] = new int[101];
        for(int n : nums)
        {
            arr[n]++;
        }
        for(int n : arr)
        {
            if(n > 2)
            {
                return false;
            }
        }
        return true;
    }
}
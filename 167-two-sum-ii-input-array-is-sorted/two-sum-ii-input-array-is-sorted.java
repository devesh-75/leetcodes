class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];
        int i = 0;
        int l = numbers.length-1;
        while(i<l)
        {
            int sum = numbers[i]+numbers[l];
            if(target == sum)
            {
                ans[0] = i+1;
                ans[1] = l+1;
                return ans;
            }
            else if(target < sum)
            {
                l--;
            }
            else
            {
                i++;
            }
        }
        return ans;
    }
}
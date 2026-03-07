class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;
        while(k != 0)
        {
            if(numOnes > 0)
            {
                sum++;
                k--;
                numOnes--;
            }
            else if(numZeros > 0)
            {
                k--;
                numZeros--;
            }
            else
            {
                sum--;
                k--;
                numNegOnes--;
            }
        }
        return sum;
    }
}
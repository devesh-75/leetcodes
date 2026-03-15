import java.util.*;

class Solution {

    public double[] medianSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        double[] ans = new double[n - k + 1];

        int[] window = new int[k];

        for(int i=0;i<k;i++)
            window[i] = nums[i];

        Arrays.sort(window);

        ans[0] = getMedian(window,k);

        for(int i=k;i<n;i++)
        {
            int out = nums[i-k];
            int in = nums[i];

            int removeIndex = Arrays.binarySearch(window,out);

            for(int j=removeIndex;j<k-1;j++)
                window[j] = window[j+1];

            int insertPos = Arrays.binarySearch(window,0,k-1,in);

            if(insertPos < 0)
                insertPos = -(insertPos+1);

            for(int j=k-1;j>insertPos;j--)
                window[j] = window[j-1];

            window[insertPos] = in;

            ans[i-k+1] = getMedian(window,k);
        }

        return ans;
    }

    double getMedian(int[] arr,int k)
    {
        if(k%2==0)
            return ((double)arr[k/2] + (double)arr[(k/2)-1]) / 2.0;
        else
            return arr[k/2];
    }
}
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int f = arr.length-1;
        int mid = s + (f-s)/2;
        while(s <= f)
        {
            mid = s + (f-s)/2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1])
            {
                break;
            }
            else if(arr[mid + 1] > arr[mid] )
            {
                s = mid;
            }
            else
            {
                f = mid;
            }
        }
        return mid;
    }
}
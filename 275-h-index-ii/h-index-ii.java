class Solution {
    public int hIndex(int[] arr) {
        int s = 0;
        int f = arr.length-1;
        int mid = s + (f-s)/2;
        while(s<=f)
        {
            mid = s + (f-s)/2;
            if(arr[mid] == arr.length - mid)
            {
                return arr.length-mid;
            }
            else if(arr[mid] < arr.length- mid)
            {
                s = mid+1;
            }
            else
            {
                f = mid-1;
            }
        }
        return arr.length-s;
    }
}
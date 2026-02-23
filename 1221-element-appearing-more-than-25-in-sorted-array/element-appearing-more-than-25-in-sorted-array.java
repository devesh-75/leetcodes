class Solution {
    public int findSpecialInteger(int[] arr) {
        int count = 1;
    
        int ans = arr[0];
        
        int onefour = arr.length/4;
        
        
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i] == arr[i+1])
            {
                count++;
                if(count > onefour)
                {
                    ans = arr[i];
                    break;
                }
            }
            else
            {
                count = 1;
            }
        }
        return ans;
    }
}
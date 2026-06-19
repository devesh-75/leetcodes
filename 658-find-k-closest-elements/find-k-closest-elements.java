class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int s = 0;
        int f = arr.length-1;
        while(f - s >= k)
        {
            if(Math.abs(arr[s] - x) > Math.abs(arr[f] - x))
            {
                s++;
            }
            else f--;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=s; i<=f; i++)
        {
            ans.add(arr[i]);
        }
        return ans;
    }
}
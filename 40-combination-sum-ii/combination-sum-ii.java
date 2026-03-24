class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        int n = candidates.length;
        List<Integer>temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        func(0,n,candidates,target,temp,ans);
        return ans;
    }
    public static void func(int ind,int n, int []arr, int target, List<Integer>temp, List<List<Integer>> ans)
    {
        if(target == 0)
        {
            ans.add(new ArrayList<>(temp));
        }
        if(ind == n)
        {
            return;
        }
        for(int i=ind; i<n; i++)
        {
            if(i>ind && arr[i-1] == arr[i])continue;
            if(arr[i] > target)
            {
                break;
            }
            temp.add(arr[i]);
            func(i+1,n,arr,target-arr[i],temp,ans);
            temp.remove(temp.size()-1);
        }
        
    }
}
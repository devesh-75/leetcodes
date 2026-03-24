class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        func(1,1,n,k,ans,temp);
        return ans;
    }
    public static void func(int ind, int i, int n, int k, List<List<Integer>> ans, List<Integer>temp)
    {
        if(i == k+1)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(ind == n+1)
        {
            return;
        }
        temp.add(ind);
        func(ind+1,i+1,n,k,ans,temp);
        temp.remove(temp.size()-1);
        func(ind+1,i,n,k,ans,temp);
    }
}
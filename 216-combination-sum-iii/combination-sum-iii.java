class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer>temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int ind = 1;
        func(ind, k,n, temp, ans);
        return ans;  
    }
    public static void func(int ind, int k, int n, List<Integer>temp, List<List<Integer>> ans)
    {
        if(n == 0 && temp.size()==k)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(ind == 10)
        {
            return;
        }
        for(int i=ind; i<=9; i++)
        {
            if(i > n)
            {
                break;
            }
            temp.add(i);
            func(i+1, k, n-i, temp, ans);
            temp.remove(temp.size()-1);
    
        }
    }
}
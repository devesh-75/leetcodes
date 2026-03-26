class Solution {
    public List<List<String>> solveNQueens(int n) {
        char [] col = new char[n];
        char [] diag1 = new char[2*n];
        char [] diag2 = new char[2*n];
        List<String> temp = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        func(0,n,col,diag1,diag2,temp,ans);
        return ans;
    }
    public void func(int ind, int n, char [] col, char[] diag1, char[] diag2, List<String> temp, List<List<String>> ans)
    {
        if(ind == n)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0; i<n; i++)
        {
            if (col[i] == 'Q' || diag2[ind + i] == 'Q' || diag1[ind - i + n] == 'Q')
            {
                continue;
            }
            col[i] = 'Q';
            diag1[(ind-i + n)] = 'Q';
            diag2[(ind+i)] = 'Q';
            char[] arr = new char[n];
            Arrays.fill(arr, '.');
            arr[i] = 'Q';
            temp.add(new String(arr));
            func(ind+1, n,col,diag1,diag2,temp,ans);
            temp.remove(temp.size() - 1);
            col[i] = '\0';
            diag1[ind - i + n] = '\0';
            diag2[ind + i] = '\0';
            
        }
    }
}
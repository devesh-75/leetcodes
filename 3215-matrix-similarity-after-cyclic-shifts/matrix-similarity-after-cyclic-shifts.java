class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int n =  mat[0].length; 
        k = k % n;
        int l = n-k;
        for(int i=0; i< mat.length; i++)
        {
            if(i % 2 == 0)
            {
                for(int j=0; j<n; j++)
                {
                    int x = (j + k)%n;
                    if(mat[i][j] != mat[i][x])
                    {
                        return false;
                    }
                }  
            }
            else
            {
                for(int j=0; j<n; j++)
                {
                    int x = (j + l)%n;
                    if(mat[i][j] != mat[i][x])
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
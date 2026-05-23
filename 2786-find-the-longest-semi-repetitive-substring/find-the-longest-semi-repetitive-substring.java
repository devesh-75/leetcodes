class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int adj = 0;
        int l=0;
        int max = 1;
        int r=1;
        int i =0;
        while( r < s.length())
        {
            if(s.charAt(r) == s.charAt(r-1))
            {
                adj++;
                if(adj == 2)
                {
                    l = i;
                    adj--;
                }
                i = r; 
            }
            
            max = Math.max(max, r-l+1);
            r++;
        }
        return max;
    }
}
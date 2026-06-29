class Solution {
    public int countSubstrings(String s) {
       
        int count = s.length();
        int x = 1;
       
        while(x < s.length())
        {
            int l = 0;
            int r = x;
            while(r < s.length())
            {
                boolean flag = true;
                int f = l;
                int e = r;
                while(f <= e)
                {
                    if(s.charAt(f) != s.charAt(e))
                    {
                        flag = false;
                        break;
                    }
                    f++;
                    e--;
                }    
                if(flag == true) count++;
                l++;
                r++;
            }
            x++;
        }
        return count;
    }

}
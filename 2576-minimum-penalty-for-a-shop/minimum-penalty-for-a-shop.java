class Solution {
    public int bestClosingTime(String customers) {
        int ans = 0;
        
        for(int i = 0; i<customers.length(); i++)
        {
            if(customers.charAt(i) == 'N')
            {
                ans++;
            }
        }
        int min = ans;
        int c = customers.length();

        for(int i=customers.length()-1; i>=0;i--)
        {
            if(customers.charAt(i) == 'Y')
            {
                ans += 1;
            }
            else
            {
                ans -= 1;
                if(min >= ans)
                {
                    min = ans;
                    c = i;
                }
            }
        }
        
        return c  ;      
    }
}
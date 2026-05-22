class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set= new HashSet<>();
        for(int i=0; i<arr1.length; i++)
        {
            int c= arr1[i];
            while(c > 0)
            {
               set.add(c);
               c = c/10;
            }
        }
        int count = 0;
        for(int i=0; i<arr2.length; i++)
        {
            int x = arr2[i];
            while(x > 0)
            {
                if(set.contains(x))
                {
                    int ans = 0;
                    while(x > 0)
                    {
                        x = x /10;
                        ans++;
                       
                    }
                    count = Math.max(count,ans);
                    break;
                }
                x = x/10;
            }
        }
        return count;
    }
}
class Solution {
    public int totalFruit(int[] fruits) {
        int r=0;
        int l=0;
        int count=0;
        Map<Integer,Integer> map = new HashMap<>();
        while(r<fruits.length)
        {
            map.put(fruits[r], map.getOrDefault(fruits[r],0)+1);
            if(map.size() >= 3)
            {
                map.put(fruits[l], map.get(fruits[l])-1);
                if(map.get(fruits[l]) == 0)
                {
                    map.remove(fruits[l]);
                }
                l++;
            }
            else
            {
                count = Math.max(r-l+1 , count);
            }
            r++;
        }
        return count;
    }
}
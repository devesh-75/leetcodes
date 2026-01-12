class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : arr1)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int c = 0;

        for(int x : arr2) 
        {
            int freq = map.getOrDefault(x, 0);
            for(int j = 0; j < freq; j++) 
            {
                arr1[c++] = x;
            }
            map.remove(x);
        }
        List<Integer> rest = new ArrayList<>();
        for(int num : map.keySet())
        {
            int k = map.getOrDefault(num, 0);
            for(int j = 0; j < k; j++)
            {
                rest.add(num);
            }
        }
        Collections.sort(rest);
        for(int x : rest) {
            arr1[c++] = x;
        }
        return arr1;
    }
}
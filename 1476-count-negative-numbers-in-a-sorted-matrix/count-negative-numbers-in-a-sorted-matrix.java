class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;

        for (int j = 0; j < grid[0].length; j++) {

            int s = 0;
            int f = grid.length - 1;

            while (s <= f) {
                int mid = s + (f - s) / 2;

                if (grid[mid][j] < 0) {
                    f = mid - 1;   
                } else {
                    s = mid + 1;   
                }
            }
            count += (grid.length - s);
        }

        return count;
    }
}

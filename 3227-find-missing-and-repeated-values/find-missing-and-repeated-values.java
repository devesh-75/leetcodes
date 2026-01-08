class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        n = n * n;

        long S = 0;
        long S2 = 0;

        long Sn = (long) n * (n + 1) / 2;
        long Sn2 = (long) n * (n + 1) * (2L * n + 1) / 6;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                S += grid[i][j];
                S2 += (long) grid[i][j] * grid[i][j];
            }
        }

        long eq1 = S - Sn; // x+y = S-Sn;
        long eq2 = S2 - Sn2; //(x+y)(x-y) = S2-Sn2;
        eq2 = eq2 / eq1; // (x-y) = S2-Sn2/(x+y);

        long x = (eq1 + eq2) / 2;
        long y = x - eq1;

        return new int[]{(int) x, (int) y};
    }
}

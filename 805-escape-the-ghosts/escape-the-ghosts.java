class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        boolean flag = true;
        int diff1 = Integer.MAX_VALUE;
        int diff2 = Integer.MAX_VALUE;
        for(int i=0; i<ghosts.length; i++)
        {
            int temp = Math.abs(ghosts[i][0]-target[0]);
            int temp2 =  Math.abs(ghosts[i][1] - target[1]);
            diff1 = Math.min((temp+temp2),diff1);
        }
        diff2 = (Math.abs(0 - target[0]) + Math.abs(0 - target[1]));
        if(diff2 < diff1)
        {
            return true;
        }
        else return false;
    }
}
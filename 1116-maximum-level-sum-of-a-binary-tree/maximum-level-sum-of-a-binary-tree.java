/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        int max = Integer.MIN_VALUE;
        int c = 0;
        int level = 0;
        if(root == null)
        {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            level++;
            int sum = 0;
            int levelsize = queue.size();
            for(int i=0; i<levelsize; i++)
            {
                TreeNode curr = queue.poll();
                sum += curr.val;
                if(curr.left != null)
                {
                    queue.offer(curr.left);
                }
                if(curr.right != null)
                {
                    queue.offer(curr.right);
                }
            }
            if(max < sum)
            {
                max = sum;
                c = level; 
            }
        }
        return c; 
    }
}
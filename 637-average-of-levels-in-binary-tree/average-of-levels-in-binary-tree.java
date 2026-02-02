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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode>queue = new LinkedList<>();
        queue.offer(root);
        if(root == null)
        {
            return res;
        }
        while(!queue.isEmpty())
        {
            int level = queue.size();
            double sum = 0;
            for(int i=0; i<level ; i++)
            {
                TreeNode curr = queue.poll();
                sum += (double)curr.val;
                if(curr.left != null)
                {
                    queue.offer(curr.left);
                }
                if(curr.right != null)
                {
                    queue.offer(curr.right);
                }
            }
            sum /= level;
            res.add(sum);
        }
        return res;
    }
}
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        return rootsum(root,targetSum,sum);
    }
    public boolean rootsum(TreeNode root, int target, int sum)
    {
        if(root == null)
        {
            return false;
        }
        if(root.right == null && root.left == null)
        {
            sum += root.val;
            if(sum == target)
            {
                return true;
            }
        }
        return rootsum(root.left, target,sum+root.val) || rootsum(root.right,target,sum+root.val);
    }

}
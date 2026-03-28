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
    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        
        if(root == null)
        {
            return 0;
        }
        func(root,targetSum);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return count;
    }
    public void func(TreeNode root, long targetSum) {
        if(root == null)
        {
            return;
        }
        
        if(targetSum == root.val)
        {
            count++;
        }
        func(root.left, targetSum -root.val); 
        func(root.right, targetSum-root.val);
    }
}
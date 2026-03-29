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
    int max = 0;
    int ans = 0;
    public int findBottomLeftValue(TreeNode root) {
        ans = root.val;
        func(root,0);
        return ans;
    }
    public void func(TreeNode root, int level)
    {
        if(root == null)
        {
            return;
        }
        if(max < level)
        {
            max = level;
            ans = root.val;
        }
        func(root.left, level+1);
        func(root.right, level+1);
        
    }
}
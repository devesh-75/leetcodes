/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> arr1 = new ArrayList<>();
        List<TreeNode> arr2 = new ArrayList<>();
        TreeNode curr = root;
        func(curr, p, arr1);
        func(root, q, arr2);
        int i = 0;
        TreeNode ans = root;
        while(i < arr1.size() && i < arr2.size())
        {
            if(arr1.get(i) == arr2.get(i))
            {
                ans = arr1.get(i);
            }
            i++;
        }
        return ans;
    }
    public boolean func(TreeNode root, TreeNode p, List<TreeNode> arr)
    {
        if(root == null)
        {
            return false;
        }
        arr.add(root);
        if(root == p)
        {
            return true;
        }
        if (func(root.left, p,arr) || func(root.right, p,arr))
        {
            return true;
        } 
       
        arr.remove(arr.size()-1);
        return false;
    }
}
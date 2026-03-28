class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        return func(root, targetSum) 
             + pathSum(root.left, targetSum) 
             + pathSum(root.right, targetSum);
    }

    public int func(TreeNode root, long targetSum) {
        if (root == null) return 0;

        int count = 0;

        if (targetSum == root.val) count++;

        count += func(root.left, targetSum - root.val);
        count += func(root.right, targetSum - root.val);

        return count;
    }
}
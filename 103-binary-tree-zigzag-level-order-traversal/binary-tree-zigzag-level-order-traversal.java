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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)
        {
            return list;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse = false;
        while(!queue.isEmpty())
        {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0; i<size; i++)
            {
                if(!reverse)
                {
                    TreeNode curr = queue.pollFirst();
                    temp.add(curr.val);
                    if(curr.left != null)
                    {
                        queue.offerLast(curr.left);
                    }
                    if(curr.right != null)
                    {
                        queue.offerLast(curr.right);
                    }
                      
                }
                else
                {
                    TreeNode curr = queue.pollLast();
                    temp.add(curr.val);
                    if(curr.right != null)
                    {
                        queue.offerFirst(curr.right);
                    }
                    if(curr.left != null)
                    {
                        queue.offerFirst(curr.left);
                    }
                    
                }
            }
            reverse = !reverse;
            list.add(temp);
        }
        return list;
    }
}
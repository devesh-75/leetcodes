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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root == null)
        {
            return 0;
        }
        return func(root, k);
    
    }
    public static long func(TreeNode root,int k)
    {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        long sum = 0;

        PriorityQueue<Long> pq = new PriorityQueue<>();
        while(!queue.isEmpty())
        {
            sum = 0;
            int level = queue.size();
            for(int i=0; i<level; i++)
            {
                TreeNode curr = queue.poll();
                sum += curr.val;
                if(curr.left!= null)
                {
                    queue.offer(curr.left);
                }
                if(curr.right!= null)
                {
                    queue.offer(curr.right);
                }
            }
            pq.add(sum);
            if(pq.size() > k)
            {
                pq.poll();
            }
        }
        if(pq.size() < k) return -1;
        else return pq.peek();
    }
}   
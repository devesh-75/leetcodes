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
class Pair{
    TreeNode node;
    int row;
    int col;
    Pair(TreeNode node, int row, int col)
    {
       
        this.node = node;
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>>ans = new ArrayList<>();
        if(root == null)
        {
            return ans;
        }
        Queue<Pair> queue = new LinkedList<>();
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        queue.offer(new Pair(root, 0, 0));
        while(!queue.isEmpty())
        {
            Pair p = queue.poll();
            TreeNode curr = p.node;
            int row = p.row;
            int col = p.col;
            map.putIfAbsent(col, new TreeMap<>());
            map.get(col).putIfAbsent(row, new PriorityQueue<>());
            map.get(col).get(row).add(curr.val);
            if(curr.left != null)
            {
                queue.offer(new Pair(curr.left, row+1, col-1 ));
            }
            if(curr.right != null)
            {
                queue.offer(new Pair(curr.right, row +1, col+1));
            }
        }
        for(TreeMap<Integer, PriorityQueue<Integer>> list : map.values())
        {
            List<Integer> temp = new ArrayList<>(); 
            for (PriorityQueue<Integer> pq : list.values()) {
            while(!pq.isEmpty())
            {
                temp.add(pq.poll());
            }
            }
            ans.add(temp);
        }
        return ans;
    }
}
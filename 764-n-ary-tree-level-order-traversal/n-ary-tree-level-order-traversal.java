/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
        {
            return res;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            List<Integer>temp = new ArrayList<>();
            
            int level = queue.size();
            for(int i=0; i<level; i++)
            {
                Node n = queue.poll();
                temp.add(n.val); 
                queue.addAll(n.children);

            }
            res.add(temp);

        }
        return res;
    }
}
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
    public Map<TreeNode,TreeNode> parent=new HashMap<>();
    public void parent(TreeNode root,TreeNode par){
        if(root==null){
            return;
        }
        parent.put(root,par);
        parent(root.right,root);
        parent(root.left,root);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        parent(root,null);

        Queue<TreeNode> q=new LinkedList<>();
        HashSet<TreeNode> visited=new HashSet<>();
        q.offer(target);
        visited.add(target);
        int dis=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(dis==k) break;
            while(size-->0){
                TreeNode node=q.poll();
                if(node.left!=null && !visited.contains(node.left)){
                    visited.add(node.left);
                    q.offer(node.left);
                }
                if(node.right!=null && !visited.contains(node.right)){
                    visited.add(node.right);
                    q.offer(node.right);
                }
                TreeNode p=parent.get(node);
                if(p!=null && !visited.contains(p)){
                    visited.add(p);
                    q.offer(p);
                }
            }
            dis++;
        }
        List<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }
        return ans;
    }
}
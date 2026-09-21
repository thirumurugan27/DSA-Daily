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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans; 
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(q.peek()!=null && q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek()!=null && q.peek().right!=null) q.offer(q.peek().right);
                max=Math.max(q.poll().val,max);
            }
            ans.add(max);
        }
        return ans;
    }
}
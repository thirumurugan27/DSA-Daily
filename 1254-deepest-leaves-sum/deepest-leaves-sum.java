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
    public int deepestLeavesSum(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int ans=0;
        while(!q.isEmpty()){
            int n=q.size();
            ans=0;
            for(int i=0;i<n;i++){
                TreeNode peek=q.peek();
                if(peek!=null && peek.left!=null) q.add(peek.left);
                if(peek!=null && peek.right!=null) q.add(peek.right);
                ans+=q.poll().val;
            }
        }
        return ans;
    }
}
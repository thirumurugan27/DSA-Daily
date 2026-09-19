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
    public void invert(TreeNode root,TreeNode invert){
        if(root==null || root.left==null&&root.right==null) return;
        if(root.left!=null){
            invert.right=new TreeNode(root.left.val);
            invert(root.left,invert.right);
        }
        if(root.right!=null){
        invert.left=new TreeNode(root.right.val);
        invert(root.right,invert.left);
        }
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null || root.left==null&&root.right==null) return root;
        TreeNode invert=new TreeNode(root.val);
        invert(root,invert);
        return invert;
    }
}
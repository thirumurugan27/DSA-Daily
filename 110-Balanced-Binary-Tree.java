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
    int checkHeight(TreeNode r){
        if(r==null) return 0;
        int l=checkHeight(r.left);
        if(l==-1 ) return -1;
        int ri=checkHeight(r.right);
        if(ri==-1) return -1;
        if(Math.abs(l-ri)>1) return -1;
        return 1+Math.max(l,ri);
    }
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root)!=-1;
    }
}
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
    void addRight(TreeNode root,List<Integer> ans,int curDept){
        if(root==null) return;
        if(ans.size()==curDept) ans.add(root.val);
        addRight(root.right,ans,curDept+1);
        addRight(root.left,ans,curDept+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        addRight(root,ans,0);
        return ans;
    }
}
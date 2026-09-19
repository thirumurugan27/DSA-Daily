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
    public void dfs(TreeNode root,List<TreeNode> li){
        if(root==null) return;
        li.add(root);
        dfs(root.left,li);
        dfs(root.right,li);
    }
    public void flatten(TreeNode root) {
        if(root==null || root.left==null&&root.right==null) return;
        List<TreeNode> li=new ArrayList<>();
        TreeNode temp=root;
        dfs(temp,li);
        for(int i=1;i<li.size();i++){
            System.out.print(li.get(i).val+" ");
            root.left=null;
            root.right=li.get(i);
            root=root.right;
        }
    }
}
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
    public int count=0;
    public void dfs(TreeNode root,int target,List<Long> li){
        if(root==null) return;

        li.add((long)root.val);
        long sum=0;

        for(int i=li.size()-1;i>=0;i--){
            sum+=li.get(i);
            if(sum==target) count++;
        }
        dfs(root.left,target,li);
        dfs(root.right,target,li);
        li.remove(li.size()-1);
    }
    public int pathSum(TreeNode root, int target) {
        count=0;
        dfs(root,target,new ArrayList<>());
        return count;
    }
}
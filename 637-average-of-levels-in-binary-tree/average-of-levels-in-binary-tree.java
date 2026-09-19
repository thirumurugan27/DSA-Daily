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
    public void bfs(TreeNode root,List<Double> ans){
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            double avg=0;
            for(int i=0;i<n;i++){
                if(q.peek()!=null && q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek()!=null && q.peek().right!=null) q.offer(q.peek().right);
                avg+=q.poll().val;
            }
            ans.add(avg/n);
        }
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        bfs(root,ans);
        return ans;
    }
}
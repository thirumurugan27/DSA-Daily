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
    Map<Integer,Integer> map=new HashMap<>();
    public int max=0;
    public void preorder(TreeNode root){
        if(root==null) return;
        int val=root.val;
        int freq=map.getOrDefault(val,0)+1;
        map.put(val,freq);
        max=Math.max(max,freq);
        preorder(root.left);
        preorder(root.right);
    }
    public int[] findMode(TreeNode root) {
        preorder(root);
        System.out.println(max);
        List<Integer> li=new ArrayList<>();
        for (Integer key : map.keySet()) {
            if(map.get(key)==max){
                li.add(key);
            }
        }
        int[] ans=new int[li.size()];
        for(int i=0;i<li.size();i++){
            ans[i]=li.get(i);
        }
        return ans;
    }
}
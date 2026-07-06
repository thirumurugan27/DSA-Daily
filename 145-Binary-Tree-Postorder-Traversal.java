class Solution {

    void f(TreeNode root, List<Integer> ans) {
        if (root == null)
            return;

        f(root.left, ans);      
        f(root.right, ans);    
        ans.add(root.val);      
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        f(root, ans);
        return ans;
    }
}
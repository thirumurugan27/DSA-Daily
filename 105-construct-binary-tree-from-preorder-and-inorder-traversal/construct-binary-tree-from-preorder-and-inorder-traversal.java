class Solution {
    int idx = 0;
    Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return build(preorder, 0, inorder.length-1);
        
    }
    public TreeNode build(int[] preorder, int left, int right){
        if(left > right){
            return null;
        }

        int newVal = preorder[idx++];
        TreeNode node = new TreeNode(newVal);

        int index = map.get(newVal);
        node.left = build(preorder, left, index-1);
        node.right = build(preorder, index+1, right);
        return node;
    }
}
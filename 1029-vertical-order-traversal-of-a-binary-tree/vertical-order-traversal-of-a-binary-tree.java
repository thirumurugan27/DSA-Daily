class Solution {
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<int[]> list = new ArrayList<>();
        dfs(root,list,0,0);
        Collections.sort(list, (a,b) -> {
              if (a[0] != b[0]) return Integer.compare(a[0], b[0]);  
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);  
            return Integer.compare(a[2], b[2]); 
        });
        Map<Integer,List<Integer>> mp = new TreeMap<>();
        for(int ar[]: list ){
            mp.computeIfAbsent(ar[0], k -> new ArrayList<>()).add(ar[2]);
        }
        return new ArrayList<>(mp.values());

    }

    void dfs(TreeNode root, List<int[]> list, int row, int col){
        if(root==null)
            return;
        list.add(new int[]{col,row,root.val});
        dfs(root.left,list,row+1,col-1);
        dfs(root.right,list,row+1,col+1);
    }
}
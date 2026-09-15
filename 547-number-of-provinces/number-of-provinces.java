class Solution {
    public void dfs(int[][] graph,boolean[] vis,int st){
        vis[st]=true;
        Queue<Integer> q=new LinkedList<>();
        q.offer(st);
        while(!q.isEmpty()){
            int node = q.poll();
            for(int i=0;i<graph.length;i++){
                if(graph[node][i]==1 && !vis[i]){
                    q.offer(i);
                    vis[i]=true;
                }
            }
        }
    }
    public int findCircleNum(int[][] graph) {
        int n=graph.length,ans=0;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(graph,vis,i);
                ans++;
            }
        }
        return ans;
    }
}
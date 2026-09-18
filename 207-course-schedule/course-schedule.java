class Solution {

    public boolean dfs(int node, int[][] graph, int[] vis) {
        vis[node] = 1;

        for(int neighbour : graph[node]) {
            if(vis[neighbour] == 1) {
                return false;
            }

            if(vis[neighbour] == 0) {
                if(!dfs(neighbour, graph, vis)) {
                    return false;
                }
            }
        }

        vis[node] = 2;
        return true;
    }

    public boolean canFinish(int n, int[][] prerequisites) {

        int[][] graph = new int[n][];

        int[] count = new int[n];

        for(int[] p : prerequisites) {
            count[p[0]]++;
        }

        for(int i=0;i<n;i++) {
            graph[i] = new int[count[i]];
        }

        int[] index = new int[n];

        for(int[] p : prerequisites) {
            graph[p[0]][index[p[0]]++] = p[1];
        }

        int[] vis = new int[n];

        for(int i=0;i<n;i++) {
            if(vis[i] == 0) {
                if(!dfs(i,graph,vis)) {
                    return false;
                }
            }
        }

        return true;
    }
}
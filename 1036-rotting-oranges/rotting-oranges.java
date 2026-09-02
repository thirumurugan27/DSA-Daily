class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<List<Integer>> q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        int c=0;
        for(int i=0;i<m*n;i++){
            int good=0;
            for(int j=0;j<n;j++){
                for(int k=0;k<m;k++){
                    if(grid[j][k]==2){
                        List<Integer> li=new ArrayList<>();
                        li.add(j);
                        li.add(k);
                        q.offer(li);
                    }
                    if(grid[j][k]==1){
                        good++;
                    }
                }
            }
            if(good==0 || q.isEmpty()){
                break;
            }
            boolean rotted=false;
            while(!q.isEmpty()){
                
                List<Integer> li=q.poll();
                int row=li.get(0);
                int col=li.get(1);
                int l,r,u,d;
                l=col-1;
                r=col+1;
                u=row-1;
                d=row+1;
                if(l >= 0 && grid[row][l] == 1){
                    grid[row][l] = 2;
                    rotted = true;
                }
                if(r < m && grid[row][r] == 1){
                    grid[row][r] = 2;
                    rotted = true;
                }
                if(u >= 0 && grid[u][col] == 1){
                    grid[u][col] = 2;
                    rotted = true;
                }
                if(d < n && grid[d][col] == 1){
                    grid[d][col] = 2;
                    rotted = true;
                }
            }
            if(rotted){
                c++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return c;
    }
}
class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        // int[][] mat=new int[n][n];
        // int num=0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         mat[i][j]=num++;
        //     }
        // }
        int row=0,col=0;
        for(String s:commands){
            if(s.equals("DOWN")){
                row++;
            }
            else if(s.equals("UP")){
                row--;
            }
            else if(s.equals("LEFT")){
                col--;
            }
            else if(s.equals("RIGHT")){
                col++;
            }
        }
        return row*n + col;
    }
}
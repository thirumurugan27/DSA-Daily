1class Trio{
2    int dist,x,y;
3    Trio(int dist,int x,int y){
4        this.x=x;
5        this.y=y;
6        this.dist=dist;
7    }
8}
9class Solution {
10    public int[][] kClosest(int[][] points, int k) {
11        PriorityQueue<Trio> q= new PriorityQueue<>((a,b)->{
12            return b.dist-a.dist;
13        });
14        int n=points.length;
15        for(int i=0;i<n;i++){
16            int x1=points[i][0];
17            int y1=points[i][1];
18            int dist=x1*x1+y1*y1;
19            q.add(new Trio(dist,x1,y1));
20            if(q.size()>k) q.poll();
21        }
22        int i=0;
23        int[][] ans=new int[k][2];
24        while(q.size()>0){
25            Trio temp= q.poll();
26            ans[i][0] = temp.x;
27            ans[i][1] = temp.y;
28            i++;
29        }
30        return ans;
31    }
32}
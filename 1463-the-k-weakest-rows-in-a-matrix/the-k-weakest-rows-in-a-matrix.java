class Pair{
    int sc;
    int ind;
    public Pair(int sc,int ind){
        this.sc=sc;
        this.ind=ind;
    }
}
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->{
            if(a.sc!=b.sc){
                return Integer.compare(a.sc,b.sc);
            }
            else{
                return Integer.compare(a.ind,b.ind);
            }
        });
        for(int i=0;i<mat.length;i++){
            int cnt=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    cnt++;
                }
            }
            pq.add(new Pair(cnt,i));
        }
        int []ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll().ind;
        }
        return ans;  
    }
}
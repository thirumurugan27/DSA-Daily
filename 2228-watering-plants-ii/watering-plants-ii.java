class Solution {
    public int minimumRefill(int[] p, int ca, int cb) {                
        int refill= 0,oca =  ca, ocb =  cb;
        int i=0, j = p.length-1; 
        while(i<=j){
             if(i==j){
                if(ca>=cb){
                   if(p[i]>ca){
                        refill++;
                    }                         
                }
                 else{                                      
                      if(p[j]>cb){
                        refill++;                        
                    }                     
                 } 
                 break; 
            }
            if(p[i]>ca){
                refill++;
                ca =  oca;
            }            
            if(p[j]>cb){
                refill++;
                cb=  ocb;
            }
            ca-=p[i] ;                                  
            cb-=p[j]; 
			i++;           
            j--;			                                                
        }
        return refill;                
    }
}
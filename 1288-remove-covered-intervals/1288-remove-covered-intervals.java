class Solution {
    public int removeCoveredIntervals(int[][] inte) {

                 Arrays.sort(inte,(a,b) ->{
                    if(a[0]!=b[0]){
                        return a[0]-b[0];
                    }
                    return b[1]-a[1];
                 } );

                 int n=inte.length;
                 int l=inte[0][0];
                 int h=inte[0][1];
                 for(int i=1;i<inte.length;i++){
                    if(inte[i][0]==l || inte[i][1]<=h){
                        n--;
                    }
                    else{
                        l=inte[i][0];
                        h=inte[i][1];
                    }

                 }


                 return n; 
         
                      
        
        
    }
}
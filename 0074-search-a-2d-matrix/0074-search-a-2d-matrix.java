class Solution {
    public boolean searchMatrix(int[][] mat, int target) {


        boolean found = false;
        int n=mat.length , m=mat[0].length , l=0,rig=n*m-1;

        while(l<=rig){
            int mid=l+(rig-l)/2;

          int r=mid/m;
          int c=mid%m;

          if(mat[r][c]==target){
            return true;
          }
          if(mat[r][c]<target){
            l=mid+1;
          }
          else{
            rig=mid-1;
          }
        }

        return false;
       
   
        
 

    }}
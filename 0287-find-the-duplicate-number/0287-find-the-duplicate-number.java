class Solution {
    public int findDuplicate(int[] nums) {
    int r=nums.length, l=1;

   

    while(l<r){
        int mid=l+(r-l)/2;
         int cou=0;

        for(int num:nums){
            if( num<=mid){
                cou++;
            }
        }
        if(cou>mid){
            r=mid;
        }
        else{
            l=mid+1;
        } 


  
    }
    
        return l;
    }
}
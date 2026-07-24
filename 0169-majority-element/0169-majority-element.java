class Solution {
    public int majorityElement(int[] nums) {

       

        int cou=0 , can=0;

        for(int n:nums){
            if(cou==0){
                can=n;

            }
            cou+= (n==can)? 1:-1;
        
              
            
        }
          

        return can;

        
    }
}
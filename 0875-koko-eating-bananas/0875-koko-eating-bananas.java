class Solution {
    long time(int [] piles, int h){
    long hrs=0;

        for(int i=0;i<piles.length;i++){
            hrs+=Math.ceil((double)piles[i]/h);
        }
        return hrs;
    }                
    public int minEatingSpeed(int[] piles, int h) {

        int l=1 , r=(int) 1e9;

        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;

            long hrs=time(piles,mid);
            if(hrs<=h){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
        
    }
}
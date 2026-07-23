class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {

        int [] res=new int[n];

        for(int [] bo:bookings){
            int a=bo[0]-1;
            int b=bo[1]-1;
            int c=bo[2];
            for(int i=a;i<=b;i++){
                res[i]+=c;
            }

        }
        return res;
        
    }
}
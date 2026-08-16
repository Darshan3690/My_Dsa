class Solution {
    boolean leep(int y){
        return ((y%4==0 && y%100!=0)|| (y%400==0));


    }
    public int dayOfYear(String date) {

        int [] days={31,28,31,30,31,30,31,31,30,31,30,31};
        int y=Integer.parseInt(date.substring(0,4));
        int m=Integer.parseInt(date.substring(5,7));
        int d=Integer.parseInt(date.substring(8,10));

        if(leep(y)){
            days[1]=29;
        }
         int totald=0;
                for(int i=0;i<m-1;i++){
                    totald+=days[i];

                }
                totald+=d;

                return totald;


        
        
    }
}
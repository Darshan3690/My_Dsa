// class Solution {
//     public int romanToInt(String s) {
//         int n=s.length();
        
//         int res=0;
//         for(int i=n-1;i>=0;i--){
//             if(s.charAt(i)=='I'){
//                 res+=1;
//             }
//              if(s.charAt(i)=='V' && s.charAt(i-1)=='I'){
//                 res+=4;

//             }

//             if(s.charAt(i)=='V'){
//                 res+=5;
//             }
//             if(s.charAt(i)=='X'){
//                 res+=10;
//             }
//             if(s.charAt(i)=='L'){
//                 res+=50;
//             }
//             if(s.charAt(i)=='C'){
//                 res+=100;
//             }
//             if(s.charAt(i)=='D'){
//                 res+=500;
//             }
//             if(s.charAt(i)=='M'){
//                 res+=1000;
//             }
           

//         }
//         if(s.equals("MCMXCIV")){
//             return 1994;
//         }

//         return res;

        
//     }
// }
class Solution {
    public int romanToInt(String s) {
        
        int res=0;
        int nums=0;
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){

                case'I':nums=1;break;
                case'V':nums=5;break;
                case'X':nums=10;break;
                case'L':nums=50;break;
                case'C':nums=100;break;
                case'D':nums=500;break;
                case'M':nums=1000;break;
                
                
            }
            if(nums*3< res){
                res-=nums;

            }
            else{
                res+=nums;
            }
        }
        return res;
    }
    public static void main (String arge[])
    {
        Solution s=new Solution();
       s.romanToInt("III");
    }
}
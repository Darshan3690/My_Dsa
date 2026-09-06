class Solution {
    public String addStrings(String num1, String num2) {


        int n=num1.length()-1 , m=num2.length()-1;

        int i =n,j=m , carr=0;
          StringBuilder res=new StringBuilder();

        while(i>=0 || j>=0 || carr!=0){
           int   sum=carr;

            if(i>=0){
                sum+=num1.charAt(i)-'0';
            }
            i--;
            if(j>=0){
                sum+=num2.charAt(j)-'0';
            }
            j--;
            
            res.append(sum%10);
            carr=sum/10;

        }
        

        return  res.reverse().toString();

        // int num = Integer.parseInt(num1);
        // int nu=Integer.parseInt(num2);

        // int sum=num+nu;


        // return String.valueOf(sum);
    }
}
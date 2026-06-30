class Solution {
    public boolean rotateString(String s, String goal) {

int n= s.length();
if(s.length() < goal.length()){
return false;
}
 
  String doublestr = s+s;
for (int i = 0; i < n; i++) {
            
            String str = doublestr.substring(i, i + n);
            if (str.equals(goal)) {
                return true;
            }
        }
        return false;
    }}
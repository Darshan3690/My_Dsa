class Solution {
    public int lengthOfLastWord(String s) {

        int n=s.length(); 
        int e=n-1, st=0;
        while(e>=0&& s.charAt(e)==' '){
            e--;

        }
        st=e;
        while(st>=0 && s.charAt(st)!=' '){
            st--;

        }
        return e-st;
        

        
    }
}
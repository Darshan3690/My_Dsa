class Solution {
    public int characterReplacement(String s, int k) {

        int n=s.length();
        int [] freq=new int [26];
        int l=0 , maxf=0, maxw=0;

        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'A']++;


                maxf=Math.max(freq[s.charAt(i)-'A'],maxf);
        int winl=i-l+1;

        if(winl-maxf>k){
            freq[s.charAt(l)-'A']--;
            l++;
        }
        winl=i-l+1;
        maxw=Math.max(maxw,winl);
        }

        return maxw;

        
    }
}
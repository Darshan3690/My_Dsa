class Solution {
    public String minWindow(String s, String t) {

        int [] maps=new int[256];
        int [] mapt=new int[256];

        for(char c:t.toCharArray()){
            mapt[c]++;

        }
        int l=0,r=0,minlen=Integer.MAX_VALUE , minstart=0;
        for(;r<s.length();r++)
        {

            maps[s.charAt(r)]++;
            while(contains(maps,mapt)){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    minstart=l;
                }
                maps[s.charAt(l++)]--;
            }
            
        }
        return minlen==Integer.MAX_VALUE ?"":s.substring(minstart,minstart+minlen);
    }
    private boolean contains(int [] maps,int [] mapt){
        for(int i=0;i<256;i++){
            if(mapt[i]>maps[i]){
                return false;
            }
            
        }
        return true;
    }
    
}
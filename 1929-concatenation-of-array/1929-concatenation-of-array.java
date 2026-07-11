class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;

        int [] ans=new int[n+n];
        int m=ans.length;

    for(int i=0;i<n;i++){
        ans[i]=nums[i];

    }
     for (int i = n; i < m; i++) {
    ans[i] = nums[i - n];
}
    
    return ans;

                
        
    }
}
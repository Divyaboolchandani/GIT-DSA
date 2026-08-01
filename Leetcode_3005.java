class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        int freq[]=new int [101];
        for (int num:nums){
            freq[num]++;
        }
        int max=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>max){
                max=freq[i];
            }
        }
        int ans=0;
        for(int f:freq){
            if(f==max){
                ans+=f;
            }
        }
        return ans;
    }
}


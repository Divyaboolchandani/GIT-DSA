class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int result[]=new int[2*n];
        for(int i=0;i<n;i++){
            result[i]=nums[i];
        }
        for(int j=n-1;j>=0;j--){
            result[n]=nums[j];
            n++;
        }
        return result;
    }
}
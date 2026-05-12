class Solution {
    public int[] sortedSquares(int[] nums) {
        int result[]=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int k=result.length-1;
        while(i<=j){
            if(nums[i]*nums[i]>=nums[j]*nums[j]){
                result[k--]=nums[i]*nums[i];
                i++;
            }else{
                result[k--]=nums[j]*nums[j];
                j--;
            }
        }
        return result;
    }
}
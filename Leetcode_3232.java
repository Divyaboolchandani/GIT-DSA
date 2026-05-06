class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumS=0;
        int sumD=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9){
                sumS+=nums[i];
            }else{
                sumD+=nums[i];
            }
        }
        if(sumS>sumD||sumS<sumD){
            return true;
        }
        return false;
    }
}
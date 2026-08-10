class Solution {
    public int minElement(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int n=nums[i];
            while(n>0){
            int x=n%10;
            sum+=x;
            n=n/10;
            nums[i]=sum;
        }
        }
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}
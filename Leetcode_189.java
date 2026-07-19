class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
        int m=0;
        int n=k-1;
        while(m<=n){
            int temp=nums[m];
            nums[m]=nums[n];
            nums[n]=temp;
            m++;
            n--;
        }
        int z=k;
        int y=nums.length-1;
        while(z<=y){
            int tem=nums[z];
            nums[z]=nums[y];
            nums[y]=tem;
            z++;
            y--;
        }
    }
}
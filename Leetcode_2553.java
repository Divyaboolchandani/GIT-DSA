class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList <Integer> al=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            int x=nums[i];
            while(x>0){
                int ld=x%10;
                al.add(ld);
                x=x/10;
            }
        }
        int arr[]=new int[al.size()];
        int k=0;
        for(int j=al.size()-1;j>=0;j--){
            arr[k++]=al.get(j);
        }
        return arr;
    }
}

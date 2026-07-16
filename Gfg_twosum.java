class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        // code here
        ArrayList <Integer> al =new ArrayList<>();
        if(arr.length==1){
            al.add(-1);
            al.add(-1);
            return al;
        }
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if(arr[l]+arr[r]==target){
                al.add(l+1);
                al.add(r+1);
                return al;
            }else if(arr[l]+arr[r]>target)
            {
                r=r-1;
            }else{
                l=l+1;
            }
        }
        al.add(-1);
        al.add(-1);
        return al;
    }
}
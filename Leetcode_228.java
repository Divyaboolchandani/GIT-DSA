class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList <String> list=new ArrayList<>();
        if(nums.length==0){
            return list;
        }
        int i=0;
        int j=1;
        int k=0;
        while(j<nums.length){
            if(nums[j]==nums[i]+1){
                j++;
                i++;
            }
            else{
                if(k==j-1){
                    list.add(Integer.toString(nums[k]));
                }else{
                list.add( nums[k]+ "->" +nums[j-1] );
                }
                k=j;
                i=j;
                j++;
            }
        }
        if(k==nums.length-1){
            list.add(Integer.toString(nums[k]));
        }else{
            list.add(nums[k]+"->"+nums[nums.length-1]);
        }
        return list;
    }
}
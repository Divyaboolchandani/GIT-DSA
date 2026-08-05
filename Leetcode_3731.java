class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> result=new ArrayList<>();
        int max=0;
        int min=100;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            min=Math.min(min,num);
            max=Math.max(max,num);
            set.add(num);
        }
        for(int i=min+1;i<max;i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}
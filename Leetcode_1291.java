class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> list=new ArrayList<>();
        String val="123456789";
        int minlen=String.valueOf(low).length();
        int maxlen= String.valueOf(high).length();
        for(int i=minlen;i<=maxlen;i++){
            for(int j=0;j+i<=val.length();j++){
                int num=Integer.parseInt(val.substring(j,i+j));
                if(num<=high&&num>=low){
                    list.add(num);
                }
            }
        }
        return list;
    }
}
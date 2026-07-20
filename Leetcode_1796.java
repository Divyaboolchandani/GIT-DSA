class Solution {
    public int secondHighest(String s) {
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(char c:s.toCharArray()){
            if(c>=48 &&c<=57){
                if(c>max){
                    max2=max;
                    max=c;
                }
                else if(c>max2 && c!=max){
                    max2=c;
                }
            }
        }
        if(max2==Integer.MIN_VALUE){
            return -1;
        }
        max2=max2-'0';
        
        return max2;
    }
}

class Solution {
    public int alternateDigitSum(int n) {
        ArrayList <Integer> digit=new ArrayList<>();
        int sum=0;
        while(n>0){
            int ld=n%10;
            digit.add(ld);
            n=n/10;
        }
        Collections.reverse(digit);
        sum+=digit.get(0);
        for(int i=1;i<digit.size();i++){
            if(i%2==0){
                sum+=digit.get(i);
            }else{
                sum-=digit.get(i);
            }
        }
        return sum;
    }
}

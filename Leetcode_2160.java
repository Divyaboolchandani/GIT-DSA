class Solution {
    public int minimumSum(int num) {
        ArrayList <Integer> digit=new ArrayList<>();
        int n=num;
        while(n>0){
            int ld=n%10;
            digit.add(ld);
            n=n/10;
        }
        Collections.sort(digit);
        int new1=digit.get(0)*10+digit.get(2);
        int new2=digit.get(1)*10+digit.get(3);
        return new1+new2;
    }
}
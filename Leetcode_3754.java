class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        int x=0;
        int place=1;
        while(n>0){
            int ld=n%10;
            if(ld!=0){
                x+=ld*place;
                place *=10;
                sum+=ld;
            }
            n/=10;
        }
        return 1l*x*sum;
    }
}
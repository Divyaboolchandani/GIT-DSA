class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int result=0;
        int no=n;
       while(n!=0){
           int ld=n%10;
           result+=Math.pow(ld,3);
           n=n/10;
       }
       if(no==result){
           return true;
       }else{
       return false;
    }
    }
}

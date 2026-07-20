class Solution {
    static boolean isPrime(int n) {
        // code here
        int m=n/2;
        for(int i=2;i<=m;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
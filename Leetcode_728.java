class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
      ArrayList<Integer> al=new ArrayList<>();
      for(int i=left;i<=right;i++){
        if(sdn(i)){
            al.add(i);
        }
      }
      return al;
    }
    public static boolean sdn(int num){
        int temp=num;
        while(temp>0){
            int d=temp%10;
            if(d==0||num%d!=0){
                return false;
            }
            temp/=10;
        }
        return true;
    }
}
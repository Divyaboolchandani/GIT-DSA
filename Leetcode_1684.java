class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
          int count=0;
          HashSet<Character>set=new HashSet<>();
          for(char c:allowed.toCharArray()){
            set.add(c);
          }
          for(String w:words){
            boolean b=true;
          for(char d:w.toCharArray()){
            if(!set.contains(d)){
                b=false;
                break;
            }
          }
          if(b){
             count++;
          }
          }
          return count;
    }
}
class Solution {
    public boolean equalFrequency(String word) {
        int freq[]=new int[26];
        for(int i=0;i<word.length();i++){
            freq[word.charAt(i)-'a']++;
        }
       
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0){
                continue;
            }
            freq[i]--;
         boolean valid=true;
        int count=0;
        for(int val:freq){
            if(val==0){
              continue;
            }
             if(count==0){
                count=val;
            }
            else if(val!=count){
                valid=false;
                break;
            }
        }
        freq[i]++;
             if(valid){
            return true;
        }
        }
   
        return false;
    }
}
class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int maxVowel=0;
        int maxCon=0;
        for(char c:map.keySet()){
            if("aeiou".indexOf(c)!=-1){
                maxVowel=Math.max(maxVowel,map.get(c));
            }else{
                maxCon=Math.max(maxCon,map.get(c));
            }
        }
        return maxVowel+maxCon;
    }
}
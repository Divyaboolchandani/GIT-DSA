class Solution {
    public String trimTrailingVowels(String s) {
        String result="";
        int c=-1;
        if(s.charAt(s.length()-1)!='a'&& s.charAt(s.length()-1)!='e'
        &&s.charAt(s.length()-1)!='i'&&
            s.charAt(s.length()-1)!='o'&&s.charAt(s.length()-1)!='u'){
                return s;
            }

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!='a'&& s.charAt(i)!='e'&&s.charAt(i)!='i'&&
            s.charAt(i)!='o'&&s.charAt(i)!='u'){
                c=i;
                break;
            }
        }
        for(int i=0;i<=c;i++){
            result+=s.charAt(i);
        }
        return result;
    }
}
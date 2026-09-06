class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n<3){
            return false;

        }
        int vowels=0;
        int cons=0;
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                if("aeiouAEIOU".indexOf(c)!=-1){
                    vowels++;
                }
                else{
                    cons++;
                }
            }    
            else if(!Character.isDigit(c)){
                return false;
            }
        }
        return vowels >=1 &&cons>=1;
    }
}
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        String result= "";
        for(int k=0; k<str1.length(); k++){
            {
            result+= str1.charAt(k);
            result+= str2.charAt(k);
            }
            
        }
        return result;
    }
}
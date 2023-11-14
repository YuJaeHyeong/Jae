class Solution {
    public String solution(String s, int n) {
        String ascii = "";
        char[] arr = s.toCharArray();
        for (char cha : arr){
            if (Character.isUpperCase(cha)){
                cha = (char) (((cha - 'A' + n) % 26 + 'A'));
            }else if (Character.isLowerCase(cha)){
                cha = (char) (((cha - 'a' + n) % 26 + 'a'));
            }
            ascii += cha;
        }
        return ascii;
    }
}
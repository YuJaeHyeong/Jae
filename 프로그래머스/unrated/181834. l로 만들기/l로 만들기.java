class Solution {
    public String solution(String myString) {
        StringBuilder stringBuilder = new StringBuilder(myString);
        for (int i=0;i<myString.length();i++){
            if(myString.charAt(i)<108){
                stringBuilder.setCharAt(i,'l');
            }
        }
        return String.valueOf(stringBuilder);
    }
}
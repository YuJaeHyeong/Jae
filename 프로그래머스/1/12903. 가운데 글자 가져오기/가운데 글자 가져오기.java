class Solution {
    public String solution(String s) {
        String answer = "";
        int size = s.length();
        if(size%2 == 0){
            return s.substring((int) Math.floor((double) (size/2)-1),(int) Math.ceil((double) size/2)+1);
        }
        if(size%2 != 0){
            return String.valueOf(s.charAt(size/2));
        }
        return answer;
    }
}
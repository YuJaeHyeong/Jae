class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        String t1 = "";
        for (int i = 0 ; i<k; i++){
            t1+= my_string;
        }
        my_string = t1;
        return my_string;
    }
}
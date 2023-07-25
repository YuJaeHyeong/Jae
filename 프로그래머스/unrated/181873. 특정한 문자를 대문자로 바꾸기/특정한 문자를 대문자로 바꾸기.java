class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        if(my_string.contains(alp)){
            answer = alp.toUpperCase();
            my_string = my_string.replace(alp,answer);
                
        }
        return my_string;
    }
}
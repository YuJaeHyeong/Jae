import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String test = String.valueOf(n);
        for (int i=0;i<test.length();i++){
            answer += Integer.parseInt(String.valueOf(test.charAt(i)));
        }
        return answer;
    }
}
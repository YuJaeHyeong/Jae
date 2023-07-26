import java.util.regex.*;
class Solution {
    public int solution(String myString, String pat) {
           Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(myString);

        int count = 0;
        int lastIndex = 0;

        while (matcher.find(lastIndex)) {
            count++;
            lastIndex = matcher.start() + 1;
        }

        return count;
    }
    
}
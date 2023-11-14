import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();

        List<Character> lowerList = new ArrayList<>();
        List<Character> upperList = new ArrayList<>();

        for (char c : chars) {
            if (Character.isLowerCase(c)) {
                lowerList.add(c);
            } else if (Character.isUpperCase(c)) {
                upperList.add(c);
            }
        }

        Collections.sort(lowerList, Collections.reverseOrder());
        Collections.sort(upperList, Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        for (char c : lowerList) {
            result.append(c);
        }
        for (char c : upperList) {
            result.append(c);
        }

        return result.toString();
    }
}

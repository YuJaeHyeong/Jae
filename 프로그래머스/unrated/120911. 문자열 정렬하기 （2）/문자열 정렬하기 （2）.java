import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        List<Character> list = new ArrayList<>();
        char[] ch = myString.toCharArray();
        for(char c : ch) {
            list.add(c);
        }
        Collections.sort(list);
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : list){
            stringBuilder.append(c);
        }
        return String.valueOf(stringBuilder);
    }
}
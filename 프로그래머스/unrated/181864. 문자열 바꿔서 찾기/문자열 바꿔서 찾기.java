class Solution {
    public int solution(String myString, String pat) {
        String a = myString.replace("A","X"); 
        String b = a.replace("B","A");
        String c = b.replace("X", "B");
        if(c.contains(pat)){
            return 1;
        }
        return 0;
    }
}
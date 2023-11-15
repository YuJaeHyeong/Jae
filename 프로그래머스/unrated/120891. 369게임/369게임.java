class Solution {
    public long solution(long order) {
        long answer = 0;
        String test = Long.toString(order);
        for(int i=0;i<test.length();i++){
            if(test.charAt(i)=='3'){
                answer++;
            }
            if(test.charAt(i)=='6'){
                answer++;
            }
            if(test.charAt(i)=='9'){
                answer++;
            }
        }
        return answer;
    }
}
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i : arr){
            answer+= i;
        }
        double avg = answer/arr.length;
        return avg;
    }
}
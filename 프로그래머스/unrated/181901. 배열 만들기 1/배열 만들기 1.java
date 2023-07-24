class Solution {
    public int[] solution(int n, int k) {
        int av = n/k;
        int[] answer = new int[av];
        
        for(int i = 0; i < av; i++) 
            answer[i] = k * (i + 1);
                
        return answer;
    }
}

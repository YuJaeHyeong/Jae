class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int k=0; k<=n; k++){
            if(k%2==0){
                answer+=k;
            }
        }
        return answer;
    }
}
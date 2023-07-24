class Solution {
    public int solution(int a, int b) {
   int answer = 0;
    String case_1 = Integer.toString(a)+Integer.toString(b);
    int case_2 = 2*a*b;
    if(Integer.parseInt(case_1) == case_2)	return Integer.parseInt(case_1);
    if(Integer.parseInt(case_1)<case_2) return case_2;
    if(Integer.parseInt(case_1)>case_2) return Integer.parseInt(case_1);
    return answer;
    }
}
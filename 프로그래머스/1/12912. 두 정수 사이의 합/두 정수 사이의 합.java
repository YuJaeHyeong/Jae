class Solution {
    public long solution(long a, long b) {
        long answer = 0;
        if(a > b){
            return type1(a,b);
        }
        if(a < b){
            return type1(b,a);
        }
        if(a==b){
            return a;
        }
        return answer;
    }
    public long type1 (long bigger, long smaller){
        long sum = 0;
        for (long i = smaller; i<=bigger ; i++){
            sum += i;
        }
        return sum;
    }
}
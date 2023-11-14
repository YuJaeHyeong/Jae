class Solution {
    public boolean solution(int x) {
        int sum = 0;
        if(x>=1 && x<10000) {
            String test = String.valueOf(x);
            for(int i=0; i<test.length();i++){
                sum += Integer.parseInt(String.valueOf(test.charAt(i)));
            }
            return x % sum != 0 ? false : true;
        }
        return false;
    }
}
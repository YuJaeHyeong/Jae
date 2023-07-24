class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strPlus1 = Integer.toString(a)+Integer.toString(b);
        String strPlus2 = Integer.toString(b)+Integer.toString(a);
        if(Integer.parseInt(strPlus1)==Integer.parseInt(strPlus2)) return Integer.parseInt(strPlus1);
         if(Integer.parseInt(strPlus1)<Integer.parseInt(strPlus2)) {
    	return Integer.parseInt(strPlus2);
    }
         if((Integer.parseInt(strPlus1)>Integer.parseInt(strPlus2))) {
    	return Integer.parseInt(strPlus1);
    }
        return answer;
    }
}
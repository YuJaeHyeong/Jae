class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char w = 'w';
    	char s =  's';
    	char d = 'd';
    	char a = 'a';
    	for(int k=0; k<control.length();k++) {
    		if(w == control.charAt(k)) {n+=1;}
    		if(s == control.charAt(k)) {n-=1;}
    		if(d == control.charAt(k)) {n+=10;}
    		if(a == control.charAt(k)) {n-=10;}
    	}
        return n;
    }
}
class Solution {
    boolean solution(String s) {
        char[] arr= s.toLowerCase().toCharArray();
        int p = 0;
        int y = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 'p'){
                p++;
            }
            if(arr[i] == 'y'){
                y++;
            }
        }
        boolean b = p == y ? true : false;
        return b;
    }
}
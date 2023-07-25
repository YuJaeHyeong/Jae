class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int h = 0;
        int h1 = 0;
        for(int k=0;k<num_list.length;k++){
            if(k%2!=0){
                h+=num_list[k];
            }
            if(k%2==0)
            {
                h1 +=num_list[k];
            }
        }
        if(h>h1)
        {
            return h;
        }
        return h1;
    }
}
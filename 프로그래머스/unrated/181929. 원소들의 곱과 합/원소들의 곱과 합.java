import java.lang.reflect.Array;
import java.util.Arrays;
class Solution {
    public int solution(int[] num_list) {
    	int sum = Arrays.stream(num_list).sum();
        sum *=sum;//합의 제곱
        int all = Arrays.stream(num_list).reduce(1,(a,b) ->a*b);
        if(sum>all)
        {
            return 1;
        }
        return 0;
    }
}
        
    


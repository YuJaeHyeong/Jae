class Solution {
    public int solution(int n) {
        int answer = 0;
        int result =0;
    
        
        if(n%2!=0)
        {
            for(int k=0; k<=n; k++){
                if(k%2!=0){
                    result +=k;      
                }
                if(k%2==0){
                 continue;
                }
            }
        }
        if(n%2==0){
            for(int k=0; k<=n; k++){
                if(k%2==0){
                    result += k*k;
                }
                 if(k%2!=0){
                 continue;
                }
            }
        }
        
 return result;
    }
}

import java.math.BigDecimal;
import java.math.*;
class Solution {
    public String solution(String a, String b) {
      BigDecimal bigDecimal1 = new BigDecimal(a);  
      BigDecimal bigDecimal2 = new BigDecimal(b);       
      BigDecimal bigDecimal3 = bigDecimal1.add(bigDecimal2);
    String result = bigDecimal3.toString();
        return result;
    }
}
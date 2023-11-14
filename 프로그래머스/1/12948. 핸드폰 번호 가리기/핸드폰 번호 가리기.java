class Solution {
    public String solution(String phone_number) {
        StringBuffer stringBuffer = new StringBuffer(phone_number);
        String lastNumber = stringBuffer.reverse().toString().substring(0,4);
        String firstNumber = phone_number.substring(0,phone_number.length()-lastNumber.length()).replaceAll("[0-9]","*");
        StringBuffer stringBuffer1 = new StringBuffer(lastNumber);
        String lastNumber1 = stringBuffer1.reverse().toString();
        return firstNumber + lastNumber1;
    }
}
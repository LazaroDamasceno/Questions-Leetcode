import java.math.BigInteger;
import java.util.stream.*;

class Solution {
    public int[] plusOne(int[] digits) {
        int lastDigit = digits[digits.length-1];
        if (lastDigit <= 8) {
        	return lastDigitIsSmallerThanNine(digits);
        }
        return lastDigitIsBiggerThanNine(digits);
    }
    
    private int[] lastDigitIsSmallerThanNine(int[] digits) {
    	digits[digits.length-1] = digits[digits.length-1] + 1;
    	return digits;
    }
    
    private int[] lastDigitIsBiggerThanNine(int[] digits) {
    	StringBuilder sb = new StringBuilder();
    	IntStream.of(digits).forEach(e -> sb.append(e));
    	BigInteger bi = new BigInteger(sb.toString());
    	bi = bi.add(BigInteger.ONE);
    	return Stream.of(bi.toString().split("")).mapToInt(e -> Integer.parseInt(e)).toArray();
    }
}

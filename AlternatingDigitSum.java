import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int alternateDigitSum(int n) {
    	Integer intToInteger = Integer.valueOf(n);
    	String integerToString = intToInteger.toString();
    	String[] stringToArrayStrings = integerToString.split("");
        int[] digits = Arrays.stream(stringToArrayStrings).mapToInt(e -> Integer.parseInt(e)).toArray();
        for (int i = 0; i < digits.length; i++) {
			if (i % 2 != 0) digits[i] = -digits[i];
		}
        return IntStream.of(digits).sum();
    }
}

class Solution {
    public static int addDigits(int num) {
        while (num >= 10) {
        	int sumDigits = Arrays
        			.stream(
        					Integer
        					.valueOf(num)
        					.toString()
        					.split("")
        			)
        			.mapToInt(e -> Integer.parseInt(e))
        			.sum();
        	num = sumDigits;
        }
        return num;
    }
}

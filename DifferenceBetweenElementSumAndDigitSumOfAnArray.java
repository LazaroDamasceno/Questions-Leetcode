class Solution {
	
	public int differenceOfSum(int[] nums) {
		return Math.abs(sumNumbers(nums) - sumDigits(nums));
	}
	
	public int sumNumbers(int[] nums) {
		return IntStream.of(nums).sum();
	}
	
	public int sumDigits(int[] nums) {
		int accumulator = 0;
		List<Integer> digits;
		for (int i = 0; i < nums.length; i++) {
			accumulator += Arrays
					.stream(
							Integer
							.valueOf(nums[i])
							.toString()
							.split("")
					)
					.mapToInt(e -> Integer.parseInt(e))
					.sum();
		}
		return accumulator;
	}
	
}

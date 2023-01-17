class Solution {
	
	public int differenceOfSum(int[] nums) {
		var sumNumbers = IntStream.of(nums).sum();
		int accumulator = 0;
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
		return sumNumbers - accumulator;
	}
	
}

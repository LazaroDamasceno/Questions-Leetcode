class Solution {
    public static int singleNumber(int[] nums) {
    	Arrays.sort(nums);
    	List<Integer> numbers = Arrays.stream(nums).boxed().collect(Collectors.toList());
    	for (int i = 0; i < nums.length-2; i++) {
			if (nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) {
				numbers.set(i, null);
				numbers.set(i+1, null);
				numbers.set(i+2, null);
			}
		}
    	numbers.removeIf(e -> e == null);
    	return numbers.get(0);
    }
}

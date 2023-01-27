class Solution {
    public static int[] runningSum(int[] nums) {
    	List<Integer> numbers = Arrays.stream(nums).boxed().collect(Collectors.toList());
    	int[] sums = new int[nums.length];
    	for (int i = 0; i < nums.length; i++) {
			sums[i] = numbers.subList(0, i+1).stream().reduce(0, (n1, n2) -> n1+n2);
		}
    	return sums;
    }
}

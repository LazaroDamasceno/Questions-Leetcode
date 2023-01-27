class Solution {
    public static int findKthLargest(int[] nums, int k) {
    	List<Integer> sequence = Arrays.stream(nums).boxed().collect(Collectors.toList());
    	Collections.sort(sequence);
    	Collections.reverse(sequence);
        return sequence.get(k-1);
    }
}

class Solution {
    public int missingNumber(int[] nums) {
        List<Integer> nums1 = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> nums2 = Arrays
                .stream(IntStream.rangeClosed(0, nums.length).toArray())
                .boxed()
                .collect(Collectors.toList());
        nums2.removeAll(nums1);
        return nums2.get(0);
    }
}

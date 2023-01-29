class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> nums1 = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> nums2 = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(nums1);
        Collections.sort(nums2);
        for (int i = 0; i < nums1.size()-1 ; i++) {
            if (nums1.get(i).equals(nums1.get(i+1))) {
                nums2.set(i, null);
                nums2.set(i+1, null);
            }
        }
        nums2.removeIf(e -> e == null);
        return nums2.get(0);
    }
}

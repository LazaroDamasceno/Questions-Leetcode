class Solution {
    public int findNumbers(int[] nums) {
        int counter = 0;
        for (Integer item : nums) {
            int length = (int) Arrays.stream(item.toString().split("")).toList().stream().count();
            if (length % 2 == 0) {
                ++counter;
            }
        }
        return counter;
    }
}

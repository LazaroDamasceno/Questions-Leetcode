class Solution {
    public int findGCD(int[] nums) {
        int max = IntStream.of(nums).max().getAsInt();
        int min = IntStream.of(nums).min().getAsInt();
        return getGCD(max, min);
    }
    
    public int getGCD(int max, int min) {
        while (max != min) {
            if (max > min) {
                max -= min;
            } else {
                min -= max;
            }
        }
        return max;
    }
}

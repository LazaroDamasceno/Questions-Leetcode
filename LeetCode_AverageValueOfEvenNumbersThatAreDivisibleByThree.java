class Solution {
    public static int averageValue(int[] nums) {
        try {
            return (int) IntStream.of(nums).filter(e -> e%3==0 && e%2==0).average().getAsDouble();
        } catch (Exception e) {
            return 0;
        }
    }
}

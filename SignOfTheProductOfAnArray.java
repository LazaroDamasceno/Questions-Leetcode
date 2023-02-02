class Solution {
    public int arraySign(int[] nums) {
        if (Arrays.stream(nums).filter(e -> e == 0).count() > 0) {
            return 0;
        } else if (Arrays.stream(nums).filter(e -> e < 0).count() % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }
}

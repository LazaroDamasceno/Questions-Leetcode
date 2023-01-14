class Solution {
    public static int finalValueAfterOperations(String[] operations) {
        int increaseOps = (int)Arrays.stream(operations).filter(e -> e.equals("++X") || e.equals("X++")).count();
        int decreaseOps = (int)Arrays.stream(operations).filter(e -> e.equals("--X") || e.equals("X--")).count();
        return increaseOps - decreaseOps;
    }
}

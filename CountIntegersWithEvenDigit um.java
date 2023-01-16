class Solution {
    public static int countEven(int num) {
        int counter = 0;
        int[] range = IntStream.rangeClosed(1, num).toArray();
        for (Integer item : range) {
            int sum_digits = Arrays.stream(item.toString().split("")).mapToInt(e -> Integer.parseInt(e)).sum();
            if (sum_digits % 2 == 0) {
                ++counter;
            }
        }
        return counter;
    }
}

class Solution {
    public static int countEven(int num) {
        int counter = 0;
        int[] range1 = IntStream.rangeClosed(1, num).toArray();
        Integer[] range2 = IntStream.of(range1).boxed().toArray(Integer[]::new);
        List<Integer> range3 = Arrays.asList(range2);
        for (Integer item : range3) {
            int sum_digits = Arrays.stream(item.toString().split("")).mapToInt(e -> Integer.parseInt(e)).sum();
            if (sum_digits % 2 == 0) {
                ++counter;
            }
        }
        return counter;
    }
}

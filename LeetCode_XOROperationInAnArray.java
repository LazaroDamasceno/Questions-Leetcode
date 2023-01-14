class Solution {
    public static int xorOperation(int n, int start) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = start + i * 2;
        }
        return IntStream.of(numbers).reduce((n1, n2) -> n1^n2).getAsInt();
    }
}

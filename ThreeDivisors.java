class Solution {
    public static boolean isThree(int n) {
        int[] range = IntStream.rangeClosed(1, n).toArray();
        var numberDivisors = (int)IntStream.of(range).filter(e -> n%e==0).count();
        return numberDivisors == 3 ? true : false;
    }
}

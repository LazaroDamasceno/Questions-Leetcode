class Solution {
    public int countDigits(int num) {
        if (num < 10) return 1;
        return  (int)Arrays
                .stream(Integer.valueOf(num).toString().split(""))
                .map(e -> Integer.parseInt(e))
                .filter(e -> num % e == 0)
                .count();
    }
}

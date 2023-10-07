import java.util.stream.IntStream;

class Solution {
    public int sumOfMultiples(int n) {
        return IntStream
        		.rangeClosed(1, n)
        		.filter(e -> e%3==0 || e%5==0 || e%7==0)
        		.reduce(0, (a, b) -> a+b);
    }
}

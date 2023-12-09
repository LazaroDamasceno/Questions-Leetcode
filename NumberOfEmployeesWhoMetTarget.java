import java.util.stream.IntStream;

class Solution {
	
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        return Math.toIntExact(IntStream
        		.of(hours)
        		.filter(e -> e >= target)
        		.count());
    }
    
}

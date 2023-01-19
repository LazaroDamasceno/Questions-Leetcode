class Solution {
    public int arrangeCoins(int n) {
        int coins = 1;
        List<Integer> staircase = new ArrayList<>();
        while (true) {
        	staircase.add(coins);
        	n -= coins++;
        	if (n <= coins) {
        		staircase.add(n);
        		break;
        	}
        }
        int penultimate = staircase.get(staircase.size()-2);
    	int last = staircase.get(staircase.size()-1);
    	return penultimate <= last ? last : penultimate;
    }
}

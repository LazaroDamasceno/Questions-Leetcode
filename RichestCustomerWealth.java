class Solution {
    public static int maximumWealth(int[][] accounts) {
    	int[] sums = new int[accounts.length];
    	for (int i = 0; i < accounts.length; i++) {
			sums[i] = IntStream.of(accounts[i]).sum();
		}
    	return IntStream.of(sums).max().getAsInt();
    }
}

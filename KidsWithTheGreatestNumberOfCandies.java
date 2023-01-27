class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    	List<Boolean> booleanList = new Vector<>(); 
    	for (int i = 0; i < candies.length; i++) {
			int temp = candies[i];
			candies[i] += extraCandies;
			if (candies[i] == IntStream.of(candies).max().getAsInt()) {
				booleanList.add(true);
			} else {
				booleanList.add(false);
			}
			candies[i] = temp;
		}
    	return booleanList;
    }
}

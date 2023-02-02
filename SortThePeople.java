class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        var map = new HashMap<Integer, String>();
        for (int i = 0; i < heights.length; i++) {
			map.put(heights[i], names[i]);
		}
        Arrays.sort(heights);
        int last = heights.length-1;
        for (int i = 0; i < heights.length; i++) {
			names[i] = map.get(heights[last]);
			--last;
		}
        return names;
    }
}

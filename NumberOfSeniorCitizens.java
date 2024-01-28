class Solution {
	
    public int countSeniors(String[] details) {
        return (int) Stream
        		.of(details)
        		.map(e -> e.substring(11, 13))
        		.map(e -> Integer.parseInt(e))
        		.filter(e -> e > 60)
        		.count();
    }
    
}

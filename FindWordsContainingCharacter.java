class Solution {
	
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indexes = new ArrayList<>();
        String letter = String.valueOf(x);
        for (int i = 0; i < words.length; i++) {
			if (words[i].contains(letter)) {
				indexes.add(i);
			}
		}
        return indexes;
    }
    
}

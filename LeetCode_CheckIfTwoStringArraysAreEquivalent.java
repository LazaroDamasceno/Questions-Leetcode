class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String conactWords1 = Arrays.stream(word1).reduce((e1, e2) -> e1 + e2).get();
        String conactWords2 = Arrays.stream(word2).reduce((e1, e2) -> e1 + e2).get();
        return  conactWords1.equals(conactWords2);
    }
}

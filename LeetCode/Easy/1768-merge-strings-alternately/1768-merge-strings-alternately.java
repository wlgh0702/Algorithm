class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length(); 
        int length2 = word2.length();
        int length = length1 > length2? length1 : length2;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++) {
            if(i >= length1) {
                sb.append(word2.charAt(i));
            } else if(i >= length2) {
                sb.append(word1.charAt(i));
            } else {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}
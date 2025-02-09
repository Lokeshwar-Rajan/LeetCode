class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int n = word.indexOf(ch);
        String output = word.substring(0,n+1);
        sb.append(output);
        sb.reverse();
        sb.append(word.substring(n+1));
        return sb.toString();
    }
}
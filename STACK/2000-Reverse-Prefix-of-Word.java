class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        int c= word.indexOf(ch);
        String output = "";
        for(int i=c;i>=0;i--){
            output+=word.charAt(i);
        }
        for(int i=c+1;i<n;i++){
            output+=word.charAt(i);
        }
        return output;
    }
}
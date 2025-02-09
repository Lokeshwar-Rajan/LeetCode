class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> Top = new Stack<>();
        StringBuilder str = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(Top.size()>0){
                    str.append(s.charAt(i));
                }
                Top.push(s.charAt(i));
            }
            else{
                Top.pop();
                if(Top.size()>0){
                    str.append(s.charAt(i));
                }
            }
        }
        return str.toString();
    }
}
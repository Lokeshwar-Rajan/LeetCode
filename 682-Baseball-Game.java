class Solution {
    public int calPoints(String[] str) {
        int n = str.length;
        int sum=0;
        int c=0;
        int[] ch = new int[n];
        int top=-1;
        for (int i = 0; i < n; i++){
            String s = str[i];
            if(s.matches(\-?\\\\d+\)){
                ch[++top]=Integer.parseInt(s);
            }
            else if(s.equals(\C\)){
                if (top >= 0) {
                    top--;
                }
            } 
            else if(s.equals(\D\)){
                if (top >= 0) {
                    ch[++top] = 2 * ch[top-1];
                }
            }else{
                if (top >= 1) {
                    ch[++top] = ch[top - 1] + ch[top - 2];
                }
            }
        }
        for(int i=0;i<=top;i++){
            sum+=ch[i];
        }
        return sum;
    }
}
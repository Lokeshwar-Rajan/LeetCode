class Solution 
{
    public int calPoints(String[] str) 
    {
        int n = str.length;
        int sum=0;
        Stack<Integer> st = new Stack<>();
        for(String op : str){
            if(op.equals(\C\)){
                st.pop();
            }
            else if(op.equals(\D\)){
                int m = st.peek();
                st.push(2*m);
            }else if(op.equals(\+\)){
                int m = st.pop();
                int k = st.peek();
                st.push(m);
                st.push(m+k);
            }else{
                st.push(Integer.parseInt(op));
            }
        }
        while(!st.empty()){
            sum+=st.pop();
        }
        return sum;
    }
}
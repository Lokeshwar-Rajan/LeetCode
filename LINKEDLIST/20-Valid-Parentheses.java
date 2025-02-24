class Solution 
{
    public boolean isValid(String s) 
    {
       int n = s.length();
       char[] st = new char[n];
       int top=-1;
       for(int i=0;i<n;i++)
       {
        if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
        {
            st[++top]=s.charAt(i);
        }
        else
        {
            if(top==-1)
            {
                return false;
            }
            else
            {
                char cpop = st[top];
                if(cpop=='(' && s.charAt(i)==')' || cpop=='[' && s.charAt(i)==']' || (cpop=='{' && s.charAt(i)=='}' ))
                {
                    top--;
                }
                else
                {
                    break;
                }
            }
        }
    }
    if(top==-1){
        return true;
    }else{
        return false;
    }
    } 
}
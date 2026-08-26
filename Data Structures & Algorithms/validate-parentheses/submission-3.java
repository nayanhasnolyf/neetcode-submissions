class Solution {
    public boolean isValid(String s) {
    int n= s.length();
    Stack <Character> st = new Stack<>();
    for(int i =0; i<n; i++)
    {
        char ch = s.charAt(i);
        if(ch==')'|| ch=='}' || ch==']')
        {
            if(!st.isEmpty()&&Math.abs(ch - st.peek()) < 3 )
            {
                st.pop();
            }
            else{
                return false;
            }
        }
        else
        {
            st.push(ch);
        }
    }
    if(st.isEmpty())
    {
        return true;
    }
    else
    return false;
    }
}

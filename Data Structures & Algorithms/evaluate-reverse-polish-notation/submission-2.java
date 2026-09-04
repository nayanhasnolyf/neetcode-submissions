class Solution {
    public int evalRPN(String[] tokens) {
    Stack <String>st = new Stack<>();
    int result = 0;
    int k =0;
    int m =0;
    for(int i=0; i<tokens.length;i++)
    {
        if(tokens[i].equals("+"))
        {
           k = Integer.parseInt(st.pop());
           m = Integer.parseInt(st.pop());
           result = result + k + m;
           st.push(Integer.toString(result));
           result = 0;
        }
        else if(tokens[i].equals("-"))
        {
            k = Integer.parseInt(st.pop());
           m = Integer.parseInt(st.pop());
           result = result + (m - k);
           st.push(Integer.toString(result));
           result = 0;
        }
        else if(tokens[i].equals("*"))
        {
           k = Integer.parseInt(st.pop());
           m = Integer.parseInt(st.pop());
           result = result + (k * m);
           st.push(Integer.toString(result));
           result = 0;
        }
        else if(tokens[i].equals("/"))
        {
           k = Integer.parseInt(st.pop());
           m = Integer.parseInt(st.pop());
           result = result + (m / k);
           st.push(Integer.toString(result));
           result = 0; 
        }
        else{
            st.push(tokens[i]);
        }
    }
    return Integer.parseInt(st.peek());    
    }
}

class MinStack {
    int peak;
    int capacity=10;
    int []stack;
    public MinStack() {
    this.stack = new int[capacity];
    this.peak = -1;
    }
    
    public void push(int val) {
        if(peak+1==capacity)
        {
            int newcap = capacity*2;
            int []newstack = new int[newcap];
            for(int i=0;i<capacity;i++)
            {
                newstack[i]= stack[i];
            }
            stack=newstack;
            capacity = capacity*2;
        }
        peak++;
        stack[peak]=val;

    }
    
    public void pop() {
    peak--;
    }
    
    public int top() {
    return stack[peak]; 
    }
    
    public int getMin() {
    int minsofar = stack[0];
    for(int i =1; i <=peak; i++)
    {
        if(stack[i]<minsofar)
        {
            minsofar = stack[i];
        }
    }
    return minsofar;   
    }
}
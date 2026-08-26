class Solution {
    public int[] plusOne(int[] digits) {
    int n = digits.length-1;
    while(n>=0)
    {
    if(digits[n]<9)
    {
        digits[n]+=1;
        return digits;
    }
    else
    {
        digits[n] = 0;
        n--;
    }
   
    }
    int[] arr = new int[digits.length + 1];
    arr[0]=1;
    return arr;
    }
}


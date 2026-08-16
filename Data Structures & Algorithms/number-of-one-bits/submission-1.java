// this submittion uses a predefined function called String nn = Integer.toBinaryString(n); that converts int n in binary form to a string in binary form other wise if used String nn = String.valueOf(n) it ends up giving the decimal value of the input number..//
// another approach values a bitwise operator usecase like '&' or '>>' to calculate the input and find out the number of 1's.

class Solution {
    public int hammingWeight(int n) {
    String nn = Integer.toBinaryString(n);
    int l = nn.length();
    int c =0;
    for(int i =0; i<l; i++)
    {
        if(nn.charAt(i)=='1')
        {
            c++;
        }
    }
    return c;  
    }
}

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

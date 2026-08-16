class Solution {
    public boolean isPalindrome(String s) {
    String ss = s.toLowerCase();
    boolean flag = true;
    int l= ss.length();
    int left = 0;
    int right = l-1;
    while(right>left)
    {
        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
        if(ss.charAt(left)!=ss.charAt(right))
        {
            flag = false;
            break;
        }
        left++;
        right--;
    }return flag;   
    }
}

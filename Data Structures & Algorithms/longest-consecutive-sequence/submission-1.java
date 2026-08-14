class Solution {
    public int longestConsecutive(int[] nums) {
    HashSet <Integer> hs = new HashSet<>();
    int x=1; int c=0; int longest=0;
    for(int i =0; i<nums.length; i++)
    {
        hs.add(nums[i]);
    }
    for(int i =0; i<nums.length; i++)
    {
      if(hs.contains(nums[i]-1)==false)
      { c = nums[i];
        while(hs.contains(c+1)==true)
        {
            c++;
            x++;
        }
        if(x>longest)
        longest =x;
        c =0;
        x =1;
      }
    }return longest;
    }
}

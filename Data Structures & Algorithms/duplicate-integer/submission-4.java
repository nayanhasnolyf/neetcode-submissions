class Solution {
    public boolean hasDuplicate(int[] nums) {
    int l = nums.length;
    Arrays.sort(nums);
    boolean flag = false;
    for(int i=0; i<l-1;i++)
    {
        if(nums[i]-nums[i+1]==0)
        flag=true;

    }
    return flag;
    }
}
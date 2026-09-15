class Solution {
    public int findMin(int[] nums) {
    int end =  nums.length;
    int start = 0;
    int mid = end+(start-end)/2;
    for(int i =0; i<nums.length-1; i++)
    {
        if(nums[i]>nums[i+1])
        {
            return nums[i+1];
        }
    }
    return nums[0];
    }
}

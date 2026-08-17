class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int n = numbers.length;
    int index1 = 0;
    int index2 = n-1;
    int sum;
    while(index2>index1)
    {
        sum = numbers[index1] + numbers[index2];
        if(sum>target)
        index2--;
        if(sum==target)
        return new int[] {index1+1,index2+1};
        if(sum<target)
        index1++;
    }
    return null;
    }
}

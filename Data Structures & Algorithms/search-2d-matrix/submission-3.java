class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int start=0;
    int n = matrix[0].length;
    int end=(matrix.length*n)-1;
    while(start<=end)
    {
    int mid = start+(end-start)/2;
    int row = mid/n;
    int col = mid%n;
    if(matrix[row][col]<target)
    {
        start = mid +1;
    }
    else if(matrix[row][col]>target)
    {
        end = mid -1;
    }
    else if(matrix[row][col]==target)
    {
        return true;
    }
    }
    return false;
    }
}

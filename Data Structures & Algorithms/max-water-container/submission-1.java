class Solution {
    public int maxArea(int[] heights) {
    int left = 0;
    int right = heights.length-1;
    int maxsofar = -1;
    int area;
    while(right>left)
    {
        int width  = right-left;
        area = width*Math.min(heights[left],heights[right]);
        if(area>maxsofar)
            maxsofar = area;
        if(heights[right]>heights[left])
        {
            left++;
        }
        else
        {
            right--; 
        }
    }
    return maxsofar;
    }
    }


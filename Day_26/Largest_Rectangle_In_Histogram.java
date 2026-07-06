/*

84. Largest Rectangle in Histogram

Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

 

Example 1:


Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.

*/

//Code :

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxarea = 0;
        for (int i =0;i<=heights.length;i++){
            int current = (i == heights.length) ? 0 : heights[i];

            while(!stack.isEmpty() && current < heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width;
                if(stack.isEmpty()){
                    width = i;
                }else{
                    width = i-stack.peek() -1;
                }
                maxarea =Math.max(maxarea,height*width);

            }
            stack.push(i);
        } 
        return maxarea;
    }

}
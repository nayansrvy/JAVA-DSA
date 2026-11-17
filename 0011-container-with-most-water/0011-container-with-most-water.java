class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int lfptr = 0;
        int rtptr = height.length-1;

        while(lfptr < rtptr){
            int hght = Math.min(height[lfptr], height[rtptr]);
            int wdth = rtptr - lfptr;
            int currWater = hght * wdth;

            maxWater = Math.max(maxWater, currWater);

            if(height[lfptr] < height[rtptr]){
                lfptr++;
            } else {
                rtptr--;
            }

        }
        return maxWater;
    }
}
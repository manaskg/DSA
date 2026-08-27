class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0, r = n-1;
        int max_area = 0;

        while(l<r){
            int area = (r-l)* Math.min(height[l],height[r]);
            if(area>max_area){
                max_area = area;
            }

            if(height[l]<= height[r]){
                l++;
            }

            else r--;


        }

        return max_area;
    }
}
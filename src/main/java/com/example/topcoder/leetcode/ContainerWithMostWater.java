package com.example.topcoder.leetcode;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxArea = 0;
        int start = 0;
        int end = height.length - 1;
        while(start < end) {
            int area = (end - start) * Integer.min(height[start], height[end]);
            if (area > maxArea) {
                maxArea = area;
            }

            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
        }
        return maxArea;
    }
}

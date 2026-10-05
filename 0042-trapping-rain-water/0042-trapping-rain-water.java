import java.util.*;
class Solution {
    public int trap(int[] height) {
        int leftmax[]=new int[height.length];
        int rightmax[]=new int[height.length];
        int wl=0;
        int width=1;
        int tp=0;
        int tt=0;
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
        for(int j=0;j<height.length;j++){
            wl=Math.min(leftmax[j],rightmax[j]);
            tp=(wl-height[j])*width;
            tt+=tp;


        }
        return tt;
        
    }
}
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int count=right-left;
        int max=0;
        while(left<right){
            if(height[left]<height[right]){
                int temp=height[left]*count;
                if(max<temp){
                max=height[left]*count;
                }
                count--;
                left++;
            }else{
                int temp=height[right]*count;
                if(max<temp){
                    max=height[right]*count;
                }
                count--;
                right--;
            }
        }

        return max;


    }
}
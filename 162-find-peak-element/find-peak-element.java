class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        

        for(int i=1;i<n-1 ;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]) return i;
        }
        if(n>1){
            if(nums[n-2]<nums[n-1]) return n-1;
        }else{
            return 0;
        }
        return 0;
    }
}
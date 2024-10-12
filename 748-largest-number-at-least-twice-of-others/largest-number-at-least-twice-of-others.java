class Solution {
    public int dominantIndex(int[] nums) {
        
        int largest=nums[0];
        int sLargest=0;
        int index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                sLargest=largest;
                largest=nums[i];
                index=i;
            }else{
                sLargest=Math.max(sLargest,nums[i]);
            }            
        }
        if(2*sLargest <=largest){
            return index;
        }else{
            return -1;
        }
    }
}
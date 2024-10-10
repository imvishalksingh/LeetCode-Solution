class Solution {
    public int maxWidthRamp(int[] nums) {
    
       int maxlen=0;
       int fleft=0;
       int sleft=0;

       int maxArray[]=new int[nums.length];
        maxArray[nums.length-1]=nums[nums.length-1];
       for(int i=nums.length-2;i>=0; i--){
            int maxnum=Math.max(nums[i],maxArray[i+1]);
            maxArray[i]=maxnum;
       }

       while(fleft<=nums.length-1 && sleft<=nums.length-1 ){
            if(nums[fleft]<=maxArray[sleft]){
                maxlen=Math.max(maxlen,(sleft-fleft));
                sleft++;
            }else{
                fleft++;
            }   
       }
return maxlen;

        
    }
}
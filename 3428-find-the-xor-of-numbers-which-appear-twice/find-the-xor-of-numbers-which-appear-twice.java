class Solution {
    public int duplicateNumbersXOR(int[] nums) {
       int xor=0;
       Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=(nums.length-1) && nums[i]==nums[i+1] ){
                xor^=nums[i];
            }
        }
        return xor;
        
    }
}
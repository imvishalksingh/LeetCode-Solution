class Solution {
    public void rotate(int[] nums, int k) {
        int []result=new int[nums.length];
        if(k>nums.length){
            k=k%nums.length;
        }
        int index=0;
        for(int i=nums.length-k ;i<nums.length; i++){
            result[index++]=nums[i];
        }
        for(int i=0 ; i<nums.length-k ;i++){
            result[index++]=nums[i];
        }
        for(int i=0 ;i <result.length ;i++){
            nums[i]=result[i];
        }
    }
}
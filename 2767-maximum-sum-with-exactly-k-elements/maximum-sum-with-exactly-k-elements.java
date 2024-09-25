class Solution {
    public int maximizeSum(int[] nums, int k) {
        int largest=nums[0];
       for(int i=1;i<nums.length;i++){
            if(nums[i]>=largest){
                largest=nums[i];
            }
       }
        int add=0;
        for(int i=1;i<=k;i++){
            add=add+largest;
            largest=largest+1;
        }
        return add;
    }
}
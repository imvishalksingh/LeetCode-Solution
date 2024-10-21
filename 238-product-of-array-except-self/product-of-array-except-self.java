class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int result[]=new int[len];
        Arrays.fill(result,1);
        int leftProduct=1;
        for(int i=0;i<len;i++){
            result[i]=result[i]*leftProduct;
            leftProduct=leftProduct*nums[i];
        }
        int rightProduct=1;
        for(int i=len-1 ; i>=0 ;i--){
            result[i]=result[i]*rightProduct;
            rightProduct=rightProduct*nums[i];
        }
        return result;
    }
}
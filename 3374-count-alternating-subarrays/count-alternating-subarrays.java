class Solution {
    public long countAlternatingSubarrays(int[] nums) {

    long res=0;
    int length=nums.length;
    int index=0;
    int i=1;
    while(i<length){
        if(nums[i]==nums[i-1]){
            index=i;
        }else{
            res=res+(i-index);
        }
        i++;
    }
        return res+length;
    }
}
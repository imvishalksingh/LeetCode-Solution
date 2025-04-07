class Solution {
    public int removeDuplicates(int[] nums) {

        int i=0;
        for(int e:nums){
            if(i==0 || i==1 || e!=nums[i-2]){
                nums[i]=e;
                i++;
            }
        }

        return i;

        // int count=2;
        // int n=nums.length;
        // for(int i=2 ; i<n; i++){
        //     int e=nums[i];
        //     if(nums[count-2]!=e){
        //         nums[count]=e;
        //         count++;
        //     }
        // }

        // return count;
        
    }
}
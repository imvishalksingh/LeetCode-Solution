class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        rotate(nums , 0 , n-k-1);
        rotate(nums , n-k , nums.length-1);
        rotate(nums , 0 , nums.length-1);
        
    }

    public static void rotate(int nums[],int start, int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
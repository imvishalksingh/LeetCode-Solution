class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remain=target-nums[i];
            if(mp.containsKey(remain)){
                return new int[]{mp.get(remain),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{-1,-1};
       
    }
}
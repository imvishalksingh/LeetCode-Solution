class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer , Integer > mp=new HashMap<>();

        for(int i=0 ; i<nums.length ; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i] , i);
            }else{
                int diff= Math.max(mp.get(nums[i]), i) - Math.min(mp.get(nums[i]), i);
                if(diff <= k) return true;
                else{
                    mp.put(nums[i],i);
                }
            }
        }

        return false;
    }
}
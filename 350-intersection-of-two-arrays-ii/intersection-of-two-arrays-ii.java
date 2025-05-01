class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       Map<Integer, Integer> count=new HashMap<>();
       ArrayList<Integer> res=new ArrayList<>();

       for(int nums: nums1){
        count.put(nums , count.getOrDefault(nums,0)+1);
       }

       for(int nums:nums2){
        if(count.getOrDefault(nums,0)>0){
            res.add(nums);
            count.put(nums, count.get(nums)-1);
        }
       }

       return res.stream().mapToInt(Integer::intValue).toArray();

    }
}
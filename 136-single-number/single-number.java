class Solution {
    public int singleNumber(int[] nums) {
       Map<Integer , Integer > mp=new HashMap<>();

       for(int num : nums){
        mp.put(num , mp.getOrDefault(num , 0)+1);
       }

       for(int num: nums){
        if(mp.get(num)==1) return num;
       }

       return -1;
    }
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer > mp=new HashMap<>();

        for(int num: nums){
            mp.put(num , mp.getOrDefault(num , 0)+1);
            if(mp.getOrDefault(num , 0)>=2 ) return true;
        }

        return false;
    }
}
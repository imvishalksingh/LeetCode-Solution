class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> st=new HashSet<>();
        for(int it: nums){
            if(it>k) st.add(it);
            else if(it<k) return -1;
        }

        return st.size();
    }
}
class Solution {
    public int minimumOperations(int[] nums) {

        Set<Integer> st=new HashSet<>();
        int n=nums.length;
        for(int i=n-1 ; i>=0 ; i--){
            if(st.contains(nums[i])){
                return (i/3)+1;
            }
            st.add(nums[i]);
        }
        return 0;
        
    }
}
class Solution {
    public int longestSquareStreak(int[] nums) {
        int max=-1;
        Set<Integer> st=new HashSet<>();

        for(int num:nums){
            st.add(num);
        }

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            int count=0;

            while(st.contains(curr)){
                st.remove(curr);
                curr*=curr;
                count++;
                max=Math.max(max,count);

            }
        }
        return max==1? -1 : max;
    }
}
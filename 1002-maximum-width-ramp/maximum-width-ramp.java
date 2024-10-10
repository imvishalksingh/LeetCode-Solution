class Solution {
    public int maxWidthRamp(int[] nums) {
    
        
        Stack<Pair<Integer,Integer>> st=new Stack<>();
        int maxlen=0;
        for(int i=0;i<nums.length-1;i++){
            if(st.isEmpty() || nums[i]<st.peek().getValue()){
                st.add(new Pair(i,nums[i]));
            }
        }

        for(int j=nums.length-1;j>=0;j--){
            while(!st.isEmpty() && st.peek().getValue()<=nums[j]){
                if(nums[j]>=st.peek().getValue()){
                    maxlen=Math.max(maxlen,(j-st.peek().getKey()));
                    st.pop();
                }
            }
        }
        return maxlen;
        
    }
}
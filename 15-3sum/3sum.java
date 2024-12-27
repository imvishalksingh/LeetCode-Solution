class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        int i=0;
    
        Set<List<Integer>> ls=new HashSet<>();

        for( i=0;i<nums.length-2;i++){
            
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ls.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(nums[j]==nums[j-1] && j<k){
                        j++;
                    }
                }else if(0<sum){
                    k--;
                }else{
                    j++;
                }
            }
           
        }

        return new ArrayList<>(ls);
    }
}
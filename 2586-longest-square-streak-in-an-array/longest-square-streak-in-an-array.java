class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        Map<Integer ,Integer> mp=new HashMap<>();
        int max=-1;
        for(int num :nums){
            int sqrt=(int)Math.sqrt(num);
            if(sqrt*sqrt==num && mp.containsKey(sqrt)){
                mp.put(num , mp.get(sqrt)+1);
                max=Math.max(max,mp.get(num));
            }else{
                mp.put(num,1);
            }
        }

        return max;
    }
}
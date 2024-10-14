class Solution {
    public long maxKelements(int[] nums, int k) {
        long score=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        while(k>0){
            int max=pq.peek();
            score+=max;
            pq.poll(); 
            if(max%3==0){
                pq.add(max/3);
            }else{
                pq.add((max/3)+1);
            }     
            k--; 
        }

        return score;

    }
}
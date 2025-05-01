class Solution {
    public boolean isHappy(int n) {

        if(n==1) return true;
        Map<Integer , Integer > mp=new HashMap<>();

        while(n!=1){
            int sum=0;
            int copyN=n;
            while(n>0){
                int digit=n%10;
                sum+=digit*digit;
                n=n/10;
            }
            if(sum==1) return true;
            else mp.put(copyN , mp.getOrDefault(copyN , 0)+1);
            if(mp.getOrDefault(copyN , 0)>=2) return false;
            n=sum; 
        }

        return false;
        
    }
}
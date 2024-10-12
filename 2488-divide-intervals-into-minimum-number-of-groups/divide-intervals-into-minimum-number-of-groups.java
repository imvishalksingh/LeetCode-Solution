class Solution {
    public int minGroups(int[][] intervals) {
        int[] arr = new int[1000005];
        int ans=0;
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            arr[start] = arr[start] + 1;
            arr[end + 1] = arr[end + 1] - 1;
        }
        for(int i=1;i<1000000;i++){
            arr[i]=arr[i]+arr[i-1];
            ans=Math.max(ans,arr[i]);
        }
        return ans;
    }
}
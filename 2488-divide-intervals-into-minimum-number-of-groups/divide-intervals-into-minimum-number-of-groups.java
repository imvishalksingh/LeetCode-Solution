class Solution {
    public int minGroups(int[][] intervals) {
        int length=intervals.length;
        int[] arr1=new int[length];
        int[] arr2=new int[length];
        for(int i=0; i<length;i++){
            arr1[i]=intervals[i][0];
            arr2[i]=intervals[i][1];
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int count=0;
        int group=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>arr2[count]){
                count++;
            }else{
                group++;
            }
        }

    return group;

    }
}
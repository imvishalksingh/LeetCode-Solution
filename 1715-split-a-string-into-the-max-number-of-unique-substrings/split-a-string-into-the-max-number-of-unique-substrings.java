class Solution {
    public int maxUniqueSplit(String s) {
        int max[] = new int[1];
        backTrack(0,s,new HashSet<>(), max );
        return max[0];
    }

    private void backTrack(int index , String s, Set<String> unqSet , int [] max ){
        if(index==s.length()){
            max[0]=Math.max(max[0],unqSet.size());
            return;
        }

        for(int i=index+1 ; i<=s.length() ; i++){
            String subStr=s.substring(index , i);

            if(!unqSet.contains(subStr)){
                unqSet.add(subStr);
                backTrack(i , s , unqSet , max);
                unqSet.remove(subStr);
            }
        }
    }
}
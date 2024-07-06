class Solution {
    public int firstUniqChar(String s) {

        int []frequency=new int[26];
        char charArray[]=s.toCharArray();
        for(char c:charArray){
            frequency[c-'a']++;
        }
        for(int i=0;i<charArray.length;i++){
            if(frequency[charArray[i]-'a']==1){
                return i;
            }
        }

        return -1;

    }
}
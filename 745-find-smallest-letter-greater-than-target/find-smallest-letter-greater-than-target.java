class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int targetInt=target;
        for(int i=0;i<letters.length;i++){
            int CharInt=letters[i];
            if(CharInt>targetInt){
                return letters[i];
            }
        }
        return letters[0];
    }

}
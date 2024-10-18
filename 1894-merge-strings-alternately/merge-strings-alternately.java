class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int word1Length=word1.length();
        int word2Length=word2.length();
        int i=0;
        while(word1Length>0 && word2Length>0){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            word1Length--;
            word2Length--;
            i++;
        }
        while(word1Length!=0){
            sb.append(word1.charAt(i));
            word1Length--;
            i++;
        }
        while(word2Length!=0){
            sb.append(word2.charAt(i));
            word2Length--;
            i++;
        }

        return sb.toString();
    }
}
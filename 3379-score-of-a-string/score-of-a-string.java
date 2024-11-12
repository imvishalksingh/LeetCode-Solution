class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int char1=(int)s.charAt(i);
            int char2=(int)s.charAt(i+1);
            if(char1>char2) sum=sum+char1-char2;
            else sum=sum+char2-char1;
        }
        return sum;
    }
}
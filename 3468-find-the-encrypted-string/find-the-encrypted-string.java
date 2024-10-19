class Solution {
    public String getEncryptedString(String s, int k) {
        int n=s.length();
        char result[]=new char[n];
        int position=0;
        for(int i=0;i<n;i++){
            position=(i+k)%n;
            result[i]=s.charAt(position);
        }
        String str=new String(result);
        return str;
        
    }
}
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() >magazine.length() ) return false;

        Map<Character, Integer> mp=new HashMap<>();
        for(int i=0; i<magazine.length() ; i++){
            char c=magazine.charAt(i);
            mp.put(c , mp.getOrDefault(c , 0)+1);
        }

        for(int i=0; i<ransomNote.length() ; i++){
            char c=ransomNote.charAt(i);
            if(mp.getOrDefault(c,0)>0){
                mp.put(c, mp.get(c)-1);
                if(mp.get(c)==0){
                    mp.remove(c);
                }
                
            }else{
                return false;
            }
        }

        return true;

    }
}
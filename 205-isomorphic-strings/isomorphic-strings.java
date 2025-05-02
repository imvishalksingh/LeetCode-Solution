class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> mp1=new HashMap<>();
        Map<Character, Integer> mp2=new HashMap<>();

        for(int i=0 ;i<s.length() ;i++){
           
           if (!mp1.containsKey(s.charAt(i))) {
                mp1.put(s.charAt(i), i);
            }

            if (!mp2.containsKey(t.charAt(i))) {
                mp2.put(t.charAt(i), i);
            }

        if(mp1.getOrDefault(s.charAt(i) , 0) != mp2.getOrDefault(t.charAt(i) , 0)) return false;

        
        }

    return true;
    }
}
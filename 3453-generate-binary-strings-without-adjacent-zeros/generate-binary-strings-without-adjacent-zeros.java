class Solution {
    public List<String> validStrings(int n) {
        List<String> list=new ArrayList<>();
        list.add("0");
        list.add("1");

        for(int i=2 ;i<=n;i++){
            List<String> newlst=new ArrayList<>();
            for(String s:list){
                newlst.add(s+"1");
                if(s.charAt(s.length()-1) == '1'){
                    newlst.add(s+"0");
                }
            }
            list=newlst;
        }

        return list;
    }
}
class Solution {
    public int maximumSwap(int num) {
        char [] charA=Integer.toString(num).toCharArray();
        int[] index=new int[charA.length];
        int last=charA.length-1;
        index[last]=last;
        int max=last;
        for(int i=index.length-1;i>=0;i--){
            if((charA[i]-'0')<=charA[max]-'0'){
                index[i]=max;
            }else{
                max=i;
                index[i]=max;
            }
        }
        for(int i=0;i<index.length;i++){
            if(index[i]!=i && charA[i]!=charA[index[i]]){
                char temp=charA[i];
                charA[i]=charA[index[i]];
                charA[index[i]]=temp;
                return Integer.parseInt(new String(charA));
            }
        }

        return num;
    }
}
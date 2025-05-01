class Bucket{
    private List<Integer> container;
    public Bucket(){
        this.container =new LinkedList<Integer>();
    }

    public void insert(Integer val){
        int index=this.container.indexOf(val);
        if(index==-1){
            this.container.addFirst(val);
        }
    }

    public void remove(Integer val){
        this.container.remove(val);
    }

    public boolean contain(Integer val){
        int index=this.container.indexOf(val);
        return index != -1;
    }

}

class MyHashSet {
    int size = 769;
    Bucket[] buckets;
    public MyHashSet() {
        this.buckets= new Bucket[this.size];

        for(int i=0 ;i<size ; i++){
            this.buckets[i]=new Bucket();
        }
    }

    private int getHash(int key){
        return key%size;
    }
    
    public void add(int key) {
        int  index=getHash(key);
        this.buckets[index].insert(key);
    }
    
    public void remove(int key) {
        int  index=getHash(key);
        this.buckets[index].remove(key);

    }
    
    public boolean contains(int key) {
        int  index=getHash(key);
        return this.buckets[index].contain(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
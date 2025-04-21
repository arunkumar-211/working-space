//Q. How does a Hashmap work internally ? Code a simplistic version of the working. implement put/get methods and scaling the hashmap when it reaches full capacity.
//Algorithm:-
//1. create a myhashmap class with the constructor, load factor, capacity, size and list of arrays including hash, put and get methods.
//2. put method helps in storing the value for a key directly or independently.
//3. while putting the data the size is verified using the formula (size/bucket.length) > load factor and resized if condition is passed
//4. during the resize, a new list of array is created for the double capacity and the elements from the old bucket are hashed again and moved to the new bucket using the new array capacity
//5. get method helps in retrieving the element as per the hashed index
//6. hash method returns the value using the formula absolute value of (key.hashcode % bucket.length). 

import java.util.LinkedList;

public class Q6MyHash<K, V> {

    private float load_factor = 0.75f;
    private int cap = 4;
    private int size;
    private LinkedList<Entry<K, V>>[] buckets;


    public Q6MyHash() {
        buckets = new LinkedList[cap];
        for(int i = 0; i < cap; i++) {
            buckets[i] = new LinkedList();
        }
        size = 0;
    }

    public int hash(K key) {
        return Math.abs(key.hashCode() % (buckets.length));


    }


    public void put(K key, V value) {
        int index  = hash(key);
        LinkedList<Entry<K, V>>bucket = buckets[index];

        for(Entry<K, V> entry: bucket){

            if(entry.key.equals(key)) {
                entry.value  = value;
                return;
            }
        }

        //bucket = new LinkedList<>();
        bucket.add(new Entry<K, V>(key, value));
        size++;

        if(((float)size/buckets.length) > load_factor) {
            resize();
        }

    }



    public void resize() {
        int newCap = (buckets.length * 2);
        LinkedList<Entry<K, V>>[] newBuckets = new LinkedList[newCap];

        for(LinkedList<Entry<K, V>> entry: buckets) {
            for(Entry<K, V> e: entry) {
                int index  = Math.abs(e.key.hashCode() % newCap );
                newBuckets[index].add(e);
            }
        }

        buckets = newBuckets;

    }


    public V get(K key) {
        int index  = hash(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        
        for(Entry<K,V> e: bucket) {
            if(e.key.equals(key)) {
                return e.value;
            }
        }

        return null;


    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;       
        }

    }






    public static void main(String[] args){
        Q6MyHash myHash = new Q6MyHash<>();
        myHash.put("Arun",123);
        myHash.put("Kumar",345);

        System.out.println(myHash.get("Arun"));
        System.out.println(myHash.get("Kumar"));


    }
    
}

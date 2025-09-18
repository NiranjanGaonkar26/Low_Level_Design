package MyHashMapImpl;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap <K, V>{

    private static final int INITIAL_CAPACITY = 1 << 4;
    private static final int MAXIMUM_CAPACITY = 1 << 30;
    private int tableSize;

    private Entry[] hashTable;

    public MyHashMap(int capacity){
        this.tableSize = getTableSize(capacity);
        this.hashTable = new Entry[tableSize];
    }

    private int getTableSize(int cap){
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    public void put(K key, V value){
        int hashIndex = key.hashCode() % this.tableSize;

        Entry head = hashTable[hashIndex];
        if (head == null){
            Entry newNode = new Entry(key, value);
            hashTable[hashIndex] = newNode;
        }
        else{
            Entry temp = head;
            while(temp.nextEntry != null){
                if(temp.key == key){
                    temp.value = value;
                    return;
                }
                temp = temp.nextEntry;
            }
            Entry newNode = new Entry(key, value);
            temp.nextEntry = newNode;
        }
    }

    public V get(K key){
        int hashIndex = key.hashCode() % this.tableSize;
        Entry head = hashTable[hashIndex];
        Entry temp = head;

        while(temp != null){
            if(temp.key.equals(key)){
                return (V) temp.value;
            }
            temp = temp.nextEntry;
        }

        return null;
    }
}

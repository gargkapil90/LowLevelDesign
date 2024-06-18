package LFUCache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class LFUCache<K, V>{
    class Node{
        K key;
        V value;
        Node next;
        Node previous;
        public Node(K key, V value){
            this.key = key;
            this.value = value;
            this.next = null;
            this.previous = null;
        }
    }
    private int capacity;
    private int min_frequency;
    HashMap<K, Node> map;
    HashMap<Integer, LinkedList<Node>> freq_map;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.min_frequency = 0;
        this.map = new HashMap<>();
        this.freq_map = new HashMap<>();
    }

    public void put(K key, V value){
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            map.put(key, node);

        }
    }
    public V get(K key){
        return null;
    }
}

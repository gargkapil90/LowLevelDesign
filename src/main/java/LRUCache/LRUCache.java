package LRUCache;

import java.util.HashMap;

class Node<K, V> {
    K Key;
    V Value;
    Node<K, V> next;
    Node<K, V> previous;
    public Node(K Key, V Value) {
        this.Key = Key;
        this.Value = Value;
        next = null;
    }
}
public class LRUCache<K, V> {
    private Node<K, V> head;
    private Node<K, V> tail;
    private int size;
    HashMap<K, Node<K, V>> map;
    public LRUCache(int size) {
        this.size = size;
        head = new Node<K, V>(null, null);
        tail = new Node<K, V>(null, null);
        map = new HashMap<>();
        head.next = tail;
        tail.previous = head;
    }
    public void put(K Key, V Value) {
        if (map.containsKey(Key)) {
            Node<K, V> node = map.get(Key);
            node.Value = Value;
            remove(node);
            addNodeToHead(node);
        }
        else {
            Node<K, V> node = new Node<>(Key, Value);
            if(size == map.size()){
                map.remove(Key);
                remove(tail.previous);
            }
            addNodeToHead(node);
            map.put(Key, node);
        }
    }
    public V get(K Key) {
        if(!map.containsKey(Key)){
            return null;
        }
        Node<K, V> node = map.get(Key);
        remove(node);
        addNodeToHead(node);
        return node.Value;
    }
    private void remove(Node<K, V> node) {
        node.previous.next = node.next;
        node.next.previous = node.previous;
    }
    private void addNodeToHead(Node<K, V> node) {
        head.next.previous = node;
        node.next = head.next;
        node.previous = head;
        head.next = node;
    }
}

package List.hashmap;

import List.linkedlist.MyLinkedList;

public class MyHashMap<T, V> {
    private Node<T, V> [] table;
    private int size;

    public void put(T key, V value){
        hash(key);
        int i = (table.length - 1) & hash(key);
        Node<T, V> newNode = new Node<>(key, value);
    }
    public static final int hash(Object key){
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
    private static class Node<T, V>{
        private Node <T, V> next;
        private final T key;
        private V value;
        private int hash;

        private Node(T key, V value) {
            this.key = key;
            this.value = value;
        }

    }

}

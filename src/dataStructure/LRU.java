package dataStructure;

//最近最少使用算法，实际上是设计一种数据结构

//LRU 算法实际上是让你设计数据结构：首先要接收一个 capacity 参数作为缓存的最大容量
// 然后实现两个 API，一个是 put(key, val) 方法存入键值对，另一个是 get(key) 方法
// 获取 key 对应的 val，如果 key 不存在则返回 -1。


import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

//采用哈希链表 ，哈希表决定查找速度是O(1)，双链表决定删除插入速度是O(1)，另外链表中
//的数据必须有序。

//Q:为什么要在链表中同时存储 key 和 val，而不是只存储 val?
//A:当缓存容量已满，我们不仅仅要删除最后一个 Node 节点，还要
// 把 map 中映射到该节点的 key 同时删除，而这个 key 只能由 Node
// 得到。如果 Node 结构中只存储 val，那么我们就无法得知 key 是
// 什么，就无法删除 map 中的键，造成错误。
public class LRU {

    Map<Integer,Node> map;
    ArrayDeque<Node> cache;
    int capacity;

    public LRU(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        cache = new ArrayDeque<>();
    }

    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        int value = node.value;
        put(key,value);
        return value;
    }

    public void put(int key, int value) {
        Node newNode = new Node(key,value);
        if(map.containsKey(key)){
            cache.remove(map.get(key));
            cache.addFirst(newNode);
            map.put(key,newNode);
        }else{
            if(cache.size() == capacity){
                Node oldNode = cache.removeLast();
                map.remove(oldNode.key);
            }
            cache.addFirst(newNode);
            map.put(key,newNode);
        }
    }

    private static class Node{
        public int key;
        public int value;
        public Node pre;
        public Node next;
        public Node(int key,int value){
            this.key = key;
            this.value = value;
        };
    }

    public static void main(String[] args) {
        LRU lru = new LRU(3);
        lru.put(1,10);
        lru.put(2,20);
        lru.put(3,30);
        System.out.println(lru.get(1));
        lru.put(5,50);
        System.out.println(lru.get(2));
        lru.put(4,40);
        System.out.println(lru.get(3));
    }
}

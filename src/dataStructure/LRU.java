package dataStructure;

//最近最少使用算法，实际上是设计一种数据结构

//LRU 算法实际上是让你设计数据结构：首先要接收一个 capacity 参数作为缓存的最大容量
// 然后实现两个 API，一个是 put(key, val) 方法存入键值对，另一个是 get(key) 方法
// 获取 key 对应的 val，如果 key 不存在则返回 -1。


import java.util.HashMap;

//采用哈希链表 ，哈希表决定查找速度是O(1)，双链表决定删除插入速度是O(1)，另外链表中
//的数据必须有序。
public class LRU {

    private HashMap<Integer,Node> map;
    private DoubleList cache;
    private int capacity;

    public LRU(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
        cache = new DoubleList();
    }

    public int get(int key){
        if(!map.containsKey(key)){
            return -1;
        }
        int val = map.get(key).val;
        put(key,val);
        return val;
    }

    //Q:为什么要在链表中同时存储 key 和 val，而不是只存储 val?
    //A:当缓存容量已满，我们不仅仅要删除最后一个 Node 节点，还要
    // 把 map 中映射到该节点的 key 同时删除，而这个 key 只能由 Node
    // 得到。如果 Node 结构中只存储 val，那么我们就无法得知 key 是
    // 什么，就无法删除 map 中的键，造成错误。

    public void put(int k,int v){
        Node newNode = new Node(k,v);

        if(map.containsKey(k)){
            cache.remove(map.get(k));
            cache.addFirst(newNode);

            map.put(k,newNode);
        }else{
            if(capacity == cache.size()){
                Node oldNode = cache.removeLast();
                map.remove(oldNode.key);
            }
            cache.addFirst(newNode);
            map.put(k,newNode);
        }
    }

    private static class DoubleList{
        //省略双链表的实现
        public void addFirst(Node x){
        }
        public void remove(Node x) {
        }
        public Node removeLast(){
            return null;
        }
        public int size(){
            return 0;
        }
    }

    private static class Node{
        //双向链表节点的定义
        public int key,val;
        public Node prev,next;
        public Node(int k,int v){
            this.key = k;
            this.val = v;
        };
    }
}

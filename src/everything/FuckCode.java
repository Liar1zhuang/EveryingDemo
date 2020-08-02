package everything;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;

public class FuckCode {
    //线程安全的ConcurrentHashMap源码
    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

    public static void main(String[] args) {
        //HashSet源码
        Set<Integer> set = new HashSet<>();
        Map<String,String> map = new HashMap<>();
        map.getOrDefault("s",null);

        //Integer的ArrayList转int数组
        List<Integer> arrayList = new ArrayList<>();
        arrayList.stream().mapToInt(Integer::intValue).toArray();

        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();

        Deque<Integer> queue = new ArrayDeque<>();
        //小根堆 优先队列源码
//        PriorityQueue<Integer> smallHeap = new PriorityQueue<>((v1,v2)->v1 > v2 ? 1 : -1);
//        PriorityQueue<Integer> smallHeap = new PriorityQueue<>((v1,v2)->v1.compareTo(v2));
        PriorityQueue<Integer> smallHeap = new PriorityQueue<>((v1,v2)->v1 - v2);
        smallHeap.add(5);
        smallHeap.add(3);
        smallHeap.add(7);
//        System.out.println(smallHeap);
        PriorityQueue<Integer> bigHeap = new PriorityQueue<>((v1,v2)->v2.compareTo(v1));
        bigHeap.add(5);
        bigHeap.add(3);
        bigHeap.add(7);
//        System.out.println(bigHeap);

        //Lambda表达式并不能取代所有的匿名内部类，只能用来取代函数接口（Functional Interface）的简写!!!
        //Lambda表达式JDK 1.7和JDK1.8区别(无参函数)，新建线程为例
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JDK1.7,无参函数的简写");
            }
        }).start();

        new Thread(
                () -> System.out.println("JDK1.8，无参函数的简写")
        ).start();

        //带参函数的简写
        //通过内部类重载了comparator接口的compare()方法
        List<String> list = Arrays.asList("I","love","you","too");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1 == null)
                    return -1;
                if(o2 == null)
                    return 1;
                return o1.length() - o2.length();
            }
        });
        //JDK1.8写法
        Collections.sort(list, (s1, s2) ->{// 省略参数表的类型
            if(s1 == null)
                return -1;
            if(s2 == null)
                return 1;
            return s1.length()-s2.length();
        });

        Semaphore semaphore = new Semaphore(0);


    }
}

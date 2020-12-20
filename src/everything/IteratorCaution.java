package everything;

import java.util.ArrayList;
import java.util.Iterator;

/*删除list中元素的四种方法:
1、删除下标以及定位到遍历位置
2、使用Iterator接口实现遍历及删除
3、从大到小进行删除
4、通过CopyOnWriteArrayList解决list的并发问题
*/
public class IteratorCaution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abcabc");
        list.add("abc");
        list.add("a");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            if(s.contains("abc" )){
                it.remove();
                //不能用下面的写法，因为list在循环中的时候是不可以删除它的元素的
                //list.remove(s);
            }
        }
        System.out.println(list);
    }
}

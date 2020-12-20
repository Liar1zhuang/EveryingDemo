package newFeature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringValue {
    public static void main(String[] args) {
        List<Map> list = new ArrayList<>();
        Map<String,String> map1 = new HashMap<>();
        map1.put("value","Meta");
        Map<String,String> map2 = new HashMap<>();
        map2.put("value","App");
        list.add(map1);
        list.add(map2);

        String val = null;
        for (Map x : list){
            val = x.get("value").toString();
        }
        System.out.println(val);
    }
}

package newFeature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMerge {
    public static void main(String[] args) {
        List<String> words = Stream.of("foo","foo","foo","foo","bar").collect(Collectors.toList());
//        Map<String,Integer> map = oldMerge(words);
        Map<String,Integer> map = newMerge(words);
        System.out.println(map.get("foo"));
    }

    public static Map<String,Integer> oldMerge(List<String> words){
        HashMap<String,Integer> map = new HashMap<>();
        words.forEach(word -> {
            Integer prev = map.get(word);
            if(prev == null){
                map.put(word,1);
            }else{
                map.put(word,prev+1);
            }
        });

        return map;
    }

    public static Map<String,Integer> newMerge(List<String> words){
        HashMap<String,Integer> map = new HashMap();
        words.forEach(word -> {
//            map.merge(word,1,Integer::sum);
            map.merge(word,1,(pre,one) -> pre+one);
        });
        return map;
    }
}

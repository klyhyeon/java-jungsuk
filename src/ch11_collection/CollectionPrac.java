package ch11_collection;

import java.util.*;

public class CollectionPrac {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("s");
        list.add("e");
        list.add("t");
        System.out.println(list);
        list.sort(Comparator.comparing(s -> s));
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("key1", "newValue1");
        map.put("key2", "newValue2");
        Set<Map.Entry<String, String>> entryMap = map.entrySet();
        for (Map.Entry<String, String> entrySetEle : entryMap) {
            entrySetEle.setValue("sameValue");
        }
        entryMap.forEach(System.out::println);

        Stack s = new Stack();
        Queue q = new ArrayDeque();
    }

    public int hashCode() {
        return Objects.hash("name", "age");
    }

}

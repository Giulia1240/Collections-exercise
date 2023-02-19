package map.hashmap.answer;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTwo {
    public void hashMapTwo() {

        HashMap<String, String> cookies = new HashMap<>();

        cookies.put("flavor", "chocolate");
        cookies.put("flavor", "baunilha");
        cookies.put("flavor", "Strawberry");

        System.out.println();
        String containsKey = (cookies.containsKey(2)) ? "true: " + cookies : "false";
        System.out.println("Test if a map contains a mapping for the specified key" + containsKey);


        System.out.println();
        String containsValue = (cookies.containsValue("Dark Chocolate")) ? "true: " + cookies : "false";
        System.out.println("Test if a map contains a mapping for the specified value" + containsValue);


        System.out.println();
        for (String e : cookies.keySet()) {
            System.out.println();
            System.out.println("Get the value of a specified key in a map" + cookies.get(e));
        }

        for(String valueKey :cookies.values()){
            System.out.println();
            System.out.println("Get a collection view of the values contained in this map"+valueKey);
        }

    }
}

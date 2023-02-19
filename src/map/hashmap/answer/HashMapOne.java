package map.hashmap.answer;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapOne {
    public void hashMapOne() {
        HashMap<String, String> cookies = new HashMap<>();

        cookies.put("flavor", "chocolate");
        cookies.put("flavor", "baunilha");
        cookies.put("flavor", "Strawberry");

        System.out.println("Associate the specified value with the specified key in a HashMap:" + cookies);

        cookies.size();
        System.out.println();
        System.out.println("Count the number of key-value (size) mappings in a map:" + cookies);

        HashMap<String, String> cookieShop = new HashMap<>();
        cookieShop.putAll(cookies);
        System.out.println();
        System.out.println("Copy all of the mappings from the specified map to another map" + cookieShop);

        cookies.clear();
        System.out.println();
        System.out.println("Remove all of the mappings from a map" + cookies);

        System.out.println();
        Set<String> cookiesKeySet = cookies.keySet();

        for (String key : cookiesKeySet) {
            String containsCookies = (cookies.isEmpty()) ? "True" : "false";
            System.out.println();
            System.out.println("Check whether a map contains key-value mappings (empty) or not" + containsCookies);
        }

        for (String e : cookiesKeySet) {
            String getCookies = cookies.get(e);
            System.out.println();
            System.out.println("get a shallow copy of a HashMap instance" + getCookies);
        }

    }
}

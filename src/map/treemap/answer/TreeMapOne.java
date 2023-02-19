package map.treemap.answer;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapOne {
   public void TreeMapOne() {
//        1. Write a Java program to associate the specified value with the specified key in a Tree Map. Go to the editor
//        2. Write a Java program to copy a Tree Map content to another Tree Map. Go to the editor
//        3. Write a Java program to search a key in a Tree Map. Go to the editor
//        4. Write a Java program to search a value in a Tree Map. Go to the editor
//        5. Write a Java program to get all keys from the given a Tree Map. Go to the editor
//        6. Write a Java program to delete all elements from a given Tree Map. Go to the editor
//        7. Write a Java program to sort keys in Tree Map by using comparator. Go to the editor
//        8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map. Go to the editor
//        9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map. Go to the editor
//        10. Write a Java program to get a reverse order view of the keys contained in a given map. Go to the editor

        TreeMap<Integer, String> sibling = new TreeMap<>();
        sibling.put(2, "SISTER");
        sibling.put(1, "SISTER IN LAW");
        sibling.put(3, "BROTHER");
        sibling.put(4, "AUNT");
        sibling.put(5, "GRANDMOTHER");
        sibling.put(6, "COUSIN");
        sibling.put(7, "UNCLE");
        sibling.put(8, "SISTER");

        for (Map.Entry<Integer, String> entry : sibling.entrySet()) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
        System.out.println("associate the specified value with the specified key in a Tree Map" + sibling);

        System.out.println();
        TreeMap<Integer, String> familyTest = new TreeMap<>();
        familyTest.put(1, "GRANDMOTHER");
        familyTest.put(2, "GRANDFATHER");
        familyTest.put(3, "WIFE");
        familyTest.put(4, "HUSBAND");
        sibling.putAll(sibling);
        System.out.println("copy a Tree Map content to another Tree Map" + familyTest.size());

        System.out.println();
        String y = sibling.containsKey(3) ? "true" : "false";
        System.out.println("search a key in a Tree Map" + y);

        System.out.println();
        String x = sibling.containsValue("AUNT") ? "true" : "false";
        System.out.println("search a value in a Tree Map" + sibling);

        System.out.println();
        Set<Integer> keys = sibling.keySet();
        for (Integer key : keys) {
            System.out.println("get all keys from the given a Tree Map" + key);
        }

        System.out.println();
        TreeMap<Integer, String> deleteFamily = new TreeMap<>();
        deleteFamily.put(0, "FAMILY");
        deleteFamily.putAll(sibling);
        deleteFamily.clear();
        System.out.println("delete all elements from a given Tree Map" + deleteFamily);

        System.out.println();
        TreeMap<String, String> tree_map1 = new TreeMap<String, String>(new sort_key());

        tree_map1.put("C2", "FORLIN");
        tree_map1.put("C3", "CAVALCANTI");
        tree_map1.put("C4", "SILVA");
        tree_map1.put("C5", "TOMINAGA");
        tree_map1.put("C6", "SETO");
        tree_map1.put("C7", "FERREIRA");
        System.out.println("sort keys in Tree Map by using comparator" + tree_map1);

        System.out.println();
        sibling.firstEntry();
        sibling.lastEntry();
        System.out.println("program to get a key-value mapping associated with the greatest key and the least key in a map");

        System.out.println();
        sibling.firstKey();
        sibling.lastKey();
        System.out.println("get the first (lowest) key and the last (highest) key currently in a map" + sibling);

        System.out.println();
        sibling.descendingKeySet();
        System.out.println("get a reverse order view of the keys contained in a given map");
    }
}

class sort_key implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }

}
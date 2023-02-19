package map.treemap.answer;

import java.util.TreeMap;

public class TreeMapTwo {
    public void TreeMapTwo() {

//        11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key. Go to the editor
//        12. Write a Java program to get the greatest key less than or equal to the given key. Go to the editor
//        13. Write a Java program to get the portion of a map whose keys are strictly less than a given key. Go to the editor
//        14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key. Go to the editor
//        15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key. Go to the editor
//        16. Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key. Go to the editor
//        17. Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key. Go to the editor
//        18. Write a Java program to get NavigableSet view of the keys contained in a map. Go to the editor
//        19. Write a Java program to remove and get a key-value mapping associated with the least key in a map. Go to the editor
//        20. Write a Java program to remove and get a key-value mapping associated with the greatest key in this map. Go to the editor

        TreeMap<Integer, String> sibling = new TreeMap<>();
        sibling.put(2, "SISTER");
        sibling.put(1, "SISTER IN LAW");
        sibling.put(3, "BROTHER");
        sibling.put(4, "AUNT");
        sibling.put(5, "GRANDMOTHER");
        sibling.put(6, "COUSIN");
        sibling.put(7, "UNCLE");
        sibling.put(8, "SISTER");

        System.out.println();
        System.out.println("get a key-value mapping associated with the greatest key less than or equal to the given key ");
        System.out.println(" Checking the entry for 10:: " + sibling.floorEntry(10));
        System.out.println(" Checking the entry for 30: " + sibling.floorEntry(30));
        System.out.println(" Checking the entry for 70: " + sibling.floorEntry(70));

        System.out.println();
        sibling.floorKey(6);
        sibling.floorKey(8);
        System.out.println("get the greatest key less than or equal to the given key");

        System.out.println();
        sibling.headMap(3);
        System.out.println("get the portion of a map whose keys are strictly less than a given key");

        System.out.println();
        sibling.subMap(3, true, 4, true);
        System.out.println("get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key");

        System.out.println();
        sibling.higherEntry(5);
        System.out.println("get the least key strictly greater than the given key. Return null if there is no such key" + sibling);

        System.out.println();
        sibling.lowerEntry(7);
        System.out.println("get a key-value mapping associated with the greatest key strictly less than the given key" + sibling);

        System.out.println();
        sibling.lowerKey(3);
        System.out.println("get the greatest key strictly less than the given key" + sibling);

        System.out.println();
        sibling.navigableKeySet();
        System.out.println("get NavigableSet view of the keys contained in a map" + sibling);

        System.out.println();
        sibling.pollFirstEntry();
        System.out.println("remove and get a key-value mapping associated with the least key in a map" + sibling);

        System.out.println();
        sibling.pollLastEntry();
        System.out.println("remove and get a key-value mapping associated with the greatest key in this map" + sibling);
    }
}

package map.treemap.answer;

import java.util.TreeMap;

public class TreeMapThree {
    public void treeMapThree() {

//        21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive). Go to the editor
//        22. Write a Java program to get the portion of a map whose keys range from a given key to another key. Go to the editor
//        23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key. Go to the editor
//        24. Write a Java program to get a portion of a map whose keys are greater than to a given key. Go to the editor
//        25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key. Go to the editor
//        26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key. Go to the editor

        System.out.println();
        TreeMap<Integer, String> name = new TreeMap<>();
        name.put(1, "PAULO");
        name.put(2, "ANDRE");
        name.put(3, "MATHEUS");
        name.put(4, "JOANA");
        name.subMap(1, 2);
        System.out.println("get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive)" + name);

        System.out.println();
        TreeMap<Integer, String> mapContent = new TreeMap<>(name);
        TreeMap<Integer, String> nameRd = new TreeMap<>();
        nameRd.putAll(name);
        nameRd.subMap(1, true, 3, true);
        System.out.println("Original TreeMap content: " + mapContent);
        System.out.println("get the portion of a map whose keys range from a given key to another key" + nameRd);

        System.out.println();
        nameRd.tailMap(2);
        System.out.println("Original TreeMap content: " + mapContent);
        System.out.println("get a portion of a map whose keys are greater than or equal to a given key" + nameRd);

        System.out.println();
        nameRd.tailMap(2, false);
        System.out.println("Original TreeMap content: " + mapContent);
        System.out.println("get a portion of a map whose keys are greater than to a given key");

        System.out.println();
        TreeMap<Integer, String> nameCeilingEntry = new TreeMap<>();
        nameCeilingEntry.putAll(name);
        nameCeilingEntry.ceilingKey(3);
        System.out.println("Original TreeMap content: " + mapContent);
        System.out.println("get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such Key" + nameCeilingEntry);

        System.out.println();
        name.ceilingEntry(4);
        System.out.println("Original TreeMap content: " + mapContent);
        System.out.println(" get the least key greater than or equal to the given key. Return null if there is no such Key");


    }

}

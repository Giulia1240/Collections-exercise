package map.treemap;

import map.treemap.answer.TreeMapOne;
import map.treemap.answer.TreeMapThree;
import map.treemap.answer.TreeMapTwo;

import java.util.Scanner;

public class ProgramTreeMap {
    public void programTreeMap() {
        /*
        1. Write a Java program to associate the specified value with the specified key in a Tree Map. Go to the editor
        2. Write a Java program to copy a Tree Map content to another Tree Map. Go to the editor
        3. Write a Java program to search a key in a Tree Map. Go to the editor
        4. Write a Java program to search a value in a Tree Map. Go to the editor
        5. Write a Java program to get all keys from the given a Tree Map. Go to the editor
        6. Write a Java program to delete all elements from a given Tree Map. Go to the editor
        7. Write a Java program to sort keys in Tree Map by using comparator. Go to the editor
        8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map. Go to the editor
        9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map. Go to the editor
        10. Write a Java program to get a reverse order view of the keys contained in a given map. Go to the editor
        11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key. Go to the editor
        12. Write a Java program to get the greatest key less than or equal to the given key. Go to the editor
        13. Write a Java program to get the portion of a map whose keys are strictly less than a given key. Go to the editor
        14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key. Go to the editor
        15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key. Go to the editor
        16. Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key. Go to the editor
        17. Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key. Go to the editor
        18. Write a Java program to get NavigableSet view of the keys contained in a map. Go to the editor
        19. Write a Java program to remove and get a key-value mapping associated with the least key in a map. Go to the editor
        20. Write a Java program to remove and get a key-value mapping associated with the greatest key in this map. Go to the editor
        21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive). Go to the editor
        22. Write a Java program to get the portion of a map whose keys range from a given key to another key. Go to the editor
        23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key. Go to the editor
        24. Write a Java program to get a portion of a map whose keys are greater than to a given key. Go to the editor
        25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key. Go to the editor
        26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key. Go to the editor
         * */
        Scanner sc = new Scanner(System.in);

        TreeMapOne one = new TreeMapOne();
        TreeMapTwo two = new TreeMapTwo();
        TreeMapThree three = new TreeMapThree();

        System.out.println("TREEMAP=========================");
        System.out.println("Choose the desired option: ");
        System.out.println("1- Answer exercise 01,02,03,04,05,06,07,08,09,10");
        System.out.println("2- Answer exercise 07,08,09,10,11,12,13,14,15,16,17,18,19,20");
        System.out.println("3- Answer exercise 21,22,23,24,25,26");

        int op = sc.nextInt();
        switch (op) {
            case 1:
                one.TreeMapOne();
            case 2:
                two.TreeMapTwo();
            case 3:
                three.treeMapThree();
            default:
                System.out.println("invalid option");
        }

    }
}

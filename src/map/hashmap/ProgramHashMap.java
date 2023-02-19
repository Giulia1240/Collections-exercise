package map.hashmap;

import map.hashmap.answer.HashMapOne;
import map.hashmap.answer.HashMapTwo;

import java.util.Scanner;

public class ProgramHashMap {
    public void programHashMap() {
        /*
        1. Write a Java program to associate the specified value with the specified key in a HashMap. Go to the editor
        2. Write a Java program to count the number of key-value (size) mappings in a map. Go to the editor
        3. Write a Java program to copy all of the mappings from the specified map to another map. Go to the editor
        4. Write a Java program to remove all of the mappings from a map. Go to the editor
        5. Write a Java program to check whether a map contains key-value mappings (empty) or not. Go to the editor
        6. Write a Java program to get a shallow copy of a HashMap instance. Go to the editor
        7. Write a Java program to test if a map contains a mapping for the specified key. Go to the editor
        8. Write a Java program to test if a map contains a mapping for the specified value. Go to the editor
        9. Write a Java program to create a set view of the mappings contained in a map. Go to the editor
        10. Write a Java program to get the value of a specified key in a map. Go to the editor
        11. Write a Java program to get a set view of the keys contained in this map. Go to the editor
        12. Write a Java program to get a collection view of the values contained in this map. Go to the editor

         * */
        Scanner sc = new Scanner(System.in);
        HashMapOne hashMapOne = new HashMapOne();
        HashMapTwo hashMapTwo = new HashMapTwo();

        System.out.println("HASHMAP==================================");
        System.out.println("Choose the desired option: ");
        System.out.println("1- Answer exercise 01,02,03,04,05 and 06");
        System.out.println("2- Answer exercise 07,08,09,10,11 and 12");

        int op = sc.nextInt();
        switch (op) {
            case 1:
                hashMapOne.hashMapOne();
                break;
            case 2:
                hashMapTwo.hashMapTwo();
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}

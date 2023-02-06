package set.hashset;

import set.hashset.answer.HashSetOne;
import set.hashset.answer.HashSetTwo;

import java.util.Scanner;

public class ProgramHashSet {
    public static void main(String[] args) {
        /*
        1. Write a Java program to append the specified element to the end of a hash set. Go to the editor
        2. Write a Java program to iterate through all elements in a hash list. Go to the editor
        3. Write a Java program to get the number of elements in a hash set. Go to the editor
        4. Write a Java program to empty an hash set. Go to the editor
        5. Write a Java program to test a hash set is empty or not. Go to the editor
        6. Write a Java program to clone a hash set to another hash set. Go to the editor
        7. Write a Java program to convert a hash set to an array. Go to the editor
        8. Write a Java program to convert a hash set to a tree set. Go to the editor
        9. Write a Java program to convert a hash set to a List/ArrayList. Go to the editor
        10. Write a Java program to compare two hash set. Go to the editor
        */

        HashSetOne hashOne = new HashSetOne();
        HashSetTwo hasTwo = new HashSetTwo();

        System.out.println("Choose the desired option: ");
        System.out.println("1- Answer exercise 01,02,03,04 and 05");
        System.out.println("2- Answer exercise 06,07,08,09 and 10");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                hashOne.hashSetOne();
                break;
            case 2:
                hasTwo.hashSetTwo();
                break;
            default:
                System.out.println("option invalidated");
        }
    }
}

package list.arraylist;

import list.arraylist.answer.*;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    /*
    1. Write a Java program to create a new array list,// add some colors (string) and print out the collection.
    2.Write a Java program to iterate through all elements  in a array list.
    3.Write a Java program to insert an element into the array list at the first position
    4.Write a Java program to retrieve an element (at a specified index) from a given array list.
    5. Write a Java program to update specific array element by given element. Go to the editor
    6. Write a Java program to remove the third element from a array list. Go to the editor
    7. Write a Java program to search an element in a array list. Go to the editor
    8. Write a Java program to sort a given array list. Go to the editor
    9. Write a Java program to copy one array list into another. Go to the editor
    10. Write a Java program to shuffle elements in a array list. Go to the editor
    11. Write a Java program to reverse elements in a array list. Go to the editor
    12. Write a Java program to extract a portion of a array list. Go to the editor
    13. Write a Java program to compare two array lists. Go to the editor
    14. Write a Java program of swap two elements in an array list. Go to the editor
    15. Write a Java program to join two array lists. Go to the editor
    16. Write a Java program to clone an array list to another array list. Go to the editor
    17. Write a Java program to empty an array list. Go to the editor
    18. Write a Java program to test an array list is empty or not. Go to the editor
    19. Write a Java program to trim the capacity of an array list the current list size. Go to the editor
    20. Write a Java program to increase the size of an array list. Go to the editor
    21. Write a Java program to replace the second element of a ArrayList with the specified element. Go to the editor
    22. Write a Java program to print all the elements of a ArrayList using the position of the elements. Go to the editor
     */
        Scanner sc = new Scanner(System.in);

        ArraysListOne arraysLists = new ArraysListOne();
        ArrayListTwo arrayListTwo = new ArrayListTwo();
        ArrayListThree modOne = new ArrayListThree();
        ArrayListSix modTwo = new ArrayListSix();
        ArrayListFive modThree = new ArrayListFive();
        ArrayListFour modFor = new ArrayListFour();


        System.out.println("Choose the desired option: ");
        System.out.println("1- Answer exercise 01");
        System.out.println("2- Answer exercise 02");
        System.out.println("3- Answer exercise 03,04,05 and 06");
        System.out.println("4- Answer exercise 07,08,09 and 10");
        System.out.println("5- Answer exercise 11,12,13 and 14");
        System.out.println("6- Answer exercise 15,16 and 17");

        int op = sc.nextInt();

        switch (op) {
            case 1:
                arraysLists.arrayListProgramElements();
                break;
            case 2:
                arrayListTwo.iteratorArraysElements();
                break;
            case 3:
                modOne.modifyingArrayElements();
                break;
            case 4:
                modTwo.modifyingArrayElementsTwo();
                break;
            case 5:
                modThree.modifyingArrayElementsThree();
                break;
            case 6:
                modFor.modifyingArrayElementsFor();
                break;
            default:
                System.out.println("option invalidated");
                break;
        }

    }
}

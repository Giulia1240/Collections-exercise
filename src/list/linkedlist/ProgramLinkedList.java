package list.linkedlist;

import list.linkedlist.answer.*;

import java.util.Scanner;

public class ProgramLinkedList {
    public static void main(String[] args) {
    /*
    1. Write a Java program to append the specified element to the end of a linked list. Go to the editor
    2. Write a Java program to iterate through all elements in a linked list. Go to the editor
    3. Write a Java program to iterate through all elements in a linked list starting at the specified position. Go to the editor
    4. Write a Java program to iterate a linked list in reverse order. Go to the editor
    5. Write a Java program to insert the specified element at the specified position in the linked list. Go to the editor
    6. Write a Java program to insert elements into the linked list at the first and last position. Go to the editor
    7. Write a Java program to insert the specified element at the front of a linked list. Go to the editor
    8. Write a Java program to insert the specified element at the end of a linked list. Go to the editor
    9. Write a Java program to insert some elements at the specified position into a linked list. Go to the editor
    10. Write a Java program to get the first and last occurrence of the specified elements in a linked list. Go to the editor
    11. Write a Java program to display the elements and their positions in a linked list. Go to the editor
    12. Write a Java program to remove a specified element from a linked list. Go to the editor
    13. Write a Java program to remove first and last element from a linked list. Go to the editor
    14. Write a Java program to remove all the elements from a linked list. Go to the editor
    15. Write a Java program of swap two elements in a linked list. Go to the editor
    16. Write a Java program to shuffle the elements in a linked list. Go to the editor
    17. Write a Java program to join two linked lists. Go to the editor
    18. Write a Java program to clone an linked list to another linked list. Go to the editor
    19. Write a Java program to remove and return the first element of a linked list.
    20. Write a Java program to retrieve but does not remove, the first element of a linked list.
    21. Write a Java program to retrieve but does not remove, the last element of a linked list.
    22. Write a Java program to check if a particular element exists in a linked list.
    23. Write a Java program to convert a linked list to array list.
    24. Write a Java program to compare two linked lists. Go to the editor
    * */
        Scanner sc = new Scanner(System.in);

        LinkedListOne listOne = new LinkedListOne();
        LinkedListTwo listTwo = new LinkedListTwo();
        LinkedListThree listThree = new LinkedListThree();
        LinkedListFour listFour = new LinkedListFour();
        LinkedListFive listFive = new LinkedListFive();

        System.out.println("Choose the desired option: ");
        System.out.println("1- Answer exercise 01,02,03,04 and 05");
        System.out.println("2- Answer exercise 06,07,08,09 and 10");
        System.out.println("3- Answer exercise 10,11,12,13 ,14 and 15");
        System.out.println("4- Answer exercise 16,17,18,19 and 20");
        System.out.println("5- Answer exercise 20,21,22,23 and 24");

        int n = sc.nextInt();
        switch (n) {
            case 1:
                listOne.linkedList();
                break;
            case 2:
                listTwo.linkedListTwo();
                break;
            case 3:
                listThree.linkedListThree();
                break;
            case 4:
                listFour.linkedListFour();
                break;
            case 5:
                listFive.linkedFive();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}

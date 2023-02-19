package set.treeset;

import set.treeset.answer.TreeSetOne;
import set.treeset.answer.TreeSetTwo;

import java.util.Scanner;

public class ProgramTreeSet {
    public void treeSetProgram() {
        /*
        1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set. Go to the editor
        2. Write a Java program to iterate through all elements in a tree set. Go to the editor
        3. Write a Java program to add all the elements of a specified tree set to another tree set. Go to the editor
        4. Write a Java program to create a reverse order view of the elements contained in a given tree set. Go to the editor
        5. Write a Java program to get the first and last elements in a tree set. Go to the editor
        6. Write a Java program to clone a tree set list to another tree set. Go to the editor
        7. Write a Java program to get the number of elements in a tree set. Go to the editor
        8. Write a Java program to compare two tree sets. Go to the editor
        9. Write a Java program to find the numbers less than 7 in a tree set. Go to the editor
        10. Write a Java program to get the element in a tree set which is greater than or equal to the given element. Go to the editor
        11. Write a Java program to get the element in a tree set which is less than or equal to the given element. Go to the editor
        12. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element. Go to the editor
        13. Write a Java program to get an element in a tree set which is strictly less than the given element. Go to the editor
        14. Write a Java program to retrieve and remove the first element of a tree set. Go to the editor
        15. Write a Java program to retrieve and remove the last element of a tree set. Go to the editor
        16. Write a Java program to remove a given element from a tree set. Go to the editor
        */
        Scanner sc = new Scanner(System.in);

        TreeSetOne treesetOne = new TreeSetOne();
        TreeSetTwo treeSetTwo = new TreeSetTwo();

        System.out.println("TREESET===============================");
        System.out.println("Choose the desired option: ");
        System.out.println("1- Answer exercise 01,02,03,04 and 05");
        System.out.println("2- Answer exercise 06,07,08,09 and 10");
        System.out.println("3- Answer exercise 10,11,12,13 and 14");
        System.out.println("4- Answer exercise 15,16,17,18 and 19");

        int n = sc.nextInt();
        switch (n) {
            case 1:
                treesetOne.TreeSetOne();
                break;
            case 2:
                treeSetTwo.TreeSetTwo();
                break;
        }
    }
}

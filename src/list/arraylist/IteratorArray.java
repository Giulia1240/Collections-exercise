package list.arraylist;

import java.util.*;

public class IteratorArray {
    public void iteratorArraysElements() {
//        2.Write a Java program to iterate through all elements  in a array list.

        List<String> insertList = new ArrayList<>();

        System.out.println("Enter your color list: ");
        insertList.add("Vermelho");
        insertList.add("Laranja");
        insertList.add("Rosa");
        insertList.add("Verde");

        System.out.println();
        System.out.print("Original contents of insertList: ");
        Iterator itr;

        itr = insertList.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.print("Modified contents of insertList: ");
        ListIterator<String> litr = insertList.listIterator();

        while (litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + "+");
        }

        itr = insertList.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.print("Modified list backwards: ");
        while (litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

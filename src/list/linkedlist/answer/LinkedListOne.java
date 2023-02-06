package list.linkedlist.answer;

import java.util.Iterator;

public class LinkedListOne {

    public void linkedList() {

        java.util.LinkedList<String> link = new java.util.LinkedList<>();

        System.out.println("");
        System.out.println("Append the specified element to the end of a linked list");
        link.add("Amarelo");
        link.add("Vermelho");
        link.add("Azul");
        link.add("Verde");
        System.out.println(link);

        System.out.println("");
        System.out.println("Iterate through all elements in a linked list");
        for(String element:link){
            System.out.println(element);
        }

        System.out.println("");
        System.out.println("Iterate through all elements in a linked list starting at the specified position");
        Iterator iterator=link.listIterator(2);
        System.out.println(iterator);

        System.out.println("");
        System.out.println("Iterate a linked list in reverse order");
        Iterator iteratorreverse=link.descendingIterator();
        System.out.println(iteratorreverse);

        System.out.println("");
        System.out.println("Insert the specified element at the specified position in the linked list");
        link.add(2,"WHITE");
        System.out.println(link);

        System.out.println("");
        System.out.println("insert elements into the linked list at the first and last position");
        link.addFirst("GREEN");
        System.out.println(link);
    }
}

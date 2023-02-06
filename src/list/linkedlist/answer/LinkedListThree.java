package list.linkedlist.answer;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListThree {
    public void linkedListThree() {

        LinkedList<String> listThree = new LinkedList<>();
        listThree.add("Amarelo");
        listThree.add("Vermelho");
        listThree.add("Azul");
        listThree.add("Verde");
        System.out.println(listThree);

        System.out.println("display the elements and their positions in a linked list");
        for (int i = 0; i < listThree.size(); i++) {
            System.out.println("Element at index " + i + ": " + listThree.get(i));
        }

        System.out.println("remove a specified element from a linked list");
        String removing = listThree.remove(3);
        System.out.println(removing);

        System.out.println("remove all the elements from a linked list");
        listThree.clear();
        System.out.println(listThree);

        System.out.println("swap two elements in a linked list");
        listThree.add("Amarelo");
        listThree.add("Vermelho");
        listThree.add("Azul");
        Collections.swap(listThree, 1, 3);
        System.out.println(listThree);
    }
}

package list.linkedlist.answer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListFive {

    public void linkedFive() {

        LinkedList<String> color = new LinkedList<>();
        color.add("RED");
        color.add("BLACK");
        color.add("PINK");
        System.out.println(color);

        LinkedList<String> colorTwo = new LinkedList<>();
        colorTwo.add("YELLOW");
        colorTwo.add("PURPLE");
        colorTwo.add("LILAC");

        System.out.println();
        color.peekFirst();
        System.out.println("retrieve but does not remove, the first element of a linked list" + color);

        System.out.println();
        color.peekLast();
        System.out.println("retrieve but does not remove, the last element of a linked list" + color);

        System.out.println();
        System.out.println("check if a particular element exists in a linked list");
        Scanner sc = new Scanner(System.in);
        String write = sc.nextLine();
        String out = (color.contains(write)) ? "The Color is present in the linked list" + color : "The Color isn't present in the linked list";
        System.out.println(out);

        System.out.println("convert a linked list to array list");
        List<String> convert= new ArrayList<>(color);
        System.out.println(convert);

        System.out.println("compare two linked lists");
        LinkedList<String>compare=new LinkedList<>();
        for(String element:color){
            compare.add(colorTwo.contains(element) ? "Yes" : "No");
            System.out.println(compare);
        }


    }
}

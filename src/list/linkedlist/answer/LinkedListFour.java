package list.linkedlist.answer;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListFour {
    public void linkedListFour() {

        LinkedList<String> color = new LinkedList<>();
        color.add("RED");
        color.add("BLACK");
        color.add("PINK");

        LinkedList<String> colorTwo = new LinkedList<>();
        colorTwo.add("YELLOW");
        colorTwo.add("PURPLE");
        colorTwo.add("LILAC");

        Collections.shuffle(color);
        System.out.println("Shuffle the elements in a linked list. Go to the editor " + color);

        System.out.println();
        LinkedList<String> joinColor = new LinkedList<>();
        joinColor.addAll(color);
        joinColor.addAll(colorTwo);
        System.out.println("Join two linked lists" + joinColor);

        System.out.println();
        LinkedList<String> cloneColor = new LinkedList<String>();
        cloneColor.clone();
        System.out.println("Clone an linked list to another linked list" + cloneColor);

        System.out.println();
        String colorPop = color.pop();
        System.out.println("Linked list after pop operation: " + colorPop);

    }
}

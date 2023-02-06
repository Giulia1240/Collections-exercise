package list.linkedlist.answer;

public class LinkedListTwo {

    public void linkedListTwo() {
        java.util.LinkedList<String> linkTwo = new java.util.LinkedList<>();
        java.util.LinkedList<String> linkB = new java.util.LinkedList<>();

        linkTwo.add("Amarelo");
        linkTwo.add("Vermelho");
        linkTwo.add("Azul");
        linkTwo.add("Verde");
        System.out.println(linkTwo);

        System.out.println();
        System.out.println("insert elements into the linked list at the first and last position");
        linkTwo.addFirst("GREEN");
        linkTwo.addLast("Violet");
        System.out.println(linkTwo);

        System.out.println();
        System.out.println("insert the specified element at the front of a linkedList list");
        linkTwo.offerFirst("PINK");
        System.out.println(linkTwo);

        System.out.println();
        System.out.println("insert the specified element at the end of a linked list");
        linkB.add("Rosa");
        linkB.add("Amarelo");
        linkB.add("Roxo");
        linkB.add("Marrom");
        linkTwo.addAll(linkB);
        System.out.println(linkTwo);

        System.out.println();
        linkTwo.getFirst();
        System.out.println("get the first occurrence of the specified elements in a linked list: "+linkTwo);

        System.out.println();
        linkTwo.getLast();
        System.out.println("get the last occurrence of the specified elements in a linked list: "+linkTwo);
    }
}

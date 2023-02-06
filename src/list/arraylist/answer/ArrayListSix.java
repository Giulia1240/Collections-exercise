package list.arraylist.answer;

import java.util.*;

public class ArrayListSix {
    public void modifyingArrayElementsTwo() {
//        7. Write a Java program to search an element in a array list. Go to the editor
//        8. Write a Java program to sort a given array list. Go to the editor
//        9. Write a Java program to copy one array list into another. Go to the editor
//        10. Write a Java program to shuffle elements in a array list. Go to the editor

        Scanner sc = new Scanner(System.in);
        List<String> scolor = new ArrayList<>();
        List<String> scolorTwo = new ArrayList<>();

        int n = 3;
        for (int i = 0; i < n; i++) {
            String color = sc.nextLine();
            scolorTwo.add(color);
        }

        scolor.add("Vermelho");
        scolor.add("Laranja");
        scolor.add("Rosa");
        scolor.add("Verde");

        System.out.println();
        System.out.println("remove the third element from a array list");
        String delete = scolor.remove(1);
        System.out.println(delete);

        System.out.println();
        System.out.println("Search the element from a array list");
        if ((scolor.contains("Red"))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println();
        System.out.println("Sort a given array list: ");
        Collections.sort(scolor);
        System.out.println(scolor);

        System.out.println();
        System.out.println("Copy one array list into another : ");
        Collections.copy(scolor, scolorTwo);
        System.out.println(scolor);

        System.out.println();
        System.out.println("Shuffle one array list into another : ");
        Collections.shuffle(scolor);
        System.out.println(scolor);
    }
}

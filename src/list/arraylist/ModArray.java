package list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ModArray {
    public void modifyingArrayElements() {
//      3.Write a Java program to insert an element into the array list at the first position
//      4.Write a Java program to retrieve an element (at a specified index) from a given array list.
//        5. Write a Java program to update specific array element by given element. Go to the editor
//        6. Write a Java program to remove the third element from a array list. Go to the editor

        List<String> scolor = new ArrayList<>();

        scolor.add("Vermelho");
        scolor.add("Laranja");
        scolor.add("Rosa");
        scolor.add("Verde");

        System.out.println();
        System.out.println("Insert an element into the array list at the first position");
        scolor.add(0, "Azul");
        scolor.add(2, scolor.get(3));
        System.out.println(scolor);

        System.out.println();
        System.out.println("Retrieve an element (at a specified index) from a given array list");
        String select = scolor.get(3);
        System.out.println(select);

        System.out.println();
        System.out.println("Update specific array element by given element");
        String update = scolor.set(2, "ROXO");
        System.out.println(update);

        System.out.println();
        System.out.println("remove the third element from a array list");
        String delete = scolor.remove(1);
        System.out.println(delete);


    }
}

package list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ModArrayFor {
    public void modifyingArrayElementsFor() {

        Scanner sc = new Scanner(System.in);
        List<String> scolor = new ArrayList<>();
        List<String> scolorTwo = new ArrayList<>();

        scolor.add("Vermelho");
        scolor.add("Laranja");
        scolor.add("Rosa");
        scolor.add("Verde");

        scolorTwo.add("Rosa");
        scolorTwo.add("Amarelo");
        scolorTwo.add("Roxo");
        scolorTwo.add("Marrom");

        System.out.println(" ");
        System.out.println("join two array lists: ");
        scolor.addAll(scolorTwo);
        System.out.println(scolor);

        System.out.println(" ");
        System.out.println("clone an array list to another array list: ");
        ArrayList<String> teste = new ArrayList<String>();
        teste.add("Vermelho");
        teste.add("Laranja");
        teste.add("Rosa");
        teste.add("Verde");
        ArrayList<String> listClone = (ArrayList<String>) teste.clone();
        System.out.println(listClone);

        System.out.println(" ");
        System.out.println("empty an array list: ");
        scolorTwo.removeAll(scolorTwo);
        System.out.println(scolorTwo);

    }
}

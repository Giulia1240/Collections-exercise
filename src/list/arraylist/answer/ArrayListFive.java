package list.arraylist.answer;

import java.util.*;

public class ArrayListFive {
    public void modifyingArrayElementsThree() {

//        11. Write a Java program to reverse elements in a array list. Go to the editor
//        12. Write a Java program to extract a portion of a array list. Go to the editor
//        13. Write a Java program to compare two array lists. Go to the editor
//        14. Write a Java program of swap two elements in an array list. Go to the editor

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


        System.out.println();
        System.out.println("Reverse elements in a array list");
        Collections.reverse(scolor);
        System.out.println(scolor);

        System.out.println();
        System.out.println("Extract a portion of a array list");
        List<String>extractArray= scolor.subList(0,3);
        System.out.println(extractArray);

        System.out.println();
        System.out.println("Compare two array lists");
        List<String>compareArray= new ArrayList<>();
        for(String given: scolor){
            compareArray.add(scolorTwo.contains(given)?"Yes":"No");
            System.out.println(compareArray);
        }

        System.out.println();
        System.out.println("Swap two elements in an array list");
        for(String beforeSwap:scolor){
            System.out.println(beforeSwap);
        }
        System.out.println();
        Collections.swap(scolor,0,2);
        for(String afterSwap: scolor){
            System.out.println(afterSwap);
        }

    }
}

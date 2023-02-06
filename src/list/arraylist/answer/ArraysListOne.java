package list.arraylist.answer;

import java.util.*;

public class ArraysListOne {
    public void arrayListProgramElements() {
//        1. Write a Java program to create a new array list,// add some colors (string) and print out the collection.

        Scanner sc = new Scanner(System.in);
        List<String> palettaList = new ArrayList<>();

        int n = 3;
        System.out.println("Enter your color list: ");

        for (int i = 0; i < n; i++) {
            String color = sc.nextLine();
            palettaList.add(color);
        }
        System.out.println(palettaList);
        System.out.println(palettaList.size());
    }
}

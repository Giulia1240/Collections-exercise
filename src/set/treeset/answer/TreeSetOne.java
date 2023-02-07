package set.treeset.answer;

import java.util.*;

public class TreeSetOne {
    public void TreeSetOne(){

        TreeSet<String> colorPalette= new TreeSet<>();

        colorPalette.add("PINK");
        colorPalette.add("BLACK");
        colorPalette.add("BROWN");
        colorPalette.add("GRAY");
        colorPalette.add("PURPLE");
        System.out.println("Create a new tree set, add some colors (string) and print out the tree set"+colorPalette);

        System.out.println();
        Iterator iteratorTreeSet= colorPalette.iterator();
        System.out.println("Iterate through all elements in a tree set"+iteratorTreeSet);

        System.out.println();
        Set<String>listColorPalleteTwo= new TreeSet<>();
        listColorPalleteTwo.addAll(colorPalette);
        System.out.println("Add all the elements of a specified tree set to another tree set"+listColorPalleteTwo);

        System.out.println();
        Iterator listReverse=colorPalette.descendingIterator();
        while(listReverse.hasNext()){
            System.out.println("create a reverse order view of the elements contained in a given tree set");
        }

        System.out.println();
        colorPalette.first();
        colorPalette.last();
        System.out.println("get the first and last elements in a tree set"+colorPalette);

        System.out.println();
        TreeSet<String> newColorPalette= (TreeSet<String>)colorPalette.clone();
        System.out.println("clone a tree set list to another tree set"+newColorPalette);
    }
}

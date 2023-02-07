package set.treeset.answer;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTwo {
    public void TreeSetTwo() {
//
        TreeSet<String> colorPalette = new TreeSet<>();

        colorPalette.add("PINK");
        colorPalette.add("BLACK");
        colorPalette.add("BROWN");
        colorPalette.add("GRAY");
        colorPalette.add("PURPLE");
        System.out.println(colorPalette);

        System.out.println();
        TreeSet<String> newColorPalette = (TreeSet<String>) colorPalette.clone();
        System.out.println("clone a tree set list to another tree set" + newColorPalette);

        System.out.println();
        colorPalette.size();
        System.out.println("get the number of elements in a tree set" + colorPalette);

        System.out.println();
        for (String e : colorPalette) {
            String comparatorTreeSet = colorPalette.contains(newColorPalette) ? "yes" : "no";
            System.out.println("compare two tree sets" + comparatorTreeSet);
        }

        System.out.println();
        System.out.println("find the numbers less than 7 in a tree set");

        System.out.println();
        System.out.println("get the element in a tree set which is greater than or equal to the given element");

    }
}

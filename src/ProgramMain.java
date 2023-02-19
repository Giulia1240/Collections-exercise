import list.arraylist.ProgramArrayList;
import list.linkedlist.ProgramLinkedList;
import map.hashmap.ProgramHashMap;
import map.treemap.ProgramTreeMap;
import set.hashset.ProgramHashSet;
import set.treeset.ProgramTreeSet;

import java.util.Scanner;

public class ProgramMain {
    public static void main(String[] args) {

        ProgramArrayList arlist = new ProgramArrayList();
        ProgramLinkedList linklist = new ProgramLinkedList();

        ProgramHashSet hashst = new ProgramHashSet();
        ProgramTreeSet trest = new ProgramTreeSet();

        ProgramHashMap programHashMap = new ProgramHashMap();
        ProgramTreeMap programTreeMap = new ProgramTreeMap();

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your option: ");
        System.out.println(" 1-ARRAY LIST ");
        System.out.println(" 2-LINKED LIST ");
        System.out.println(" 3-HASHSET ");
        System.out.println(" 4-TREESET ");
        System.out.println(" 5- HASHMAP ");
        System.out.println(" 6-TREEMAP ");

        int option = sc.nextInt();
        switch (option) {
            case 1:
                arlist.programArrayList();
                break;
            case 2:
                linklist.programLinkedList();
                break;
            case 3:
                hashst.programHashSet();
                break;
            case 4:
                trest.treeSetProgram();
                break;
            case 5:
                programHashMap.programHashMap();
                break;
            case 6:
                programTreeMap.programTreeMap();
                break;
            default:
                System.out.println("The option is not exist");
                break;
        }


    }
}

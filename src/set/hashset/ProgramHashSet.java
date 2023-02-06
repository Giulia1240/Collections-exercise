package set.hashset;

import set.hashset.answer.HashSetOne;

import java.util.Scanner;

public class ProgramHashSet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashSetOne hashOne= new HashSetOne();

        System.out.println("Choose the desired option: ");
        System.out.println("1- Answer exercise 01,02,03,04 and 05");
        System.out.println("2- Answer exercise 06,07,08,09 and 10");
        System.out.println("3- Answer exercise 10,11,12,13 ,14 and 15");

        int n=sc.nextInt();
        switch (n){
            case 1:
                hashOne.hashSetOne();
                break;
            default:
                System.out.println("option invalidated");
        }
    }
}

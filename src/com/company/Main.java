package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private List<String> nameList;
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Main mainClass = new Main();
        mainClass.testingLists();

    }

    private void testingLists() {

        nameList = new ArrayList<String>();

        nameList.add("Luke");
        nameList.add("Crystal");
        nameList.add("Chris");
        nameList.add("Bin");


        System.out.println("See all items in Array List:");
        for (String name : nameList) {
            System.out.println(name);
        }
        System.out.println("See a single item in the array list.");
        System.out.println(nameList.get(3));


        System.out.println("remove a single item and see what is left in the array list.");
        nameList.remove(0);

        for (String name : nameList) {
            System.out.println(name);
        }
        System.out.println("Viewing ArrayList using Iteration loop with numbers.");
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println((i + 1) + " " + nameList.get(i));
        }

        System.out.println("Which number would you like to remove?");
        int numberToRemove = input.nextInt() - 1;
        if (numberToRemove > nameList.size() || numberToRemove < 0) {
            System.out.println("That is not a valid number.");
        } else {
            nameList.remove(numberToRemove);
        }

        System.out.println("List out after taking out certain number.");
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println((i + 1) + " " + nameList.get(i));
        }

    }
}




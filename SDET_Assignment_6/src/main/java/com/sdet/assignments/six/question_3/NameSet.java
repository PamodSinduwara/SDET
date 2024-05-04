package com.sdet.assignments.six.question_3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class NameSet {
    private static Set<String> firstNameSet = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first names (type 'done' to finish):");
        String firstName;
        while (!(firstName = scanner.nextLine()).equalsIgnoreCase("done")) {
            addFirstName(firstName);
        }

        System.out.print("\nEnter a first name to search: ");
        String searchName = scanner.nextLine();
        if (searchFirstName(searchName)) {
            System.out.println("Name found in the set.");
        } else {
            System.out.println("Name not found in the set.");
        }

        System.out.println("\nAll first names in the set:");
        displayFirstNames();
    }

    private static void addFirstName(String firstName) {
        firstNameSet.add(firstName);
    }

    private static boolean searchFirstName(String firstName) {
        return firstNameSet.contains(firstName);
    }

    private static void displayFirstNames() {
        Iterator<String> iterator = firstNameSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

package com.sdet.assignments.six.question_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UserSortingExample {
    public static void main(String[] args) {
        ArrayList<UserAge> users = new ArrayList<>();
        users.add(new UserAge("Sinduwara", 24));
        users.add(new UserAge("Nimna", 32));
        users.add(new UserAge("Pradeep", 26));
        users.add(new UserAge("Hashini", 30));
        users.add(new UserAge("Krishan", 29));
        users.add(new UserAge("Isuru", 35));
        users.add(new UserAge("Gethmini", 26));
        users.add(new UserAge("Chathurya", 28));
        users.add(new UserAge("Kaveesha", 27));
        users.add(new UserAge("Adithya", 25));

        Collections.sort(users, Comparator.comparingInt(UserAge::getAge));

        System.out.println("Users sorted by age in ascending order:");
        for (UserAge user : users) {
            System.out.println(user);
        }

        Collections.sort(users, Comparator.comparingInt(UserAge::getAge).reversed());

        System.out.println("\nUsers sorted by age in descending order:");
        for (UserAge user : users) {
            System.out.println(user);
        }
    }
}

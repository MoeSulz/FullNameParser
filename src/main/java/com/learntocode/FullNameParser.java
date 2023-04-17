package com.learntocode;

import java.util.Arrays;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Full Name: ");
        String fullName = input.nextLine().trim();

        String[] split = fullName.split(" ");

        String firstName = split[0];
        String lastName = split[split.length - 1];
        String middleName = "";

        if (split.length == 3) {
            middleName = split[1];
        }

        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name" + lastName);
    }
}

package com.day19assignment;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    static boolean validate(String pattern, String input) {
        return Pattern.compile(pattern).matcher(input).matches();
    }

    public static void main(String[] args) {
        System.out.println("User Registration System needs to ensure all validations are in place during the User Entry.");

        // UseCase-1 Valid first name
        String firstNameRegex = "^[A-Z]{1}[a-z]{3,}$";
        System.out.println("Enter your first name:");
        String firstName = new Scanner(System.in).next();

        boolean isMatched = validate(firstNameRegex, firstName);
        if (isMatched)
            System.out.println("Valid first name");
        else
            System.out.println("Invalid first name");
    }
}

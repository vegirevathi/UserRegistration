package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    public static final String FIRST_NAME_REGEX = "^[A-Z]{1}[A-Za-z]{2,}$";
    private static final String LAST_NAME_REGEX = "^[A-Z]{1}[A-Za-z]{2,}$";

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
        return pattern.matcher(firstName).matches();
    }

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(LAST_NAME_REGEX);
        return pattern.matcher(lastName).matches();
    }
}

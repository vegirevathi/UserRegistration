package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    public static final String FIRST_NAME_REGEX = "^[A-Z]{1}[A-Za-z]{2,}$";
    private static final String LAST_NAME_REGEX = "^[A-Z]{1}[A-Za-z]{2,}$";
    private static final String EMAIL_REGEX_1 = "^([a-zA-Z0-9_\\-\\+]+)@([a-zA-Z1-9]+)\\.([a-zA-Z]{2,})$";
    private static final String EMAIL_REGEX_2 = "^([a-zA-Z0-9_\\-\\+]+)@([a-zA-Z1-9]+)\\.([a-zA-Z]{2,}+)\\.([A-Za-z]{2})$";
    private static final String EMAIL_REGEX_3 = "^([a-zA-Z0-9_\\-\\+]+)\\.([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z1-9]+)\\.([a-zA-Z]{2,})$";
    private static final String EMAIL_REGEX_4 = "^([a-zA-Z0-9_\\-\\+]+)\\.([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z1-9]+)\\.([a-zA-Z]{2,}+)\\.([A-Za-z]{2})$";
    private static final String PHONE_NUMBER_REGEX = "^([1-9]{2}+)[: :]([0-9]{10})$";
    private static final String PASSWORD_REGEX = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\\s).{8,15}$";

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
        return pattern.matcher(firstName).matches();
    }

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(LAST_NAME_REGEX);
        return pattern.matcher(lastName).matches();
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX_1);
        Pattern pattern1 = Pattern.compile(EMAIL_REGEX_2);
        Pattern pattern2 = Pattern.compile(EMAIL_REGEX_3);
        Pattern pattern3 = Pattern.compile(EMAIL_REGEX_4);

        if (pattern.matcher(email).matches() || pattern1.matcher(email).matches() || pattern2.matcher(email).matches() || pattern3.matcher(email).matches() )
            return true;
        else
            return false;
    }

    public boolean validatePhoneNUmber(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        return pattern.matcher(phoneNumber).matches();
    }

    public boolean validatePasswordRule(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        return pattern.matcher(password).matches();
    }
}

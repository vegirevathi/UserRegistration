package com.bridgelabz;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class UserRegistrationTest {

    private String email;
    private static UserRegistration userRegistration;
    private Boolean expectedValidation;

    @Test
    public void givenFirstName_whenProper_shouldReturn_True() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateFirstName("Revathi");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenFirstName_whenNotProper_shouldReturn_False() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateFirstName("revathi");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenLastName_whenProper_shouldReturn_True() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateLastName("Vegi");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenLastName_whenProper_shouldReturn_True_test2() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateLastName("vegi");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenEmail_whenProper_shouldReturn_True() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenEmail_whenProper_shouldReturn_True_test2() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateEmail("abc@bl.co");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenPhoneNumber_whenProper_shouldReturn_True() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePhoneNUmber("91 1234567890");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenPassword_whenProper_shouldReturn_True() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePasswordRule("Asdf1234");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenPassword_whenProper_shouldReturn_True_test2() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePasswordRule("asdfASDm");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenPassword_whenProper_shouldReturn_True_test3() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePasswordRule("asdfASD1@");
        Assert.assertTrue(isValid);
    }

    public UserRegistrationTest(String email, Boolean expectedValidation) {
        this.email = email;
        this.expectedValidation = expectedValidation;
    }

    @BeforeClass
    public static void initialize() {
        userRegistration = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc+100@gmail.com", true},
                {"abc@gmail.com.com", false},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false}
        });
    }

    @Test
    public void test() {
        System.out.println("Test email is : " + email);
        Assert.assertEquals(expectedValidation, userRegistration.validateEmail(email));

    }

}

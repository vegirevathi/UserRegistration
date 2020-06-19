package com.bridgelabz;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class UserRegistrationTest {

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
    public void givenFirstName_whenNotProper_shouldReturn_False2() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateFirstName("re");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenFirstName_whenNotProper_shouldReturn_True2() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateFirstName("Rev");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenLastName_whenProper_shouldReturn_True() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateLastName("Vegi");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenLastName_whenProper_shouldReturn_False_test2() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateLastName("vegi");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenLastName_whenProper_shouldReturn_False_test3() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateLastName("Ve");
        Assert.assertFalse(isValid);
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
    public void givenEmail_whenProper_shouldReturn_True_test3() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateEmail("abc@bl.co.in");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenEmail_whenProper_shouldReturn_True_test4() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateEmail("abc.xyz@bl.co");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenEmail_whenProper_shouldReturn_False_test() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateEmail("abc.xyz@bl");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenPhoneNumber_whenProper_shouldReturn_True() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePhoneNUmber("91 1234567890");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenPhoneNumber_whenProper_shouldReturn_False() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePhoneNUmber("91 12345678");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenPhoneNumber_whenProper_shouldReturn_False2() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePhoneNUmber("9112345678");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenPassword_whenProper_shouldReturn_False() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePasswordRule("asdf1234");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenPassword_whenProper_shouldReturn_False_test2() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePasswordRule("asdfASDm");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenPassword_whenProper_shouldReturn_False_test3() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePasswordRule("asdfASD1");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenPassword_whenProper_shouldReturn_False_test4() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePasswordRule("asdfASD");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenPassword_whenProper_shouldReturn_True_test5() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePasswordRule("asdfASD12@");
        Assert.assertTrue(isValid);
    }
}

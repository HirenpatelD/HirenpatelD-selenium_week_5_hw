package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.UUID;

public class RegisterPage extends Utility {

    // * 1.3	Verify the text “Register Account”.
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register Account']")
    WebElement registerAccount;

    public String verifyRegisterAccountText() {
        return getTextFromElement(registerAccount);
    }

    // * 2.3	Verify the text “Returning Customer”.
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement returningCustomerText;


    public String verifyTextReturningCustomerOnLoginPage() {
        return getTextFromElement(returningCustomerText);
    }

    // * 3.3	Enter First Name
    @CacheLookup
    @FindBy(id ="input-firstname" )
    WebElement firstName;
    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
    }

    // * 3.4	Enter Last Name
    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastName;
    public void enterLastName(String surname) {
        sendTextToElement(lastName, surname);
    }

    // * 3.5	Enter Email
    final String randomEmail = randomEmail();
    @CacheLookup
    @FindBy(id = "input-email" )
    WebElement email;

    public void enterEmail(String emailAddress) {
        sendTextToElement(email, emailAddress);
    }

    public static String randomEmail() {

        return "random-" + UUID.randomUUID().toString() + "@gmail.com";
    }

    // * 3.6	Enter Telephone
    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephoneNumber;

    public void enterTelephoneNumber(String phone) {
        sendTextToElement(telephoneNumber, phone);
    }
    // * 3.7	Enter Password

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;
    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    // * 3.8	Enter Password Confirm
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement confirmPasswordField;
    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    // * 3.9	Select Subscribe Yes radio button
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Yes']")
    WebElement subscribeRadioButton;
    public void clickOnSubscribeRadioButton() {
        clickOnElement(subscribeRadioButton);
    }

    // * 3.10	Click on Privacy Policy check box
    @CacheLookup
    @FindBy(css = "input[value='1'][name='agree']")
    WebElement privacyCheckBox;
    public void clickOnPrivacyPolicyCheckBox() {
        clickOnElement(privacyCheckBox);
    }

    // * 3.11	Click on Continue button
    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }
}


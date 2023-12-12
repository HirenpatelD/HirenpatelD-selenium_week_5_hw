package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Utility {

    // * 2.16	Verify the text “Checkout”
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Checkout']")
    WebElement checkOutText;
    public String verifyCheckOutText() {

        return getTextFromElement(checkOutText);
    }

    // * 2.17	Verify the Text “New Customer”
    @CacheLookup
    @FindBy(xpath = "(//h2[normalize-space()='New Customer'])[1]")
    WebElement checkNewCustomerText;

    public String verifyTextNewCustomer() throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(checkNewCustomerText);
    }

    // * 2.18	Click on “Guest Checkout” radio button
    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestCheckoutButton;
    public void clickOnGuestCheckOutButton() {
        clickOnElement(guestCheckoutButton);
    }
    // * 2.19	Click on “Continue” tab
    @CacheLookup
    @FindBy(css = "#button-account")
    WebElement continueTabButton;
    public void clickOnContinueButtonTab() {
        clickOnElement(continueTabButton);
    }

    // * 2.20	Fill the mandatory fields
    @CacheLookup
    @FindBy(id ="input-payment-firstname" )
    WebElement firstName;

    @CacheLookup
    @FindBy(id ="input-payment-lastname" )
    WebElement lastName;

    @CacheLookup
    @FindBy(id ="input-payment-email" )
    WebElement emailAddress;

    @CacheLookup
    @FindBy(id ="input-payment-telephone" )
    WebElement telephone;

    @CacheLookup
    @FindBy(id ="input-payment-address-1")
    WebElement addressField;

@CacheLookup
@FindBy(id = "input-payment-city")
WebElement cityName;

    @CacheLookup
    @FindBy(name = "postcode")
    WebElement zipCode;

    @CacheLookup
    @FindBy(id ="input-payment-country")
    WebElement countryName;

    @CacheLookup
    @FindBy(id ="input-payment-zone")
    WebElement zoneName;

    // * 2.21	Click on “Continue” Button
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement continueButton;
    public void clickOnContinueButtonForGuest() {
        clickOnElement(continueButton);
    }
    // * 2.22	Add Comments About your order into text area
    @CacheLookup
    @FindBy(xpath = "//textarea[@name='comment']")
    WebElement addCommentIn;

    public void addCommentsAboutYourOrderIntoTheTextArea(String comment) {
        sendTextToElement(addCommentIn, comment);
    }
    // * 2.23	Check the Terms & Conditions check box
    @CacheLookup
    @FindBy(css ="input[value='1'][name='agree']" )
    WebElement termsAndConditions;
    public void clickOnCheckBoxForTermsAndConditions() {
        clickOnElement(termsAndConditions);
    }

    // * 2.24	Click on “Continue” button
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement continueButtonForPayment;
    public void clickOnContinueButtonForPaymentMethod() {

        clickOnElement(continueButtonForPayment);
    }

    // * 2.25	Verify the message “Warning: Payment method required!”
    @CacheLookup
    @FindBy(xpath = "//div[@class ='alert alert-danger alert-dismissible']")
    WebElement checkWarningForPayment;
    public String verifyWarningMessageForPaymentMethod() {
        return getTextFromElement(checkWarningForPayment);
    }
    public void fillAllMandatoryField(String name, String surname, String email, String phone,
                                      String address, String city, String postcode, String country, String zone)  {

        sendTextToElement(firstName, name);
        sendTextToElement(lastName, surname);
        sendTextToElement(emailAddress, email);
        sendTextToElement(telephone, phone);
        sendTextToElement(addressField, address);
        sendTextToElement(cityName, city);
        sendTextToElement(zipCode, postcode);
        selectByVisibleTextFromDropDown(countryName, country);
        selectByVisibleTextFromDropDown(zoneName, zone);
    }

}


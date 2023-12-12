package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    //    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
//    @CacheLookup
//    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
//    WebElement welcomeText;
//
//    public String getWelcomeText() {
//        String message = getTextFromElement(welcomeText);
//        return message;
//    }
//
//    //    By emailField = By.id("Email");
//    @CacheLookup
//    @FindBy(id = "Email")
//    WebElement emailField;
//
//    public void enterEmailId(String email) {
//        sendTextToElement(emailField, email);
//        CustomListeners.test.log(Status.PASS, "Enter EmailId " + email);
//    }
//
//    //    By passwordField = By.name("Password");
//    @CacheLookup
//    @FindBy(name = "Password")
//    WebElement passwordField;
//
//    public void enterPassword(String password) {
//        sendTextToElement(passwordField, password);
//        CustomListeners.test.log(Status.PASS, "Enter Password " + password);
//    }
//
//    //    By loginLink = LinkText"Log in"
//    @CacheLookup
//    @FindBy(linkText = "Log in")
//    WebElement loginLink;
//
//    public void clickOnLoginLink() {
//        clickOnElement(loginLink);
//        CustomListeners.test.log(Status.PASS, "Click on loginLink");
//    }
//
//    //LoginButton
//    @CacheLookup
//    @FindBy(xpath ="(//button[normalize-space()='Log in'])[1]")
//            WebElement loginButton;
//    public void clickOnLoginButton(){
//        clickOnElement(loginButton);
//    }
//
//    //    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");
//    @CacheLookup
//    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
//    WebElement errorMessage;
//        public String getErrorMessage(){
//        String message = getTextFromElement(errorMessage);
//        CustomListeners.test.log(Status.PASS,"Get errorMessage");
//        return message;
//    }
//
//}
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        CustomListeners.test.log(Status.PASS, "Get welcome text");
        return message;
    }
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS, "Enter EmailId " + email);
    }
    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;
    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Enter Password " + password);
    }
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click on loginButton");
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    public String getErrorMessage() {
        String message = getTextFromElement(errorMessage);
        CustomListeners.test.log(Status.PASS, "Get errorMessage");
        return message;
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(@href, '/logout')]")
    WebElement logOutLink;
    public String logOutLink() {
        String text = getTextFromElement(logOutLink);
        CustomListeners.test.log(Status.PASS, "Get logout text");
        return text;
    }

    public void clickOnLogOutLink() {
        clickOnElement(logOutLink);
        CustomListeners.test.log(Status.PASS, "Click on logOutButton");
    }
}
















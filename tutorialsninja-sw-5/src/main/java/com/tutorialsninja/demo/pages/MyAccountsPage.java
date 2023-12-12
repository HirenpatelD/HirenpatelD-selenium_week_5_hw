package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountsPage extends Utility {

// * 3.12	Verify the message “Your Account Has Been Created!”
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement accountCreation;
    public String verifyTheMessageYourAccountHasBeenCreated() {
        return getTextFromElement(accountCreation);
    }

    // * 3.13	Click on Continue button
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement continueAccountButton;
    public void clickOnContinueAccountButton() {
        clickOnElement(continueAccountButton);
    }
    // * 3.16	Verify the text “Account Logout”
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement accountLogOutText;
    public String verifyTextForAccountLogOut() {
        return getTextFromElement(accountLogOutText);
    }

    // * 3.17	Click on Continue button
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueLogOutButton;

    public void clickOnContinueLogOutButton() {
        clickOnElement(continueLogOutButton);
    }

    // * 4.6	Click on Login button
    @CacheLookup
    @FindBy(xpath ="//input[@value='Login']")
    WebElement loginButton;
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    // * 4.7	Verify text “My Account”
    @CacheLookup
    @FindBy(xpath ="//h2[normalize-space()='My Account']")
    WebElement checkTextForMyAccount;

    public String verifyTheTextMyAccount() {
        return getTextFromElement(checkTextForMyAccount);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id='top-links']//li[contains(@class,'open')]/ul/li")
    WebElement clickOnOption;

    public void selectOption(String option) {

        WebElement menuList = driver.findElement(By.linkText(option));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuList).click().build().perform();
    }
    @CacheLookup
    @FindBy(xpath ="//span[normalize-space()='My Account']")
    WebElement accountLink;
    public void clickOnAccountLink() {
        mouseHoverToElementAndClick(accountLink);
    }
}


package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
//    @CacheLookup
//    @FindBy(linkText = "Log in")
//    WebElement loginLink;
//
////    By loginLink = By.linkText("Log in");
//
//    @CacheLookup
//    @FindBy(linkText = "Register")
//    WebElement registerLink;
////    By registerLink = By.linkText("Register");
//
//    public void clickOnLoginLink() {
//        clickOnElement(loginLink);
//    }
//
//    public void clickOnRegisterLink() {
//        clickOnElement(registerLink);
//    }
//
//    //Computer Menu
//    @CacheLookup
//    @FindBy(xpath = "//h1[normalize-space()='Computers']")
//    WebElement computersPage;
//
//    public String getComputersPage() {
//        return getTextFromElement(computersPage);
//    }
//
//    //Electronics Menu
//    @CacheLookup
//    @FindBy(xpath = "//h1[contains(text(),'Electronics')]")
//    WebElement electronicsPage;
//
//    public String getElectronicsPage() {
//        return getTextFromElement(electronicsPage);
//    }
//
//    //Apperal Menu
//    @CacheLookup
//    @FindBy(xpath = "//h1[normalize-space()='Apparel']")
//    WebElement apparelPage;
//
//    public String getApparelPage() {
//        return getTextFromElement(apparelPage);
//    }
//
//    //Digital downloads page
//    @CacheLookup
//    @FindBy(xpath = "//h1[normalize-space()='Digital downloads']")
//    WebElement digitalDownloadsPage;
//
//    public String getDigitalDownloadsPage() {
//        return getTextFromElement(digitalDownloadsPage);
//    }
//
//    //booksPage
//    @CacheLookup
//    @FindBy(xpath = "//h1[normalize-space()='Books']")
//    WebElement booksPage;
//
//    public String getBooksPage() {
//        return getTextFromElement(booksPage);
//    }
//
//    //Jewelry page
//    @CacheLookup
//    @FindBy(xpath = "//h1[normalize-space()='Jewelry']")
//    WebElement jewelryPage;
//
//    public String getJewelryPage() {
//        return getTextFromElement(jewelryPage);
//    }
//
//    //Gift Card Page
//    @CacheLookup
//    @FindBy(xpath = "//h1[normalize-space()='Gift Cards']")
//    WebElement giftCardsPage;
//    public String getGiftCardsPage() {
//            return getTextFromElement(giftCardsPage);
//        }
//     //nopCommerce logo link
//    @CacheLookup
//    @FindBy(xpath = "(//img[@alt='nopCommerce demo store'])[1]")
//    WebElement nopCommerceLogo;
//    public void nopCommerceLogo(){
//        clickOnElement(nopCommerceLogo);
//    }
//
//
//    }
@CacheLookup
@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()]")
WebElement selectMenu;

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(@class, 'ico-register')]")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement verifyLoginLink;

    @CacheLookup
    @FindBy(xpath = "//li[@class='active last']//a[normalize-space()='Desktops']")
    WebElement desktopLink;


    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        CustomListeners.test.log(Status.PASS, "Click on login Button");
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        CustomListeners.test.log(Status.PASS, "Click on register Button");
    }

    public String getLoginLink() {
        String link = getTextFromElement(verifyLoginLink);
        CustomListeners.test.log(Status.PASS, "Get login text");
        return link;

    }

    public void selectMenu(String menu) {
        mouseHoverToElementAndClick(selectMenu);
    }

    public void clickOnDesktop() {
        mouseHoverToElementAndClick(desktopLink);
    }

}
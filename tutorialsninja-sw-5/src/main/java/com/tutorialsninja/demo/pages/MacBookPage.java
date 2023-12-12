package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MacBookPage extends Utility {

    // * 2.5	Verify the text “MacBook”
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='MacBook']")
    WebElement checkTextMacBook;
    public String verifyTheTextMacBook() {
        return getTextFromElement(checkTextMacBook);
    }

    // * 2.6	Click on ‘Add To Cart’ button
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;
    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    // * 2.7	Verify the message “Success: You have added MacBook to your shopping cart!”
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMessageForAddingProduct;
    public String verifySuccessMessageForAddingProductToShoppingCart() {
        return getTextFromElement(successMessageForAddingProduct);
    }

    // * 2.8	Click on link “shopping cart” display into success message
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement linkToShoppingCartInsideMessage;

    public void clickOnLinkToShoppingCartMessage() {
        clickOnElement(linkToShoppingCartInsideMessage);
    }
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement clickOnMyAccount;

    public void clickOnMyAccountLink(){
        mouseHoverToElementAndClick(clickOnMyAccount);
    }

}


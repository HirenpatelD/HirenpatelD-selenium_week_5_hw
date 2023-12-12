package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Utility {

    //2.7 Verify the Text "HP LP3065"
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='HP LP3065']")
    WebElement text;
    public String verifyHPLP3065Text() {
        return getTextFromElement(text);
    }
    //2.8 Select Delivery Date "2023-11-27"
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-option225']")
    WebElement deliveryDate;
    public void selectDeliverDate(String date) {
        clearTextFromField(deliveryDate);
        sendTextToElement(deliveryDate, date);
    }
    //2.9.Enter Qty "1” using Select class.
    @CacheLookup
    @FindBy(name = "quantity")
    WebElement Qty;

    public void enterQty(String value) {
       clearTextFromField(Qty);
        sendTextToElement(Qty, value);
    }

    //2.10 Click on “Add to Cart” button
    @CacheLookup
    @FindBy(xpath ="//button[@id='button-cart']")
    WebElement addToCart;
    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
    }

    //2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
    @CacheLookup
    @FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']" )
    WebElement message;
    public String verifySuccessMessageToAddInCart() {
        return getTextFromElement(message);
    }

    //2.12 Click on link “shopping cart” display into success message
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='shopping cart']" )
            WebElement click;
    public void clickOnShoppingCart() {
        clickOnElement(click);
    }

}


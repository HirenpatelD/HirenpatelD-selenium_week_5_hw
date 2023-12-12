package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {

    //2.11 Verify the text "Shopping Cart"
    @CacheLookup
    @FindBy(xpath ="//div[@id='content']//h1" )
    WebElement text;
    public String verifyShoppingCartText() {
        return getTextFromElement(text);
    }
    //2.12 Verify the Product name "HP LP3065"
    @CacheLookup
    @FindBy(xpath ="//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productName;
    public String verifyProductName() {
        return getTextFromElement(productName);

    }
    //2.14 Verify the Model "Product21"
    @CacheLookup
    @FindBy(xpath ="//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement model;
    public String verifyModel() {
        return getTextFromElement(model);
    }

    //2.15 Verify the Total "£74.73"
    @CacheLookup
    @FindBy(xpath ="//div[@class = 'table-responsive']/table/tbody/tr/td[6]" )
    WebElement total;
    public String verifyTotal() {
        return getTextFromElement(total);
    }

    // * 2.10	Verify the Product name "MacBook"
    @CacheLookup
    @FindBy(xpath ="(//a[contains(text(),'MacBook')])[2]" )
    WebElement checkNameOfProductMacBook;
    public String verifyProductNameIsMacBook() {
        return getTextFromElement(checkNameOfProductMacBook);
    }

    // * 2.11	Change Quantity "2"
    @CacheLookup
    @FindBy(xpath ="//input[@class='form-control']")
    WebElement clearTheQtyBox;
    public void clearTheQtyBox() {
        clearTextFromField(clearTheQtyBox);
    }
    @CacheLookup
    @FindBy(xpath ="//input[@class='form-control']" )
    WebElement changeQuantity;
    public void enterQuantityIntoTheBox(String qty) {
        sendTextToElement(changeQuantity, qty);
    }
    // * 2.12	Click on “Update” Tab
    @CacheLookup
    @FindBy(xpath ="(//button[@type='submit'])[1]" )
    WebElement updateTheBox;
    public void clickOnUpdateTheQuantityBox() {
        clickOnElement(updateTheBox);
    }

    // * 2.13	Verify the message “Success: You have modified your shopping cart!”
    @CacheLookup
    @FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']" )
    WebElement modifiedSuccessMessage;
    public String verifyUpdatedSuccessMessage() {
        return getTextFromElement(modifiedSuccessMessage);
    }

    // * 2.14	Verify the Total £737.45
    @CacheLookup
    @FindBy(xpath = "(//td[contains(text(),'£737.45')])[3]")
    WebElement totalPrice;
    public String verifyTotalPrice() {
        return getTextFromElement(totalPrice);
    }

    // * 2.15	Click on “Checkout” button
    @CacheLookup
    @FindBy(xpath ="//a[@class='btn btn-primary']" )
    WebElement checkOutButton;
    public void clickOnCheckOutButton() {
        clickOnElement(checkOutButton);
    }
}


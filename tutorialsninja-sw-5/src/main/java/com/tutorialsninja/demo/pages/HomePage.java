package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    //call selectMenu method and pass the menu name
    @CacheLookup
    @FindBy (xpath ="//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*")
    WebElement topMenu;

    public void selectMenu(String menu) {
        WebElement menuList = driver.findElement(By.linkText(menu));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuList).click().build().perform();

    }

    //1.1 Mouse hover on “Desktops” Tab and click
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktop;

    public void clickOnDesktopTab() {
        mouseHoverToElementAndClick(desktop);
    }

    //1.3 Verify the text ‘Desktops’
    @CacheLookup
    @FindBy(xpath ="//h2[normalize-space()='Desktops']")
    WebElement desktopText;
    public String verifyDesktopsText() {
        return getTextFromElement(desktopText);
    }
    //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='Laptops & Notebooks']" )
    WebElement laptopAndNotebook;
    public void clickOnLaptopAndNotebook()
    {
        mouseHoverToElementAndClick(laptopAndNotebook);
    }

    //2.3 Verify the text ‘Laptops & Notebooks’
    @CacheLookup
    @FindBy(xpath ="//h2[normalize-space()='Laptops & Notebooks']")
    WebElement laptopAndNoteBookText;
    public String verifyLaptopAndNoteText() {
        return getTextFromElement(laptopAndNoteBookText);
    }

    //3.1 Mouse hover on “Components” Tab and click
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Components']")
    WebElement components;
    public void clickOnComponents() {
        mouseHoverToElementAndClick(components);
    }

    //3.3 Verify the text ‘Components’
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Components']")
    WebElement componentsText;
    public String verifyComponentsText() {
        return getTextFromElement(componentsText);
    }

    //2.1 Mouse hover on Currency Dropdown and click
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']")
    WebElement dropdown;
    public void mouseHoverOnCurrencyDropdownAndClick() {
        mouseHoverToElementAndClick(dropdown);
    }
    //2.2 Mouse hover on £Pound Sterling and click
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='£Pound Sterling']")
    WebElement sterling;
    public void mouseHoverOnPoundAndClick() {
        mouseHoverToElementAndClick(sterling);
    }

    // * 1.1	Click on My Account Link.
    @CacheLookup
    @FindBy(xpath ="//span[normalize-space()='My Account']")
    WebElement accountLink;
    public void clickOnAccountLink() {
        mouseHoverToElementAndClick(accountLink);
    }
}
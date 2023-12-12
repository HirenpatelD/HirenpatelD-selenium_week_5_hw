package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {
HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {

    homePage = new HomePage();
    }

    //1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
    public void selectMenu(String menu) {
        homePage.selectMenu(menu);
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.clickOnDesktopTab();

        //1.2 call selectMenu method and pass the menu = “Show AllDesktops”
        homePage.selectMenu("Show AllDesktops");
        //homePage.clickOnShowAllDesktops();

        //1.3 Verify the text ‘Desktops’
     String expectedText = "Desktops";
     String actualText = homePage.verifyDesktopsText();
        Assert.assertEquals(actualText, expectedText, "Error Message");
    }
    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
       // 2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.clickOnLaptopAndNotebook();
        // 2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        homePage.selectMenu("Show AllLaptops & Notebooks");
       // 2.3 Verify the text ‘Laptops & Notebooks’
        String expectedText = "Laptops & Notebooks";
        String actualText = homePage.verifyLaptopAndNoteText();
        Assert.assertEquals(actualText, expectedText, "Message not Displayed");
    }
    @Test(groups = "regression")
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        //3.1 Mouse hover on “Components” Tab and click
        homePage.clickOnComponents();
        //3.2 call selectMenu method and pass the menu = “Show All Components”
        homePage.selectMenu("Show AllComponents");
        //3.3 Verify the text ‘Components’
        String expectedText = "Components";
        String actualText = homePage.verifyComponentsText();
        Assert.assertEquals(actualText, expectedText, "Message not Displayed");
    }
}





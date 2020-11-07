package com.libraryCT.pages;

import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class  BasePage {

    @FindBy(xpath = "//span[@class='title']")
    public List<WebElement> menuOptions;

    @FindBy(xpath = "(//img[@src])[3]")
    @CacheLookup
    protected WebElement loaderMask;

    @FindBy(xpath = "//div[@class='portlet-title']")
    public WebElement pageSubTitle;

    @FindBy(xpath = "//a[@id='navbarDropdown']/span")
    public WebElement userName;

    @FindBy(linkText = "Log Out")
    public WebElement logOutLink;


    public BasePage() { PageFactory.initElements(Driver.get(), this);}


    public String getPageSubTitle() {
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }


    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public String getUserName(){
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForVisibility(userName, 10);
        return userName.getText();
    }


    public void logOut(){
        BrowserUtils.waitFor(10);
        BrowserUtils.clickWithJS(userName);
        BrowserUtils.clickWithJS(logOutLink);
    }

}










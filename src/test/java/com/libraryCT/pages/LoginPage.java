package com.libraryCT.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

    @FindBy(id = "inputEmail")
    public WebElement emailInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitButton;

    @FindBy (css = ".alert.alert-danger")
    public WebElement Errormsg;

    public void login(String userNameStr, String passwordStr) {
        emailInput.sendKeys(userNameStr);
        passwordInput.sendKeys(passwordStr);
        submitButton.click();

    }
}

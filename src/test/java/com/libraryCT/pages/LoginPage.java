package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){ PageFactory.initElements(Driver.get(), this); }

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

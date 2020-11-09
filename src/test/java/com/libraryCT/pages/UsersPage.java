package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {

    public UsersPage(){ PageFactory.initElements(Driver.get(),this); }

    @FindBy (css = "a[href='tpl/add-user.html']")
    public WebElement addUser;

    @FindBy (css = "button[type='submit']")
    public WebElement saveChanges;

    @FindBy (css = "button[type='cancel']")
    public WebElement close;

    @FindBy (css = "a[onclick='Users.edit_user(2122)']")
    public WebElement editUser;


}

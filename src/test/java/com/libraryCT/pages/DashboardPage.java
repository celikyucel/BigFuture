package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {


    @FindBy(css = ".navbar-brand")
    public WebElement LibraryLink;

    @FindBy(xpath = "//*[@class=\"nav-item\"][2]")
    public WebElement UsersLink;

    @FindBy(xpath = "//*[@id=\"menu_item\"]/li[3]/a")
    public WebElement BooksLink;

    @FindBy(css = ".nav-link.dropdown-toggle")
    public WebElement UserNameLink;

    @FindBy(css = ".dropdown-item")
    public WebElement LogOut;

}

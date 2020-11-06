package com.libraryCT.pages;
import com.libraryCT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
public class DashboardPage {

    public DashboardPage(){ PageFactory.initElements(Driver.get(), this); }

    @FindBy(css = ".navbar-brand")
    public WebElement LibraryLink;
    @FindBy(xpath = "//*[@class=\"nav-item\"][2]")
    public WebElement UsersLink;
    @FindBy(xpath = "//*[@href=\"#books\"]")
    public WebElement BooksLink;
    @FindBy(css = ".nav-link.dropdown-toggle")
    public WebElement UserNameLink;
    @FindBy(id = "user_avatar")
    public WebElement User_Avatar;
    @FindBy(linkText = "Log Out")
    public WebElement LogOut;
    @FindBy(css = "#borrowed_books")
    public WebElement BorrowedBooks;

    @FindBy(xpath = "//*[@id=\"books\"]/div[1]/div[1]/h3")
    public WebElement book_Management_Title;
}
package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BorrowingBookspage extends BasePage {

    @FindBy (css = "a[href='#books']")
    public WebElement booksOption;

    @FindBy (css = " a[href='#borrowing-books']")
    public WebElement borrowingBooksOption;

    @FindBy (css = "#user_list")
    public WebElement userList;



    public static WebElement returnBook(String bookName){

        String bookPath="//tbody//td[.='"+bookName+"']/../td[1]/a";

       return  Driver.get().findElement(By.xpath(bookPath));

    }


}

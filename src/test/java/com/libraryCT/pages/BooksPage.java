package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BooksPage extends BasePage{

    @FindBy(css = "#book_categories")
    public WebElement bookCategoriesDropdown;

    @FindBy(css = "select[name='tbl_books_length']")
    public WebElement showRecordsDropdown;

    @FindBy(css = "input[type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//th")
    public List<WebElement> tableColumnNames;

    @FindBy(xpath = "//span[text()='Books']")
    public WebElement booksTabButton;

    @FindBy (xpath = "//*[@id='books']//div//h3")
    public WebElement BookPageTitle;


}

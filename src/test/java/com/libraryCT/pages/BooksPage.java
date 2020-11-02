package com.libraryCT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BooksPage {

    @FindBy(css = "#book_categories")
    public WebElement bookCategoriesDropdown;

    @FindBy(css = "select[name='tbl_books_length']")
    public WebElement showRecordsDropdown;

    @FindBy(css = "input[type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//table/thead/tr/th")
    public List<WebElement> tableColumnNames;

    @FindBy(xpath = "//span[text()='Books']")
    public WebElement booksTabButton;





}

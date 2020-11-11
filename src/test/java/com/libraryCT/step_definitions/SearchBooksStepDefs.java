package com.libraryCT.step_definitions;

import com.libraryCT.pages.BooksPage;
import com.libraryCT.pages.DashboardPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchBooksStepDefs {

    @Then("the user navigates to book page")
    public void the_user_navigates_to_book_page() {
        BooksPage booksPage = new BooksPage();

        BrowserUtils.waitForVisibility(booksPage.BookPageTitle, 5);
        String actualTitle = booksPage.BookPageTitle.getText();

        String expectedTitle = "Book Management";

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("the user should search books on following {string}")
    public void the_user_should_search_books_on_following(String categoryType) {
        BooksPage booksPage = new BooksPage();
        Select select = new Select(booksPage.bookCategoriesDropdown);
        select.selectByVisibleText(categoryType);

        String actualResult = Driver.get().findElement(By.xpath("//tbody/tr[1]/td[5]")).getText();

        if (categoryType != "ALL"){
            Assert.assertEquals(categoryType, actualResult);
        }



    }





}

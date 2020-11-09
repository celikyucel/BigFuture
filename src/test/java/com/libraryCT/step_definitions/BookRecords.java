package com.libraryCT.step_definitions;

import com.libraryCT.pages.BooksPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BookRecords {


    @Given("the user is logged in2")
    public void the_user_is_logged_in2() {

        String url = ConfigurationReader.get("url");
        //WebDriver driver = Driver.get();
        Driver.get().get(url);

        String username = ConfigurationReader.get("librarian_username");
        String password = ConfigurationReader.get("librarian_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @Given("Navigate to Book Record Page")
    public void navigate_to_Book_Record_Page() {
        BrowserUtils.waitForClickablility(new BooksPage().booksTabButton, 5);

        new BooksPage().booksTabButton.click();

        BrowserUtils.waitForVisibility(Driver.get().findElement(By.xpath("//*[@id='books']//div//h3")), 5);

        String actualTitle = Driver.get().findElement(By.xpath("//*[@id='books']//div//h3")).getText();

        String expectedTitle = "Book Management";

        Assert.assertEquals(expectedTitle, actualTitle);

    }


    @Then("Verify default record is {int}")
    public void verify_default_record_is(Integer expectedRecord) {


        Select select = new Select(new BooksPage().showRecordsDropdown);

        String defaultRecords = select.getFirstSelectedOption().getText();

        Integer actualDefault = Integer.parseInt(defaultRecords);

        Assert.assertEquals(expectedRecord, actualDefault);

    }

    @Then("Verify book records is following options")
    public void verify_book_records_is_following_options(List<String> expectedOptions) {

        Select select = new Select(new BooksPage().showRecordsDropdown);

        List<WebElement> recordOptions = select.getOptions();

        List<String> actualRecords = new ArrayList<>();

        for (WebElement recordOption : recordOptions) {
            actualRecords.add(recordOption.getText());
        }


        Assert.assertEquals(expectedOptions, actualRecords);


    }


}

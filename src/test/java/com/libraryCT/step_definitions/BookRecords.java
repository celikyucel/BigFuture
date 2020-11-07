package com.libraryCT.step_definitions;

import com.libraryCT.pages.BooksPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
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
        loginPage.login(username,password);
    }

    @Then("Verify default record is {int}")
    public void verify_default_record_is(Integer expectedRecord) {
        new BooksPage().booksTabButton.click();


        Select select = new Select(new BooksPage().showRecordsDropdown);

        String defaultRecords = select.getFirstSelectedOption().getText();
        System.out.println("defaultRecords = " + defaultRecords);

        Integer actualDefault = Integer.parseInt(defaultRecords);

        Assert.assertEquals(expectedRecord, actualDefault);

    }

    @Then("Verify book records is following options")
    public void verify_book_records_is_following_options(List<String> expectedOptions) {

        Select select = new Select(new BooksPage().showRecordsDropdown);

        List<WebElement> recordOptions = select.getOptions();

        List<String> actualRecords= new ArrayList<>();

        for (WebElement recordOption : recordOptions) {
            actualRecords.add(recordOption.getText());
        }
        System.out.println(actualRecords.toString());

        Assert.assertEquals(expectedOptions,actualRecords);



    }


}

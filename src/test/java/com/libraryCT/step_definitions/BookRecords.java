package com.libraryCT.step_definitions;

import com.libraryCT.pages.BooksPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BookRecords {

    
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

        List<String> actualRecords= new ArrayList<>();

        for (WebElement recordOption : recordOptions) {
            actualRecords.add(recordOption.getText());
        }

        Assert.assertEquals(expectedOptions,actualRecords);



    }


}

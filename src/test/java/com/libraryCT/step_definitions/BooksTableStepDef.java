package com.libraryCT.step_definitions;

import com.libraryCT.pages.BooksPage;
import com.libraryCT.pages.DashboardPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class BooksTableStepDef {


    @Given("the user is logged in")
    public void the_user_is_logged_in() {

        String url = ConfigurationReader.get("url");
        //WebDriver driver = Driver.get();
        Driver.get().get(url);

        String username = ConfigurationReader.get("student_username");
        String password = ConfigurationReader.get("student_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

    }


    @Then("table should have following column names")
    public void table_should_have_following_column_names(List<String> columnNames) {

        BrowserUtils.waitFor(4);
        List<String> actualOptions = BrowserUtils.getElementsText(new BooksPage().tableColumnNames);

        Assert.assertEquals(columnNames,actualOptions);
        System.out.println("table column names = " + columnNames);
        System.out.println("actualOptions = " + actualOptions);
    }
}

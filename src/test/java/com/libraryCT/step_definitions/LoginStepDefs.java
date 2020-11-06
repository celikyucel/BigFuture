package com.libraryCT.step_definitions;

import com.libraryCT.pages.DashboardPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {


    @Given("the user navigates to login page")
    public void the_user_navigates_to_login_page() {


        //WebDriver driver = Driver.get();
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("{string} enters {string} and {string}")
    public void enters_and(String role, String email, String password) {

        LoginPage loginPage= new LoginPage();

        loginPage.emailInput.sendKeys(email);
        loginPage.passwordInput.sendKeys(password);


        loginPage.submitButton.click();

        BrowserUtils.waitFor(3);
    }

    @Then("user on  {string}")
    public void user_on(String string) {

    String actualTitle= new DashboardPage().book_Management_Title.getText();

        System.out.println("actualTitle = " + actualTitle);

    }




}

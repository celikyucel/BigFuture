package com.libraryCT.step_definitions;

import com.libraryCT.pages.DashboardPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {


    @Given("the user navigates to login page")
    public void the_user_navigates_to_login_page() {


        //WebDriver driver = Driver.get();
        Driver.get().get(ConfigurationReader.get("url"));

    }

   @When("user enters {string} and {string}")
    public void user_enters_and(String email, String password) {
        LoginPage loginPage= new LoginPage();

        loginPage.emailInput.sendKeys(email);
        loginPage.passwordInput.sendKeys(password);

        loginPage.submitButton.click();

        BrowserUtils.waitFor(3);
    }

    @Then("{string} on  {string}")
    public void on(String role, String page) {

        if (role.contains("student")){

        String actualTitle= new DashboardPage().book_Management_Title.getText();

            Assert.assertTrue(actualTitle.contains(page));

        } else {

             String dashboardLogoText=new DashboardPage().dashboard_button.getText();

            Assert.assertTrue(dashboardLogoText.contains(page));

        }


    }

    @Then("logged in as a {string}")
    public void logged_in_as_a(String userType) {

        if(userType.equalsIgnoreCase("librarian")) {
            String username = ConfigurationReader.get("librarian_username");
            String password = ConfigurationReader.get("librarian_password");

            LoginPage loginPage = new LoginPage();
            loginPage.login(username, password);
        }else if (userType.equalsIgnoreCase("student")){

            String username = ConfigurationReader.get("student_username");
            String password = ConfigurationReader.get("student_password");

            LoginPage loginPage = new LoginPage();
            loginPage.login(username, password);
        }
    }




}

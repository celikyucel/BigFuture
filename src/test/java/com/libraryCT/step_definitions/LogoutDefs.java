package com.libraryCT.step_definitions;
import com.libraryCT.pages.DashboardPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class LogoutDefs {

    @When("Student should be able to login")
    public void student_should_be_able_to_login() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        String username = ConfigurationReader.get("student_username");
        String password = ConfigurationReader.get("student_password");

        new LoginPage().login(username,password);
    }


    @Then("Student should be able to logout")
    public void student_should_be_able_to_logout() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.User_Avatar.click();
        dashboardPage.LogOut.click();

        String expectedUrl = ConfigurationReader.get("url");
        Assert.assertEquals(expectedUrl,Driver.get().getCurrentUrl());
    }
  
  @When("Librarian should be able to login")
    public void librarian_should_be_able_to_login() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        String username = ConfigurationReader.get("librarian_username");
        String password = ConfigurationReader.get("librarian_password");

        new LoginPage().login(username,password);

    }

    @Then("Librarian should be able to logout")
    public void librarian_should_be_able_to_logout() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.User_Avatar.click();
        dashboardPage.LogOut.click();

      String expectedUrl = ConfigurationReader.get("url");
        Assert.assertEquals(expectedUrl,Driver.get().getCurrentUrl());
    }

}

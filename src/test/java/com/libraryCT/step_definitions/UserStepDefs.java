package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStepDefs {

    @Given("the user logged in as librarian")
    public void the_user_logged_in_as_librarian() {
        String url = ConfigurationReader.get("url");

        Driver.get().get(url);

        String username = ConfigurationReader.get("librarian_username");
        String password = ConfigurationReader.get("librarian_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }
    }

    @When("the librarian clicks to addUser button")
    public void the_librarian_clicks_to_addUser_button() {
        BrowserUtils.waitFor(2);

    }

    @Then("a user is created")
    public void a_user_is_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("librarian clicks to close button")
    public void librarian_clicks_to_close_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the add user window is closed")
    public void the_add_user_window_is_closed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks to editUser button")
    public void user_clicks_to_editUser_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the librarian is able to edit the user")
    public void the_librarian_is_able_to_edit_the_user() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}

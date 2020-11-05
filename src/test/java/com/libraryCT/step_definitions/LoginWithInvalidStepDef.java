package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginWithInvalidStepDef {

    @When("user login with {string} and {string}")
    public void user_login_with_and(String username, String password) {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        new LoginPage().login(username,password);
        BrowserUtils.waitFor(2);

    }

    @Then("user should not be able to login")
    public void user_should_not_be_able_to_login() {
//verify that error message
        String expectedmsg1="Sorry, Wrong Email or Password";
        String expectedmsg2="This field is required.";

        //String expectedmsg1="Svxcbxvbv";
        //String expectedmsg2="xbxbxbf";

        String actualmsg=new  LoginPage().Errormsg.getText();

        System.out.println("new LoginPage().Errormsg.getText() = " + new LoginPage().Errormsg.getText());
        if (actualmsg.contains(expectedmsg1)){
            Assert.assertTrue(actualmsg.contains(expectedmsg1));
        }
        else if(actualmsg.contains(expectedmsg2)){

            Assert.assertTrue(actualmsg.contains(expectedmsg2));
        }

        else {Assert.assertTrue(false);}
    }

}

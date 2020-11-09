package com.libraryCT.step_definitions;
import com.libraryCT.pages.DashboardPage;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
public class LogoutDefs {

    @Then("user should be able to logout")
    public void user_should_be_able_to_logout() {
        
        new DashboardPage().logOut();

        String expectedUrl = ConfigurationReader.get("url");
        Assert.assertEquals(expectedUrl,Driver.get().getCurrentUrl());
    }
  
 }

package com.libraryCT.step_definitions;
import com.libraryCT.pages.DashboardPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
public class LogoutDefs {

    @Then("user should be able to logout")
    public void user_should_be_able_to_logout() {
        
        new DashboardPage().logOut();

        String expectedUrl = ConfigurationReader.get("url");
        Assert.assertEquals(expectedUrl,Driver.get().getCurrentUrl());
    }

    @And("when user navigates back, should have logout")
    public void when_user_navigates_back_should_have_logout() {
        Driver.get().navigate().back();
        BrowserUtils.waitFor(2);
        String expectedUrl = ConfigurationReader.get("url");
        Assert.assertEquals(expectedUrl,Driver.get().getCurrentUrl());
    }
  
 }

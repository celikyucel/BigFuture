package com.libraryCT.step_definitions;



import com.libraryCT.pages.BooksPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EUG14_178_StepDefs {
    @Then("user see <module>")
    public void userSeeModule(List<String> expectedModules) {

        List<String> actualModules = BrowserUtils.getElementsText(new BooksPage().menuOptions);

        Assert.assertEquals(expectedModules, actualModules);
        System.out.println("ExpectedModules = " + expectedModules);
        System.out.println("ActualModules = " + actualModules);

    }
}
package com.cucumber.testng.steps;

import com.cucumber.junit.driver.DriverManager;
import com.cucumber.junit.pages.DocsPage;
import com.cucumber.junit.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

import static junit.framework.TestCase.assertNotNull;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class MenuSteps {

    private HomePage homePage = new HomePage();
    public DocsPage docsPage = new DocsPage();

    Actions action = new Actions(DriverManager.getDriver());

    @Given("the user opens Cucumber website")
    public void userOpensCucumberWebsite() {
        homePage.openCucumberWebsite();
    }

    @When("the user hover on the Autobaraholka section")
    public void theUserHoverOnTheSection() {
        homePage.menuSection();
    }

    @When("the user hover on the Home and flats section")
    public void theUserClickOnTheItem() {
        homePage.menuSection2();
    }

    @Then("page has elements")
    public void pageWithElementsIsDisplayed() {
        assertNotNull("Меню не содержит подпункты", homePage.menuSectionItems());
    }

    @Then("page elements2 is displayed")
    public void pageWithElementsIsDisplayed2() {
        assertNotNull("Меню не содержит подпункты", homePage.menuSectionItems2());
    }
}

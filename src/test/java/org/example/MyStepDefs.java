package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs extends Util{
    HomePage homePage = new HomePage();
    WomenPage womenPage = new WomenPage();
    WomenTopPage womenTopPage = new WomenTopPage();
    @Given("^user is on homepage$")
    public void user_is_on_homepage()  {
        homePage.checkHomePage();
    }

    @When("^user click on women category$")
    public void user_click_on_women_category()  {
      homePage.clickOnNewLink();

    }

    @When("^user click on top category$")
    public void user_click_on_top_category()  {
       womenPage.clickOnTops();
    }

    @Then("^user should see$")
    public void user_should_see()  {
        womenTopPage.checkWomenTopPage();
    }
}

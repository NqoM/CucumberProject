package Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.ndjson.internal.com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class stepsDef extends Serializers.Base {



    @Given("i am on the login page")
    public void i_am_on_the_login_page() {
        homePage.clickLoginButton();
        loginPage.verifyLoginPageIsDisplayed();
    }

    @And("I enter email (.*)$")
    public void i_enter_email(String email) {
        loginPage.enterEmail(email);
    }

    @And("I enter password (.*)$")
    public void i_enter_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("I click login button")
    public void i_click_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        dashboardPage.verifyDashboardPageIsDisplayed();
    }


    @After
    public void closeBrowser() {
    }

    @And("I click on the logged in user")
    public void iClickOnTheLoggedInUser() {
        dashboardPage.clickUserMenuButton_xpath();

    }

    @And("I click on the admin panel")
    public void iClickOnTheAdminPanel() {
        dashboardPage.clickAdminPanelButton_xpath();

    }

    @And("I click on the groups tab")
    public void iClickOnTheGroupsTab() {

        dashboardPage.clickGroupsButton();
    }

    @And("I click on the create group button")
    public void iClickOnTheCreateGroupButton() {
        dashboardPage.clickCreateNewGroup();
    }

    @And("I enter group name (.*)$")
    public void iEnterGroupNameGroupName(String groupName) {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("I enter group description (.*)$")
    public void iEnterGroupDescriptionGroupDescription(String groupDescription) {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("I enter year (.*)$")
    public void iEnterYear(int year) {
    }

    @And("I enter max capacity (.*)$")
    public void iEnterMaxCapacityMaxCapacity(int maxCapacity) {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("I enter start date (.*)$")
    public void iEnterStartDateStartDate(String startDate) {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("I enter end date (.*)$")
    public void iEnterEndDateEndDate(String endDate) {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("i should see the group created successfully")
    public void iShouldSeeTheGroupCreatedSuccessfully() {
        // Write code here that turns the phrase above into concrete actions
    }

    @AfterStep
    public void addScreenshots(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshots = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshots, "image/png", "image");
        }
    }

}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class DashboardPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app-main-content\"]/section/div[1]/h2")
    WebElement dashboardHeading_xpath;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button")
    WebElement userMenuButton_xpath;

    @FindBy(xpath = "//button[@class='nav-dropdown-item']//span[contains(text(),'Admin Panel')]")
    WebElement adminPanel_xpath;

    @FindBy(xpath = "//button[normalize-space() = '+ Create New Group']")
    WebElement createNewGroup_xpath;

    @FindBy(xpath="//button[contains(.,'Groups')]")
    WebElement groupsButton_xpath;


    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyDashboardPageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(dashboardHeading_xpath));
        dashboardHeading_xpath.isDisplayed();
    }

    public void clickUserMenuButton_xpath() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(userMenuButton_xpath));

        userMenuButton_xpath.click();
    }

    public void clickAdminPanelButton_xpath() {
        adminPanel_xpath.click();
    }

    public void clickCreateNewGroup(){
        createNewGroup_xpath.click();
    }

    public void clickGroupsButton(){
        groupsButton_xpath.click();
    }

}
}

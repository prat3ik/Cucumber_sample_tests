package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
    }


    @Given("^I navigate to login page$")
    public void iNavigateToLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        driver.get("http://166.62.92.171/feedback360");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement profile_pic = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@name,'email')]")));
    }

    @And("^I enter the username as \"([^\"]*)\"$")
    public void iEnterTheUsernameAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("username:" + arg0);
        System.out.println();
       // driver.findElement(By.xpath("//*[contains(@name,'email')]")).sendKeys(arg0);
    }

    @And("^I enter the password as \"([^\"]*)\"$")
    public void iEnterThePasswordAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("password:" + arg0);
       // driver.findElement(By.xpath("//*[contains(@name,'password')]")).sendKeys(arg0);
    }


    @And("^I click on sublit button$")
    public void iClickOnSublitButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector(".md-primary.md-button")).click();
    }

    @Then("^I should see user_icon$")
    public void iShouldSeeUser_icon() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement profile_pic = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".md-toolbar-tools-bottom")));
        Assert.assertTrue("Login did not successful", profile_pic.isDisplayed());

    }

    @And("^I quit the browser$")
    public void iQuitTheBrowser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }
}

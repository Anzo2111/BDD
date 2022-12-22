import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task5 {

    WebDriverWait wait;
    WebDriver driver;
    @Given("browser is open")
    public void browserIsOpen() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @When("user is on login page")
    public void userIsOnLoginPage() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        driver.get("https://demoqa.com/login");

    }
    @When("user enters username and password")
    public void userEntersUsernameAndPassword() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        WebElement username = driver.findElement(By.id("userName"));
        WebElement pass = driver.findElement(By.id("password"));
        username.sendKeys("test123");
        pass.sendKeys("Automation@123");
        driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
    }
    @When("user goes to book store")
    public void userGoesToBookStore() {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"gotoStore\"]"))).click();
    }
    @When("user clicks on git pocket guide")
    public void userClicksOnGitPocketGuide() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"see-book-Git Pocket Guide\"]/a"))).click();
    }
    @When("user clicks on add to your collection")
    public void userClicksOnAddToYourCollection() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button"))).click();
    }

}

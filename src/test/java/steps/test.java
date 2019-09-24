package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class test {

   public static WebDriver driver;
    //private final WebDriver driver = new ChromeDriver();
    @Given("^user opens homepage$")
    public void user_opens_homepage(){
        System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
    }

    @When("^user navigates to Login page$")
    public void user_navigates_to_Login_page(){
        //test
        driver.findElement(By.linkText("Sign in")).click();
    }

    @And("^user enters username and password$")
    public void user_enters_username_and_password(){
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));
        email.clear();
        password.clear();
        email.sendKeys("blog.cucumber@gmail.com");
        password.sendKeys("Cucumber@blog");
        driver.findElement(By.id("SubmitLogin")).click();
    }
    @Then("^open Account page$")
    public void open_Account_page(){
        String exp_message = "Welcome to your account. Here you can manage all of your personal information and orders.";
        String actual = driver.findElement(By.cssSelector(".info-account")).getText();
        Assert.assertEquals(exp_message,actual);
        driver.quit();
    }
}

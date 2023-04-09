package browserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        // base Url
        String baseUrl ="https://demo.nopcommerce.com/login?returnUrl=%2";
        // Launch the chrome Browser
        WebDriver driver = new ChromeDriver();
        //Open the URL into Browser
        driver.get(baseUrl);
        //Maximise the Browser
        driver.manage().window().maximize();
        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of the Page
        String title = driver.getTitle();
        // Get the Current URL
        System.out.println("Current Url:"+driver.getCurrentUrl());
        //Get Page source
        System.out.println("Page source:"+driver.getPageSource());
        //Find the Login Link element
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        //Click on Login Link element
        loginLink.click();
        //Find the email Field element
        WebElement emailField = driver.findElement(By.id("Email"));
        //Type the email adress to email field element
        emailField.sendKeys("Prime123@gmail.com");
        // Type the Password to Password field element
        driver.findElement(By.name("Password")).sendKeys("Prime123");

        // Close the Browser
        driver.close();
        driver.quit();
    }
}










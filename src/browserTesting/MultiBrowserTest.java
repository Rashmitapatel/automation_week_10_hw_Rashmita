package browserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "Edge";

    static String baseUrl = "https://demo.nopcommerce.com/";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("FireFox")){
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser name");
        }

        //maximise the Browser window
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        // Find the Login link element
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        //Click on login link element
        loginLink.click();
        //Find the Email Field Element
        WebElement emailField = driver.findElement(By.id("Email"));
        // Type the Email address to email field element
        emailField.sendKeys("prime123@gmail.com");
        //type the Password to Password field element
        driver.findElement(By.name("Password")).sendKeys("Prime123");
        // Close the Browser
          driver.close();
          driver.quit();
    }
}

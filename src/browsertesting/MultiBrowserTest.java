package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "Chrome";
    static WebDriver driver;
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";


    public static void main(String[] args) {
        //set up browser
        if(browser.equalsIgnoreCase("Chrome")){
            driver= new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }else{
            System.out.println("Wrong browser entered");
        }
        //open Url
        driver.get(baseUrl);
        //we give implicite wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //print title page
        System.out.println(driver.getTitle());
        //print current URl
        System.out.println(driver.getCurrentUrl());
        //print page source
        System.out.println(driver.getPageSource());
        //get username to username field
        driver.findElement(By.name("username")).sendKeys("Admin");
        //get password to password field
        driver.findElement(By.name("password")).sendKeys("admin123");
        //close browser
        driver.close();


    }
}
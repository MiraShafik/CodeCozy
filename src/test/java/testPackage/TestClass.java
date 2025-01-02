package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {

    WebDriver driver;
    String URL;

    /*@BeforeTest

    public void openURL (String websiteUrl)
    {
        driver = new ChromeDriver();
        driver.navigate().to(websiteUrl);
    }*/

    @Test


    public void testDuckDuckTitle ()
    {
        driver = new ChromeDriver();
        URL = "https://duckduckgo.com/";
        driver.navigate().to(URL);
        String title = driver.getTitle();
        System.out.println("The page title is: " + title);
        Assert.assertEquals(title, "DuckDuckGo - Your protection, our priority.");
        driver.close();
    }

    /*@AfterTest

    public void closeBrowser ()
    {
        driver.close();
    }*/

    @Test

    public void testDuckDuckLogo ()
    {
        driver = new ChromeDriver();
        URL = "https://duckduckgo.com/";
        driver.navigate().to(URL);
        String logoXpath = "\"/html/body/div[1]/div/main/article/div[1]/div[1]/div[1]/header/div[1]/section[1]/a/img\"";
        WebElement logo = driver.findElement(By.xpath(logoXpath));

        if (logo.isDisplayed()) {
            System.out.println("Logo is displayed on the page.");
        } else {
            System.out.println("Logo is not displayed on the page.");
        }

        Assert.assertTrue(logo.isDisplayed(),
                "Logo is not displayed!");
        driver.close();
    }
}

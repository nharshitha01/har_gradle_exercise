//package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebpageTest {
    private static WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        // Initialize the WebDriver and open the browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);  // Wait for the page to load (though it's better to use WebDriverWait)
        driver.get("https://nharshitha01.github.io/har_gradle_exercise/");
    }

    @Test
    public void titleValidationTest() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Sample Website";


    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        // Wait for a short time before quitting the driver
        Thread.sleep(1000);
        driver.quit();  // Quit the browser
    }
}

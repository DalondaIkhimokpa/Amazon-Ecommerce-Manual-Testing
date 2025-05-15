// AmazonSearchTest.java

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("wireless mouse");
        searchBox.submit();

        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        if (pageTitle.toLowerCase().contains("wireless mouse")) {
            System.out.println("Test Passed: Search results loaded.");
        } else {
            System.out.println("Test Failed: Unexpected search results.");
        }

        driver.quit();
    }
}

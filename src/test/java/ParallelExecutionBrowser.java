import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by tairovich_jr on 2022-02-01.
 */
public class ParallelExecutionBrowser {

    static final String searchItem = "java for beginners";


    @Test
    public void googleTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys(searchItem + Keys.ENTER);

    }

    @Test
    public void amazonTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchItem + Keys.ENTER);
    }

    @Test
    public void yahooTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.get("https://yahoo.com");
        driver.findElement(By.id("ybar-sbq")).sendKeys(searchItem + Keys.ENTER);
    }

}

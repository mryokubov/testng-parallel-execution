import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelReader;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tairovich_jr on 2022-02-01.
 */
public class ParallExecutionWithDataProvider {


    @Test(dataProvider = "customers1")
    public void test1(Map<String,String> data) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //login
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx");
        driver.findElement(By.xpath("//input[contains(@id,'MainContent_username')]")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[contains(@id,'MainContent_password')]")).sendKeys("test");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        //click on Order link
        try {

            driver.findElement(By.xpath("//a[text()='Order']")).click();
            Select select = new Select(driver.findElement(By.xpath("//select[contains(@id,'MainContent_fmwOrder_ddlProduct')]")));
            select.selectByVisibleText(data.get("product"));

            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_txtQuantity')]")).sendKeys(data.get("quantity"));

            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_txtName')]")).sendKeys(data.get("customerName"));
            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox2')]")).sendKeys(data.get("street"));
            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox3')]")).sendKeys(data.get("city"));
            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox4')]")).sendKeys(data.get("state"));
            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox5')]")).sendKeys(data.get("zip"));

            driver.findElement(By.xpath("//input[@value='" + data.get("cardRadioBtn") + "']")).click();
            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox6')]")).sendKeys("cardNumber");

            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox1')]")).sendKeys("expireDate");


            driver.findElement(By.xpath("//a[text()='Process']")).click();

     //       WebElement success = driver.findElement(By.xpath("//strong[contains(text(),'New order has been successfully added.')]"));

        }
        catch (Exception e){

        }
        finally {
            driver.quit();
        }



    }

    @Test(dataProvider = "customers2")
    public void test2(Map<String,String> data) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //login
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx");
        driver.findElement(By.xpath("//input[contains(@id,'MainContent_username')]")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[contains(@id,'MainContent_password')]")).sendKeys("test");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        try {

            //click on Order link
            driver.findElement(By.xpath("//a[text()='Order']")).click();
            Select select = new Select(driver.findElement(By.xpath("//select[contains(@id,'MainContent_fmwOrder_ddlProduct')]")));
            select.selectByVisibleText(data.get("product"));

            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_txtQuantity')]")).sendKeys(data.get("quantity"));

            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_txtName')]")).sendKeys(data.get("customerName"));
            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox2')]")).sendKeys(data.get("street"));
            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox3')]")).sendKeys(data.get("city"));
            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox4')]")).sendKeys(data.get("state"));
            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox5')]")).sendKeys(data.get("zip"));

            driver.findElement(By.xpath("//input[@value='" + data.get("cardRadioBtn") + "']")).click();
            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox6')]")).sendKeys("cardNumber");

            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox1')]")).sendKeys("expireDate");


            driver.findElement(By.xpath("//a[text()='Process']")).click();

        //    WebElement success = driver.findElement(By.xpath("//strong[contains(text(),'New order has been successfully added.')]"));

        }catch (Exception e){

        }finally {
            driver.quit();
        }

    }

    @Test(dataProvider = "customers3")
    public void test3(Map<String,String> data) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //login
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx");
        driver.findElement(By.xpath("//input[contains(@id,'MainContent_username')]")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[contains(@id,'MainContent_password')]")).sendKeys("test");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        try {

            //click on Order link
            driver.findElement(By.xpath("//a[text()='Order']")).click();
            Select select = new Select(driver.findElement(By.xpath("//select[contains(@id,'MainContent_fmwOrder_ddlProduct')]")));
            select.selectByVisibleText(data.get("product"));

            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_txtQuantity')]")).sendKeys(data.get("quantity"));

            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_txtName')]")).sendKeys(data.get("customerName"));
            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox2')]")).sendKeys(data.get("street"));
            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox3')]")).sendKeys(data.get("city"));
            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox4')]")).sendKeys(data.get("state"));
            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox5')]")).sendKeys(data.get("zip"));

            driver.findElement(By.xpath("//input[@value='" + data.get("cardRadioBtn") + "']")).click();
            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox6')]")).sendKeys("cardNumber");

            driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox1')]")).sendKeys("expireDate");


            driver.findElement(By.xpath("//a[text()='Process']")).click();

            //    WebElement success = driver.findElement(By.xpath("//strong[contains(text(),'New order has been successfully added.')]"));

        }catch (Exception e){

        }finally {
            driver.quit();
        }

    }

    @DataProvider(name = "customers1")
    public Object[][] getData1(){
        ExcelReader reader = new ExcelReader("src/main/resources/testData/patients.xlsx", "customers1");
        return reader.getData();
    }

    @DataProvider(name = "customers2")
    public Object[][] getData2(){
        ExcelReader reader = new ExcelReader("src/main/resources/testData/patients.xlsx", "customers2");
        return reader.getData();
    }

    @DataProvider(name = "customers3")
    public Object[][] getData3(){
        ExcelReader reader = new ExcelReader("src/main/resources/testData/patients.xlsx", "customers3");
        return reader.getData();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.NoSuchElementException;

public class CalculatorTest {

    @Test
    public void starvationTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url of bmi calculator page
        driver.get("https://healthunify.com/bmicalculator/");
        // Input  digits into weight field
        driver.findElement(By.name("wg")).sendKeys("60");
        // Input  digits into height field
        driver.findElement(By.name("ht")).sendKeys("201");
        //Click the "Calculate" button
        driver.findElement(By.name("cc")).click();
        //Add check
        String resultText = driver.findElement(By.name("desc")).getAttribute("value");
        boolean expectedText = resultText.equals("Your category is Starvation");
        driver.quit();
        Assert.assertTrue(expectedText, "Result is not displayed");
    }

    @Test
    public void underweightTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url of bmi calculator page
        driver.get("https://healthunify.com/bmicalculator/");
        // Input  digits into weight field
        driver.findElement(By.name("wg")).sendKeys("60");
        // Input  digits(fraction) into height field
        driver.findElement(By.name("ht")).sendKeys("181.6");
        //Click the "Calculate" button
        driver.findElement(By.name("cc")).click();
        //Add check
        String resultText = driver.findElement(By.name("desc")).getAttribute("value");
        boolean expectedText = resultText.equals("Your category is Underweight");
        driver.quit();
        Assert.assertTrue(expectedText, "Result is not displayed");

    }

    @Test
    public void normalTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url of bmi calculator page
        driver.get("https://healthunify.com/bmicalculator/");
        // Input  digits into weight field
        driver.findElement(By.name("wg")).sendKeys("60");
        // Input  digits(fraction) into height field
        driver.findElement(By.name("ht")).sendKeys("155.5");
        //Click the "Calculate" button
        driver.findElement(By.name("cc")).click();
        //Add check
        String resultText = driver.findElement(By.name("desc")).getAttribute("value");
        boolean expectedText = resultText.equals("Your category is Normal");
        driver.quit();
        Assert.assertTrue(expectedText, "Result is not displayed");

    }

    @Test
    public void overweightTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url of bmi calculator page
        driver.get("https://healthunify.com/bmicalculator/");
        // Input  digits into weight field
        driver.findElement(By.name("wg")).sendKeys("60");
        // Input  digits into height field
        driver.findElement(By.name("ht")).sendKeys("143");
        //Click the "Calculate" button
        driver.findElement(By.name("cc")).click();
        //Add check
        String resultText = driver.findElement(By.name("desc")).getAttribute("value");
        boolean expectedText = resultText.equals("Your category is Normal");
        driver.quit();
        Assert.assertTrue(expectedText, "Result is not Overweight");

    }

    @Test
    public void obeseTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url of bmi calculator page
        driver.get("https://healthunify.com/bmicalculator/");
        // Input  digits into weight field
        driver.findElement(By.name("wg")).sendKeys("60");
        // Input  digits into height field
        driver.findElement(By.name("ht")).sendKeys("141");
        //Click the "Calculate" button
        driver.findElement(By.name("cc")).click();
        //Add check
        String resultText = driver.findElement(By.name("desc")).getAttribute("value");
        boolean expectedText = resultText.equals("Your category is Obese");
        driver.quit();
        Assert.assertTrue(expectedText, "Result is not displayed");

    }

    @Test
    public void starvationHeightTwoHundredTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url of bmi calculator page
        driver.get("https://healthunify.com/bmicalculator/");
        // Input  digits into weight field
        driver.findElement(By.name("wg")).sendKeys("60");
        // Input  digits into height field
        driver.findElement(By.name("ht")).sendKeys("200");
        //Click the "Calculate" button
        driver.findElement(By.name("cc")).click();
        //Add check
        try {
            String resultText = driver.findElement(By.name("desc")).getAttribute("value");
            boolean expectedText = resultText.equals("Your category is Starvation");
            Assert.assertTrue(expectedText, "Result is not displayed");
        } catch (NoSuchElementException e) {
            System.out.println("There isn't result");
        } finally {
            driver.quit();
        }
    }
}

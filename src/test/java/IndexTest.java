import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IndexTest {
    private static final String PATH = "file:///C:/Users/Admin/IdeaProjects/testing_BMICalculator/src/test/resources/index.html";

    @Test
    public void helloTest() {

        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url of super page
        driver.get(PATH);
        // Find an element
        driver.findElement(By.name("my_greeting"));
        //Add check
        WebElement elementHello = driver.findElement(By.name("my_greeting"));
        boolean isHelloDisplayed = elementHello.isDisplayed();
        driver.quit();
        Assert.assertTrue(isHelloDisplayed, "There isn't this element");
    }

    @Test
    public void selectBandsTest() {

        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url of super page
        driver.get(PATH);
        // Find an element
        driver.findElement(By.name("bands"));
        //Add check
        WebElement selectBandsElement = driver.findElement(By.name("bands"));
        boolean isBandsDisplayed = selectBandsElement.isDisplayed();
        driver.quit();
        Assert.assertTrue(isBandsDisplayed, "There isn't this element");

    }

    @Test
    public void buttonClickMeTest() {

        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url of super page
        driver.get(PATH);
        // Find an element
        driver.findElement(By.id("elem"));
        //Add check
        WebElement Button = driver.findElement(By.id("elem"));
        boolean isButtonDisplayed = Button.isDisplayed();
        driver.quit();
        Assert.assertTrue(isButtonDisplayed, "Button isn't displayed");
    }

    @Test
    public void myNameTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url of super page
        driver.get(PATH);
        //Find an element
        driver.findElement(By.name("my_name"));
        //Add check
        WebElement element = driver.findElement(By.name("my_name"));
        String elementMyName = element.getText();
        boolean myNamyIsContained = elementMyName.contains("Olga");
        driver.quit();
        Assert.assertTrue(myNamyIsContained, "There isn't my name");
    }

    @Test
    public void linkTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url of super page
        driver.get(PATH);
        //Find an element
        driver.findElement(By.name("w3_link")).click();
        //Add check
        WebElement element = driver.findElement(By.id("main"));
        boolean isElementDisplayed = element.isDisplayed();
        driver.quit();
        Assert.assertTrue(isElementDisplayed, "Element isn't displayed");
    }

    @Test
    public void altTextImgTest() {

        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url of super page
        driver.get(PATH);
        // Find an element
        driver.findElement(By.name("nature_photo"));
        //Add check
        WebElement elementImg = driver.findElement(By.name("nature_photo"));
        boolean altText = elementImg.getAttribute("alt").contains("oops, you found it");
        driver.quit();
        Assert.assertTrue(altText, "There isn't this text");
    }
}

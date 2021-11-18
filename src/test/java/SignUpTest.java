

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest {
    @Test
    public void zipCodeShouldAccept5Digits() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[value = Register]")).isDisplayed(), "Сообщение об ошибке не соответствует требованиям");
        driver.quit();
    }

    @Test
    public void zipCodeShouldAccept6Digits() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("123456");
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[value = Register]")).isDisplayed(), "Сообщение об ошибке не соответствует требованиям");
        driver.quit();
    }

    @Test
    public void zipCodeShouldAccept4Digits() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("1234");
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[value = Register]")).isDisplayed(), "Сообщение об ошибке не соответствует требованиям");
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptNothing() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("");
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[value = Register]")).isDisplayed(), "Сообщение об ошибке не соответствует требованиям");
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptLatinLetters() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("abcde");
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[value = Register]")).isDisplayed(), "Сообщение об ошибке не соответствует требованиям");
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptCyrillicLetters() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("абвгд");
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[value = Register]")).isDisplayed(), "Сообщение об ошибке не соответствует требованиям");
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptSymbols() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("№%?_+");
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[value = Register]")).isDisplayed(), "Сообщение об ошибке не соответствует требованиям");
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptSpaceButton() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("     ");
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[value = Register]")).isDisplayed(), "Сообщение об ошибке не соответствует требованиям*");
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptMostCommonlyUsed1() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("qwerty");
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[value = Register]")).isDisplayed(), "Сообщение об ошибке не соответствует требованиям");
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptMostCommonlyUsed2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("1q2w3e");
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[value = Register]")).isDisplayed(), "Сообщение об ошибке не соответствует требованиям");
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptMostCommonlyUsed3() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("11111");
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[value = Register]")).isDisplayed(), "Сообщение об ошибке не соответствует требованиям");
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptMostCommonlyUsed4() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("0987654321");
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[value = Register]")).isDisplayed(), "Сообщение об ошибке не соответствует требованиям");
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptMostCommonlyUsed5() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("qwerty123");
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[value = Register]")).isDisplayed(), "Сообщение об ошибке не соответствует требованиям");
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptMostCommonlyUsed6() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("00000");
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[value = Register]")).isDisplayed(), "Сообщение об ошибке не соответствует требованиям");
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptMostCommonlyUsed7() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("0000000000");
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[value = Register]")).isDisplayed(), "Сообщение об ошибке не соответствует требованиям");
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptMostCommonlyUsed8() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("1234567890");
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[value = Register]")).isDisplayed(), "Сообщение об ошибке не соответствует требованиям");
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptMostCommonlyUsed9() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("йцукен");
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[value = Register]")).isDisplayed(), "Сообщение об ошибке не соответствует требованиям");
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptMostCommonlyUsed10() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("zip_code");
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[value = Register]")).isDisplayed(), "Сообщение об ошибке не соответствует требованиям");
        driver.quit();
    }

}


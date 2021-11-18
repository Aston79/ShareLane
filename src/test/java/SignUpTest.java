

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest {
    @Test
    public void zipCodeShouldAccept5Digits() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        Открытие страницы https://www.sharelane.com/cgi-bin/register.py
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
//        Ввести 5 цифр
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("12345");
//        Нажать кнопку Continue (Без использования в методе WebElement continueButton=)
        driver.findElement(By.cssSelector("[value = Continue]")).click();
//        Убедиться что мы на странице SignUp
        boolean isDisplayed = driver.findElement(By.cssSelector("[value = Register]")).isDisplayed();
        Assert.assertTrue(isDisplayed, "***BUG!***");
//        Закрыть браузер
        driver.quit();
    }

    @Test
    public void zipCodeShouldAccept6Digits() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        Открытие страницы https://www.sharelane.com/cgi-bin/register.py
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
//        Ввести 6 цифр
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("123456");
//        Нажать кнопку Continue (Без использования в методе WebElement continueButton=)
        driver.findElement(By.cssSelector("[value = Continue]")).click();
//        Убедиться что мы не перешли на страницу SignUp в связи с ошибкой
        boolean isDisplayed = driver.findElement(By.cssSelector(".error_message")).isDisplayed();
        Assert.assertTrue(isDisplayed, "***BUG!***");
//        Закрыть браузер
//        driver.quit();
    }

    @Test
    public void zipCodeShouldAccept4Digits() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        Открытие страницы https://www.sharelane.com/cgi-bin/register.py
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
//        Ввести 4 цифры
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("1234");
//        Нажать кнопку Continue (Без использования в методе WebElement continueButton=)
        driver.findElement(By.cssSelector("[value = Continue]")).click();
//        Убедиться что мы не перешли на страницу SignUp в связи с ошибкой
        boolean isDisplayed = driver.findElement(By.cssSelector(".error_message")).isDisplayed();
        Assert.assertTrue(isDisplayed, "***BUG!***");
//        Закрыть браузер
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptNothing() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        Открытие страницы https://www.sharelane.com/cgi-bin/register.py
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
//        Не вводить ничего
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("");
//        Нажать кнопку Continue (Без использования в методе WebElement continueButton=)
        driver.findElement(By.cssSelector("[value = Continue]")).click();
//        Убедиться что мы не перешли на страницу SignUp в связи с ошибкой
        boolean isDisplayed = driver.findElement(By.cssSelector(".error_message")).isDisplayed();
        Assert.assertTrue(isDisplayed, "***BUG!***");
//        Закрыть браузер
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptLatinLetters() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        Открытие страницы https://www.sharelane.com/cgi-bin/register.py
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
//        Ввести 5 букв на латинице
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("abcde");
//        Нажать кнопку Continue (Без использования в методе WebElement continueButton=)
        driver.findElement(By.cssSelector("[value = Continue]")).click();
//        Убедиться что мы не перешли на страницу SignUp в связи с ошибкой
        boolean isDisplayed = driver.findElement(By.cssSelector(".error_message")).isDisplayed();
        Assert.assertTrue(isDisplayed, "***BUG!***");
//        Закрыть браузер
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptCyrillicLetters() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        Открытие страницы https://www.sharelane.com/cgi-bin/register.py
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
//        Ввести 5 букв на кириллице
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("абвгд");
//        Нажать кнопку Continue (Без использования в методе WebElement continueButton=)
        driver.findElement(By.cssSelector("[value = Continue]")).click();
//        Убедиться что мы не перешли на страницу SignUp в связи с ошибкой
        boolean isDisplayed = driver.findElement(By.cssSelector(".error_message")).isDisplayed();
        Assert.assertTrue(isDisplayed, "***BUG!***");
//        Закрыть браузер
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptSymbols() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        Открытие страницы https://www.sharelane.com/cgi-bin/register.py
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
//        Ввести 5 спецсимволов
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("№%?_+");
//        Нажать кнопку Continue (Без использования в методе WebElement continueButton=)
        driver.findElement(By.cssSelector("[value = Continue]")).click();
//        Убедиться что мы не перешли на страницу SignUp в связи с ошибкой
        boolean isDisplayed = driver.findElement(By.cssSelector(".error_message")).isDisplayed();
        Assert.assertTrue(isDisplayed, "***BUG!***");
//        Закрыть браузер
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptSpaceButton() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        Открытие страницы https://www.sharelane.com/cgi-bin/register.py
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
//        Ввести пробел 5 раз
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("     ");
//        Нажать кнопку Continue (Без использования в методе WebElement continueButton=)
        driver.findElement(By.cssSelector("[value = Continue]")).click();
//        Убедиться что мы не перешли на страницу SignUp в связи с ошибкой
        boolean isDisplayed = driver.findElement(By.cssSelector(".error_message")).isDisplayed();
        Assert.assertTrue(isDisplayed, "***BUG!***");
//        Закрыть браузер
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptMostCommonlyUsed1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        Открытие страницы https://www.sharelane.com/cgi-bin/register.py
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
//        Ввести один из наиболее используемых паролей - qwerty
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("qwerty");
//        Нажать кнопку Continue (Без использования в методе WebElement continueButton=)
        driver.findElement(By.cssSelector("[value = Continue]")).click();
//        Убедиться что мы не перешли на страницу SignUp в связи с ошибкой
        boolean isDisplayed = driver.findElement(By.cssSelector(".error_message")).isDisplayed();
        Assert.assertTrue(isDisplayed, "***BUG!***");
//        Закрыть браузер
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptMostCommonlyUsed2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        Открытие страницы https://www.sharelane.com/cgi-bin/register.py
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
//        Ввести один из наиболее используемых паролей - 1q2w3e
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("1q2w3e");
//        Нажать кнопку Continue (Без использования в методе WebElement continueButton=)
        driver.findElement(By.cssSelector("[value = Continue]")).click();
//        Убедиться что мы не перешли на страницу SignUp в связи с ошибкой
        boolean isDisplayed = driver.findElement(By.cssSelector(".error_message")).isDisplayed();
        Assert.assertTrue(isDisplayed, "***BUG!***");
//        Закрыть браузер
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptMostCommonlyUsed3() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        Открытие страницы https://www.sharelane.com/cgi-bin/register.py
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
//        Ввести один из наиболее используемых паролей - 11111
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("11111");
//        Нажать кнопку Continue (Без использования в методе WebElement continueButton=)
        driver.findElement(By.cssSelector("[value = Continue]")).click();
//        Убедиться что мы не перешли на страницу SignUp в связи с ошибкой
        boolean isDisplayed = driver.findElement(By.cssSelector(".error_message")).isDisplayed();
        Assert.assertTrue(isDisplayed, "***BUG!***");
//        Закрыть браузер
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptMostCommonlyUsed4() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        Открытие страницы https://www.sharelane.com/cgi-bin/register.py
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
//        Ввести один из наиболее используемых паролей - 0987654321
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("0987654321");
//        Нажать кнопку Continue (Без использования в методе WebElement continueButton=)
        driver.findElement(By.cssSelector("[value = Continue]")).click();
//        Убедиться что мы не перешли на страницу SignUp в связи с ошибкой
        boolean isDisplayed = driver.findElement(By.cssSelector(".error_message")).isDisplayed();
        Assert.assertTrue(isDisplayed, "***BUG!***");
//        Закрыть браузер
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptMostCommonlyUsed5() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        Открытие страницы https://www.sharelane.com/cgi-bin/register.py
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
//        Ввести один из наиболее используемых паролей - qwerty123
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("qwerty123");
//        Нажать кнопку Continue (Без использования в методе WebElement continueButton=)
        driver.findElement(By.cssSelector("[value = Continue]")).click();
//        Убедиться что мы не перешли на страницу SignUp в связи с ошибкой
        boolean isDisplayed = driver.findElement(By.cssSelector(".error_message")).isDisplayed();
        Assert.assertTrue(isDisplayed, "***BUG!***");
//        Закрыть браузер
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptMostCommonlyUsed6() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        Открытие страницы https://www.sharelane.com/cgi-bin/register.py
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
//        Ввести один из наиболее используемых паролей - 00000
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("00000");
//        Нажать кнопку Continue (Без использования в методе WebElement continueButton=)
        driver.findElement(By.cssSelector("[value = Continue]")).click();
//        Убедиться что мы не перешли на страницу SignUp в связи с ошибкой
        boolean isDisplayed = driver.findElement(By.cssSelector(".error_message")).isDisplayed();
        Assert.assertTrue(isDisplayed, "***BUG!***");
//        Закрыть браузер
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptMostCommonlyUsed7() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        Открытие страницы https://www.sharelane.com/cgi-bin/register.py
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
//        Ввести один из наиболее используемых паролей - 0000000000
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("0000000000");
//        Нажать кнопку Continue (Без использования в методе WebElement continueButton=)
        driver.findElement(By.cssSelector("[value = Continue]")).click();
//        Убедиться что мы не перешли на страницу SignUp в связи с ошибкой
        boolean isDisplayed = driver.findElement(By.cssSelector(".error_message")).isDisplayed();
        Assert.assertTrue(isDisplayed, "***BUG!***");
//        Закрыть браузер
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptMostCommonlyUsed8() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        Открытие страницы https://www.sharelane.com/cgi-bin/register.py
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
//        Ввести один из наиболее используемых паролей - 1234567890
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("1234567890");
//        Нажать кнопку Continue (Без использования в методе WebElement continueButton=)
        driver.findElement(By.cssSelector("[value = Continue]")).click();
//        Убедиться что мы не перешли на страницу SignUp в связи с ошибкой
        boolean isDisplayed = driver.findElement(By.cssSelector(".error_message")).isDisplayed();
        Assert.assertTrue(isDisplayed, "***BUG!***");
//        Закрыть браузер
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptMostCommonlyUsed9() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        Открытие страницы https://www.sharelane.com/cgi-bin/register.py
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
//        Ввести один из наиболее используемых паролей - йцукен
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("йцукен");
//        Нажать кнопку Continue (Без использования в методе WebElement continueButton=)
        driver.findElement(By.cssSelector("[value = Continue]")).click();
//        Убедиться что мы не перешли на страницу SignUp в связи с ошибкой
        boolean isDisplayed = driver.findElement(By.cssSelector(".error_message")).isDisplayed();
        Assert.assertTrue(isDisplayed, "***BUG!***");
//        Закрыть браузер
        driver.quit();
    }

    @Test
    public void zipCodeShouldAcceptMostCommonlyUsed10() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("zip_code");
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        boolean isDisplayed = driver.findElement(By.cssSelector(".error_message")).isDisplayed();
        Assert.assertTrue(isDisplayed, "***BUG!***");
        driver.quit();
    }

}


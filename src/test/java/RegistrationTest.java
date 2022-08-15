import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class RegistrationTest extends MethodsForRegistration {

    @Test
    public void registrationTest() {
        ChromeDriver browser = precondition();
        registration(browser);
        String presentElement = browser.findElement(By.xpath("//span[contains(text(),'Account is created!')]")).getText();
        assertEquals(presentElement, "Account is created!", "Account hasn't been created!");
        browser.quit();
    }

    @Test
    public void zipCode4Digits() {
        ChromeDriver browser = precondition();
        browser.get(registerURL);
        browser.findElement(By.name("zip_code")).sendKeys("1234");
        browser.findElement(By.xpath("//input[@value='Continue']")).click();
        String presentElement = browser.findElement(By.className("error_message")).getText();
        assertEquals(presentElement, "Oops, error on page. ZIP code should have 5 digits",
                "There is no error message!");
        browser.quit();
    }

    @Test
    public void zipCode5Digits() {
        ChromeDriver browser = precondition();
        browser.get(registerURL);
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.xpath("//input[@value='Continue']")).click();
        boolean isPresentElement = browser.findElement(By.cssSelector("[value=Register]")).isDisplayed();
        assertTrue(isPresentElement, "User doesn't redirect to the 2nd part of registration");
        browser.quit();
    }

    @Test
    public void zipCode6Digits() {
        ChromeDriver browser = precondition();
        browser.get(registerURL);
        browser.findElement(By.name("zip_code")).sendKeys("123456");
        browser.findElement(By.xpath("//input[@value='Continue']")).click();
        assertTrue(isPresentElement(browser, "cssSelector", "error_message"),
                "There is no error message: " + errorMessageZipCode);
        browser.quit();
    }

    @Test
    public void redirectionToThe2ndRegistrationPart() {
        ChromeDriver browser = precondition();
        browser.get(registerURL);
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.xpath("//input[@value='Continue']")).click();
        assertTrue(isPresentElement(browser, "cssSelector", "[value='Register']"),
                "User doesn't redirect to the 2nd registration part");
        browser.quit();
    }

    @Test
    public void emptyFirstName() {
        ChromeDriver browser = precondition();
        browser.get(secondRegistrationURL);
        browser.findElement(By.name("email")).sendKeys("123@mail.com");
        browser.findElement(By.name("password1")).sendKeys("12345");
        browser.findElement(By.name("password2")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value='Register']")).click();
        assertTrue(isPresentElement(browser, "class", "error_message"),
                "There is no error message: "+ errorMessage2ndPart);
        browser.quit();
    }

    @Test
    public void emptyEmail() {
        ChromeDriver browser = precondition();
        browser.get(secondRegistrationURL);
        browser.findElement(By.name("first_name")).sendKeys("Max");
        browser.findElement(By.name("password1")).sendKeys("12345");
        browser.findElement(By.name("password2")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value='Register']")).click();
        assertTrue(isPresentElement(browser, "class", "error_message"),
                "There is no error message: "+ errorMessage2ndPart);
        browser.quit();
    }

    @Test
    public void symbolsFirstName() {
        ChromeDriver browser = precondition();
        browser.get(secondRegistrationURL);
        browser.findElement(By.name("first_name")).sendKeys("!@#$%");
        browser.findElement(By.name("email")).sendKeys("123@mail.com");
        browser.findElement(By.name("password1")).sendKeys("12345");
        browser.findElement(By.name("password2")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value='Register']")).click();
        assertTrue(isPresentElement(browser, "class", "error_message"),
                "There is no error message: "+ errorMessage2ndPart);
        browser.quit();
    }

    @Test
    public void emailWithoutMailName() {
        ChromeDriver browser = precondition();
        browser.get(secondRegistrationURL);
        browser.findElement(By.name("first_name")).sendKeys("Max");
        browser.findElement(By.name("email")).sendKeys("@mail.com");
        browser.findElement(By.name("password1")).sendKeys("12345");
        browser.findElement(By.name("password2")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value='Register']")).click();
        assertTrue(isPresentElement(browser, "class", "error_message"),
                "There is no error message: "+ errorMessage2ndPart);
        browser.quit();
    }

    @Test
    public void emptyPassword() {
        ChromeDriver browser = precondition();
        browser.get(secondRegistrationURL);
        browser.findElement(By.name("first_name")).sendKeys("Max");
        browser.findElement(By.name("email")).sendKeys("123@mail.com");
        browser.findElement(By.name("password2")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value='Register']")).click();
        assertTrue(isPresentElement(browser, "class", "error_message"),
                "There is no error message: "+ errorMessage2ndPart);
        browser.quit();
    }

    @Test
    public void emptyConfirmPassword() {
        ChromeDriver browser = precondition();
        browser.get(secondRegistrationURL);
        browser.findElement(By.name("first_name")).sendKeys("Max");
        browser.findElement(By.name("email")).sendKeys("123@mail.com");
        browser.findElement(By.name("password1")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value='Register']")).click();
        assertTrue(isPresentElement(browser, "class", "error_message"),
                "There is no error message: "+ errorMessage2ndPart);
        browser.quit();
    }

    @Test
    public void passwordMismatching() {
        ChromeDriver browser = precondition();
        browser.get(secondRegistrationURL);
        browser.findElement(By.name("first_name")).sendKeys("Max");
        browser.findElement(By.name("email")).sendKeys("123@mail.com");
        browser.findElement(By.name("password1")).sendKeys("12345");
        browser.findElement(By.name("password2")).sendKeys("11111");
        browser.findElement(By.cssSelector("[value='Register']")).click();
        assertTrue(isPresentElement(browser, "class", "error_message"),
                "There is no error message: "+ errorMessage2ndPart);
        browser.quit();
    }
}

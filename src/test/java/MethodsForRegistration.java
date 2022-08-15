import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MethodsForRegistration {

    String registerURL = "https://www.sharelane.com/cgi-bin/register.py";
    String secondRegistrationURL = "https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345";
    String errorMessage2ndPart = "Oops, error on page. Some of your fields have invalid data or email was previously used";
    String errorMessageZipCode = "Oops, error on page. ZIP code should have 5 digits";

    boolean isPresentElement(ChromeDriver browser, String selector, String locator) {
        boolean presentElement = false;
        switch (selector) {
            case "xpath":
                try {
                    browser.findElement(By.xpath(locator));
                    presentElement = true;
                } catch (Exception ignored) {
                    presentElement = false;
                }
                break;
            case "cssSelector":
                try {
                    browser.findElement(By.cssSelector(locator));
                    presentElement = true;
                } catch (Exception ignored) {
                    presentElement = false;
                }
                break;
            case "id":
                try {
                    browser.findElement(By.id(locator));
                    presentElement = true;
                } catch (Exception ignored) {
                    presentElement = false;
                }
                break;
            case "class":
                try {
                    browser.findElement(By.className(locator));
                    presentElement = true;
                } catch (Exception ignored) {
                    presentElement = false;
                }
                break;
        }
        return presentElement;
    }

    public ChromeDriver precondition() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        ChromeDriver browser = new ChromeDriver(options);
        browser.manage().window().maximize();
        return browser;
    }

    public void registration(ChromeDriver browser) {
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("123456");
        browser.findElement(By.xpath("//input[@value='Continue']")).click();
        browser.findElement(By.name("first_name")).sendKeys("Max");
        browser.findElement(By.name("email")).sendKeys("123@mail.com");
        browser.findElement(By.name("password1")).sendKeys("11111");
        browser.findElement(By.name("password2")).sendKeys("11111");
        browser.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]")).click();
    }

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShareLaneTest {

    @Test
    public void zipCode4Digits() {
        // 1. Open browser
        // 2. Registration
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("123456");
        browser.findElement(By.xpath("//input[@value='Continue']")).click();
        browser.findElement(By.name("first_name")).sendKeys("Max");
        browser.findElement(By.name("last_name")).sendKeys("Kazliakouski");
        browser.findElement(By.name("email")).sendKeys("123@mail.com");
        browser.findElement(By.name("password1")).sendKeys("11111");
        browser.findElement(By.name("password2")).sendKeys("11111");
        browser.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]")).click();
        browser.quit();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ShoppingCartTest extends BaseMethods {

    @Test
    public void discount19Books() {
        int quantity = 19;
        int disInPercent = 0;
        ChromeDriver browser = precondition();
        registration(browser);
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
        browser.quit();
    }

    @Test
    public void discount20Books() {
        int quantity = 20;
        int disInPercent = 2;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount21Books() {
        int quantity = 21;
        int disInPercent = 2;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount49Books() {
        int quantity = 49;
        int disInPercent = 2;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount50Books() {
        int quantity = 50;
        int disInPercent = 3;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount51Books() {
        int quantity = 51;
        int disInPercent = 3;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount98Books() {
        int quantity = 98;
        int disInPercent = 3;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount99Books() {
        int quantity = 99;
        int disInPercent = 3;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount100Books() {
        int quantity = 100;
        int disInPercent = 4;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount101Books() {
        int quantity = 101;
        int disInPercent = 4;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount498Books() {
        int quantity = 498;
        int disInPercent = 4;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount499Books() {
        int quantity = 499;
        int disInPercent = 4;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount500Books() {
        int quantity = 500;
        int disInPercent = 5;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount501Books() {
        int quantity = 501;
        int disInPercent = 5;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount998Books() {
        int quantity = 998;
        int disInPercent = 5;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount999Books() {
        int quantity = 999;
        int disInPercent = 5;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount1000Books() {
        int quantity = 1000;
        int disInPercent = 6;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount1001Books() {
        int quantity = 1001;
        int disInPercent = 6;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount4998Books() {
        int quantity = 4998;
        int disInPercent = 6;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount4999Books() {
        int quantity = 4999;
        int disInPercent = 6;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount5000Books() {
        int quantity = 5000;
        int disInPercent = 7;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount5001Books() {
        int quantity = 5001;
        int disInPercent = 7;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount9998Books() {
        int quantity = 9998;
        int disInPercent = 7;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount9999Books() {
        int quantity = 9999;
        int disInPercent = 7;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }

    @Test
    public void discount10000Books() {
        int quantity = 10000;
        int disInPercent = 8;
        ChromeDriver browser = precondition();
        registrationAndLogin(browser);
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }
    @Test
    public void discount10001Books() {
        int quantity = 10001;
        int disInPercent = 8;
        ChromeDriver browser = precondition();
        browser.findElement(By.name("q")).sendKeys(String.valueOf(quantity));
        browser.findElement(By.cssSelector("[value=Update]")).click();
        assertEquals(discountInPercent(browser), String.valueOf(disInPercent), "Incorrect discount in percent");
        assertEquals(discountInDollars(browser), calculateDiscountInDollars(quantity, disInPercent), "Incorrect discount in dollars");
        assertEquals(totalSum(browser), calculateTotalSum(quantity, disInPercent), "Incorrect total sum");
    }
}

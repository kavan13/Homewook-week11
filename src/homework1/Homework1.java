package homework1;
/*
Homework -1
Navigate to google https://www.google.com/
In Google search type "demo nopCommerce store" and click search
Click on the link "nopCommerce demo store"
Click on Computers and Verify that the user successfully navigated to the Computers page.
Navigate to google https://www.google.com/
In Google search type "demo nopCommerce store" and click search
Click on the link "nopCommerce demo store"
Click on Electronics and Verify that the user successfully navigated to the Electronics page.
Above same test do for Apparel, Digital downloads, Books, Jewelry, Gift Cards.

 */
import basetest.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Homework1 extends BaseTest {

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.name("q")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();
        String expectedMessage = "Computers";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Text did not match", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.name("q")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();
        String expectedMessage = "Electronics";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Text did not match", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.name("q")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
        String expectedMessage = "Apparel";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Text did not match", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToDigitaldownloadsPageSuccessfully() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.name("q")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        String expectedMessage = "Digital downloads";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Text did not match", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.name("q")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
        String expectedMessage = "Books";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Text did not match", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.name("q")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
        String expectedMessage = "Jewelry";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Text did not match", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.name("q")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        String expectedMessage = "Gift Cards";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Text did not match", expectedMessage, actualMessage);
    }
}
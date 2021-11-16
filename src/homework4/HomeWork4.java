package homework4;
/*
Homework – 4
https://opensource-demo.orangehrmlive.com/
( Username : Admin | Password : admin123 )
Enter username
Enter password
Click login
Verify that the text “Welcome Paul”
After Paul one symbol there so click on the symbol for logout.
Verify the below text.
LOGIN Panel

 */
import basetest.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeWork4 extends BaseTest {

    String url = "https://opensource-demo.orangehrmlive.com/";



    @Test
    public void loginOrange(){
        driver.navigate().to(url);
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("admin123");

        WebElement loginbutton = driver.findElement(By.xpath("//input[@name='Submit']"));
        loginbutton.click();

        WebElement welcome = driver.findElement(By.xpath("//a[@id='welcome']"));
        welcome.click();

        String expectedName = "Welcome chandru";
        WebElement welcomeMsg = driver.findElement(By.xpath("//a[@id='welcome']"));
        String actualName = welcomeMsg.getText();
        Assert.assertEquals("Name did not match",expectedName,actualName);

        WebElement logout = driver.findElement(By.linkText("Logout"));
        logout.click();

        String expectedMessage = "LOGIN Panel";
        WebElement message = driver.findElement(By.xpath("//div[@id='logInPanelHeading']"));
        String actualMessage = message.getText();
        Assert.assertEquals( "LOGIN Panel",expectedMessage,actualMessage);
    }

}

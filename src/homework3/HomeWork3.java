package homework3;
/*
Homework - 3
Open url : http://automationpractice.com/index.php
Click on Sign In
Enter correct Email in Email field
Enter wrong Password in Password field
Click on the Sign In button.
Expected Result:
Error Message “There is 1 error”

 */
import basetest.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeWork3 extends BaseTest {
    String url = "http://automationpractice.com/index.php";



    @Test
    public void yourLogo(){
        driver.navigate().to(url);

        WebElement signup = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        signup.click();

        WebElement emailid = driver.findElement(By.xpath("//input[@id='email']"));
        emailid.sendKeys("Kkk@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
        password.sendKeys("123Kkk");

        WebElement signin = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
        signin.click();

        String expectedMessage = "There is 1 error";
        WebElement message = driver.findElement(By.xpath("//p[contains(text(),'There is 1 error')]"));
        String actualMessage = message.getText();
        Assert.assertEquals( "Sign in  not successful",expectedMessage,actualMessage);
    }
}

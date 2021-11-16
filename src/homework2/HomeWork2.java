package homework2;
/*
Homework – 2
Navigate to website "https://demo.nopcommerce.com/"
Click on the register link.
Fill in all the fields.
Click on the register button.
Verify that the user registered successfully.

 */

import basetest.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class HomeWork2 extends BaseTest {
    String url = "https://demo.nopcommerce.com/";

    @Test
    public void verifyRegisterPageForNopCommerce()  {
        driver.navigate().to(url);
        WebElement register = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        register.click();


        //  WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
        //gender.sendKeys("Male");



        WebElement firstname = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstname.sendKeys("kavan");

        WebElement lastname = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastname.sendKeys("patel");

        WebElement day = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        day.sendKeys("10");

        WebElement month = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        month.sendKeys("April");

        WebElement year = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        year.sendKeys("1987");

        Random randomNum = new Random();
        int randomGenerator = randomNum.nextInt(1000);

        WebElement email = driver.findElement(By.xpath("//input[@name='Email']"));
        email.sendKeys("kavanpatel"+randomGenerator+"@gmail.com");

        WebElement companyname = driver.findElement(By.xpath("//input[@name='Company']"));
        companyname.sendKeys("Amazon");

        WebElement newsletter = driver.findElement(By.xpath("//input[@name='Newsletter']"));
        newsletter.sendKeys("Newsletter");

        WebElement password = driver.findElement(By.xpath("//input[@name='Password']"));
        password.sendKeys("KKK123456");

        WebElement confirmpassword = driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
        confirmpassword.sendKeys("KKK123456");

        WebElement registerbtn = driver.findElement(By.xpath("//button[@id='register-button']"));
        registerbtn.click();


        String expectedMessage = "Your registration completed";
        WebElement message = driver.findElement(By.xpath("//div[text()='Your registration completed']"));
        String actualMessage = message.getText();
        Assert.assertEquals( "User registtered unsuccessfully",expectedMessage,actualMessage);

    }
}


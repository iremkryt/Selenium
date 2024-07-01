package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.techcareer.net/Account/Login");//url üzerinden erişim sqağladı
        driver.findElement(By.id("Username")).sendKeys("testQA");
        driver.findElement(By.name("Password")).sendKeys("123456");
        driver.findElements(By.name("button")).get(1).click();//click yerine submit de olur tıklamayı kontrol ettik
        
    }
}

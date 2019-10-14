package javaArray;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginTest {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com");
		driver.findElement(By.id("identifierId")).sendKeys("rashmilatatoppo1989@gmail.com");
		WebElement nextbtn = driver.findElement(By.className("CwaK9"));
		nextbtn.click();
		WebElement password = driver.findElement(By.xpath("//input[@type='password' and @name='password']"));
				password.sendKeys("9039602335");
		WebElement nextbutton = driver.findElement(By.xpath("//span[@class='CwaK9']"));
				nextbutton.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}

package javaArray;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonExample {
 public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
	WebElement radiobutton = driver.findElement(By.id("three"));
	Boolean state = radiobutton.isSelected();
	if (state==true) {
		System.out.println("Already selected not doing any action");
	}else {
		radiobutton.click();
	}
}
}

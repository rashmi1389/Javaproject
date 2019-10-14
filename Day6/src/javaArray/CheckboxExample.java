package javaArray;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
	//WebElement checkbox = driver.findElement(By.name("permission"));
	//WebElement checkbox1 = driver.findElement(By.name("discardinfo"));
	//checkbox.click();
	//checkbox1.click();
	List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
    for(WebElement check:checkboxes){
        check.click();
    }
	
	
	
	//Boolean state = checkbox.isSelected();
	//if(state==true) {
		//System.out.println("Already selected not doing any action");
	//} else {
		//checkbox.click();
	//}
}
}

package javaArray;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonlinks {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		int count = 0;
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		 for (int i = 0; i<links.size(); i++)
		 {
			// links.get(i).getText().replaceAll("\\r\\n|\\r|\\n", " ");
			 // && and
			 if (!links.get(i).getText().equals(""))
			 {
				count = count +1;
				 System.out.println(links.get(i).getText());
			 }
			 
		 }
		System.out.println("Total no of links with text are" + count);
				
		
	}
	

}

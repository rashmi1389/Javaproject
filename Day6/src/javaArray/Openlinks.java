package javaArray;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openlinks {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.google.com");
	 List<WebElement> links = driver.findElements(By.tagName("a"));
	 Iterator<WebElement> it = links.iterator();
	 //System.out.println(links.size());
	 //for(int i=0;i<links.size();i++)
	 //{
		// driver.get(links.get(i).getText());
		// System.out.println(links.get(i).getText());
	 //}
	 
	 //for(WebElement link:links ){
			//System.out.println(link.getText() + " - " + link.getAttribute("href"));
			 //driver.get(link.getAttribute("href"));
		}
	 
	
	
}


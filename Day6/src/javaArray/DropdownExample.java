package javaArray;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebay.com");
		WebElement dropdownbox = driver.findElement(By.id("gh-cat"));		
		Select sel = new Select(dropdownbox);
		//sel.selectByIndex(1);
		 sel.selectByVisibleText("Music");
		String Musics="";
		List<WebElement> item = sel.getOptions();
		//item.size();
	System.out.println(item.size());
	
		for(int i=0 ; i<item.size(); i++) {
			 //String Value= item.get(i).getText();
			// System.out.println(item.size());
			// System.out.println(Value.trim()+" "+i );
			
			 
			 if (item.get(i).getText().equals("Music"))
			 {
				Musics="Music";
	            }
			
			
			
			//System.out.println(item.get(i).getText());
		}
		 
		if (Musics=="Music")		
			
		{
			System.out.println("Option found");
		}
		else
		{
			System.out.println("Option  not found");
		}
	}
	

}

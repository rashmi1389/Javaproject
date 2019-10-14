package javaArray;

import java.nio.charset.Charset;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayitems {
	public static void main(String[] args) {
		//String RUPEE = "\u20B9";
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=moblie&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		List<WebElement> MobList = driver.findElements(By.xpath(".//div[@class='_3wU53n']"));
		List<WebElement>Mobprice = driver.findElements(By.xpath(".//div[@class='_1vC4OE _2rQ-NK']"));
		System.out.println(MobList.size());
		for(int i = 0; i<MobList.size();i++)
		{
			String mobile = MobList.get(i).getText();
			//System.out.println(mobile);
			
			String price = Mobprice.get(i).getText();
			// price.replace("RUPEE", "Rs.");
			//Charset charset = Charset.forName("UTF-8");
			//String Fprice =charset.decode(charset.encode(price)).toString();
			//String RUPEE =  "₹";
					
			//if(RUPEE.equalsIgnoreCase("₹")) {
				//  System.out.println("if condition"+RUPEE);
				//}
			String Fprice= price.substring(1);
			String FullPrice= "RS."+Fprice;
			
			System.out.println(mobile  + "  " + FullPrice);
		}
	}

}

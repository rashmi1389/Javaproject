package javaArray;

import java.net.HttpURLConnection;
import java.util.List;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;
import org.hamcrest.collection.IsEmptyCollection;
import org.hamcrest.text.IsEmptyString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxlinksExample {
public static void main(String[] args) {
	
	String homePage = "http://newprashantphoto.site";
    String url = "";
    String Name ="";
   
    HttpURLConnection huc = null;
    int respCode = 200;
	
	WebDriver driver = new FirefoxDriver();
	driver.get(homePage);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	
	for(int i =0; i<links.size(); i++)
	{
	
		url = links.get(i).getAttribute("href");
		Name= links.get(i).getText();
		String fullpath = String.format("All Url is : %1$s - %2$s ", Name,url); 
		System.out.println(fullpath );
		if(url==null ||  url.isEmpty())
		{
			System.out.println(String.format("%1$s is invalid",Name));
		}
		else
		{
			
			
			try {
                huc = (HttpURLConnection)(new URL(url).openConnection());
                
                huc.setRequestMethod("HEAD");
                
                huc.connect();
                
                respCode = huc.getResponseCode();
                
                if(respCode >= 400){
                    System.out.println(url+" is a broken link");
                }
                else{
                   System.out.println(url+ respCode+" is a valid link");
                	//driver.switchTo().window(driver.getWindowHandle(url));
                }
                     
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
			//driver.get(url);
		}
		
		
	}
	driver.quit();
	
}
}

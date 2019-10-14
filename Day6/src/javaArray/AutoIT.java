package javaArray;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIT {
	
		
		public static void main(String[] args) throws Exception
		{
			 System.setProperty("webdriver.Firefox.driver","C:\\Users\\RITU\\Desktop\\chromedriver.exe");
			
			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.tinyupload.com/");
			Thread.sleep(3000);
			driver.findElement(By.name("uploaded_file")).click();
			Runtime.getRuntime().exec("cmd /C  C:\\Users\\RITU\\Desktop\\New AutoIt v3 Script.exe");
			Thread.sleep(3000);
			//Runtime.getRuntime().exec("cmd /C C:\\Users\\S@f'\\Desktop\\githibCode\\Upload.exe");
			
		

}
}

package javaArray;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Gmaillogin {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "https://accounts.google.com/signin";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));
		email_phone.sendKeys("rashmilatatoppo1989@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeClickable(password));
		password.sendKeys("9039602335");
		driver.findElement(By.id("passwordNext")).click();
		
		
	}

}

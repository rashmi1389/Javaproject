package javaArray;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ProfileExample {
	public static void main(String[] args) {
		ProfilesIni ini = new ProfilesIni();
		FirefoxProfile fp = ini.getProfile("Ritu");
		WebDriver driver = new FirefoxDriver(fp);
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
	}

}

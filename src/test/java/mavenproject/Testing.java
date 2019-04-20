package mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {

	public static void main(String[] args) throws FileNotFoundException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		System.out.println(System.getProperty("user.dir"));

		driver.navigate().to("http://gmail.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		System.out.println(new File(".").getAbsolutePath());

		Properties OR = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\OR.properties");
		try {
			OR.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(OR.getProperty("weblink"));
				
	}

}

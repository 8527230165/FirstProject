package AutoCompletePractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	
	
	public static WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.navigate().to("https://demoqa.com/autocomplete/");
		driver.manage().window().maximize();
		
		System.out.println(System.getProperty("user.dir"));
		/*driver.findElement(By.id("tags")).sendKeys("a");
		Robot r=new Robot();
		Thread.sleep(1000);
		List<WebElement> list=driver.findElements(By.className("ui-menu-item"));
		//int i=0;
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
		System.out.println("---------------");
		System.out.println("Size :"+list.size());
		
		System.out.println("---------------");
		
		int j=0;
		while(j<list.size()) {
			if(list.get(j).getText().equals("Java")) {
				System.out.println(list.get(j).getText());
				list.get(j).click();
				break;				
			}
			else {
				r.keyPress(KeyEvent.VK_DOWN);
				j++;
			}
			
		}
		
		System.out.println("Finish");
		*/
		
	}

}

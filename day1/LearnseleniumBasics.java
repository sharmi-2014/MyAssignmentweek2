package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnseleniumBasics {
	public static void main(String[]args) {
		//WebDriverManager.ChromeDriver.setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("Decorativesubmit")).click();
		String title1=driver.getTitle();
		System.out.println(title1);
		driver.close();
		
		}	

}

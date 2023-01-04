package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[]args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("groupNameLocal")).sendKeys("sharmi");
		driver.findElement(By.id("officeSiteName")).sendKeys("Testleaf");
		driver.findElement(By.id("annualRevenue")).sendKeys("45000");
		WebElement tool=driver.findElement(By.name("industryEnumId"));
		Select drop=new Select(tool);
		drop.selectByVisibleText("Computer Software");
		
		
		WebElement tool1=driver.findElement(By.name("ownershipEnumId"));
		Select drop1=new Select(tool1);
		drop1.selectByVisibleText("S-Corporation");
		
		WebElement tool2=driver.findElement(By.id("dataSourceId"));
		Select drop2=new Select(tool2);
		drop2.selectByValue("LEAD_EMPLOYEE");
		WebElement tool3=driver.findElement(By.id("marketingCampaignId"));
		Select drop3=new Select(tool3);
		drop3.selectByIndex(6);
		
		WebElement tool4=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select drop4=new Select(tool4);
		drop4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit"));
		String title=driver.getTitle();
		System.out.println(title);
		}

}

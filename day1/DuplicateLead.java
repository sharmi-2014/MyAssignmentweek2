package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DuplicateLead {

	public static void main(String[]agrs) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	//String title=driver.getTitle();
	//System.out.println(title);
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sharmila");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Aravindhan");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sharmi");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("EEE");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Learningselenium");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sarmila.eee@gmail.com");
	driver.findElement(By.name("submitButton")).click();
	String title=driver.getTitle();
	System.out.println(title);
	
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("leaftaps");
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sarmi");
	driver.findElement(By.className("smallSubmit")).click();
	String title1=driver.getTitle();
	System.out.println(title1);
	
	}


}
	//String Title=driver.getTitle();
	//System.out.println(Title);

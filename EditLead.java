package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("inputLogin")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//label[text()='Password']/following::input")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//div[@class='x-tab-panel-bwrap']//following::label[text()='First name:'])/following::input")).sendKeys("Gopi");
		driver.findElement(By.xpath("//button[@class='x-btn-text' and text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-scroller']//div//tbody/tr/td/div/a")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyName=driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("TCSION");
		driver.findElement(By.name("submitButton")).click();
		String updatedCmpyNm=driver.findElement(By.xpath("//span[text()='Company Name']/following::span")).getText();
		String[] split = updatedCmpyNm.split(" ");
		System.out.println(split[0]);
		if(split[0].equals("TCSION")) {
			System.out.println("Chnaged name appears on the page");
		}
		driver.close();

	}

}

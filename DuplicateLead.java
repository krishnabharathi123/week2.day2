package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner'])[3]/span")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("Test@gmail.com");
		driver.findElement(By.xpath("//button[@class='x-btn-text' and text()='Find Leads']")).click();
		Thread.sleep(3000);
		WebElement FrLead = driver.findElement(By.xpath("(//td[contains(@class,'x-grid3-td-firstName')]/div/a)[2]"));
		String capturedName=FrLead.getText();
		System.out.println(capturedName);
		FrLead.click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		System.out.println(driver.findElement(By.id("sectionHeaderTitle_leads")).getText());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@type='submit' and @value='Create Lead']")).click();
		String duplicatedName=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(capturedName.equals(duplicatedName)) {
			System.out.println("Lead name duplicated");
		}
		driver.close();
	}

}

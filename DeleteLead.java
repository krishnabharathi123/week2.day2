package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		driver.findElement(By.xpath("//ul[@class='shortcuts']/li[3]")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("56");
		WebElement findLead = driver.findElement(By.xpath("//button[text()='Find Leads' and @type='button']"));
		findLead.click();
		Thread.sleep(1000);
		WebElement firstLead = driver.findElement(By.xpath("//div[@class='x-grid3-scroller']//div//tbody/tr/td"));
		String firstLeadId = firstLead.getText();
		System.out.println(firstLeadId);
		driver.findElement(By.linkText(firstLeadId)).click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.xpath("//ul[@class='shortcuts']/li[3]/a")).click();
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(firstLeadId);

		driver.findElement(By.xpath("//button[text()='Find Leads' and @type='button']")).click();
		String deletionMsg = driver
				.findElement(By.xpath("//div[@class='x-paging-info' and text()='No records to display']")).getText();
		Thread.sleep(10000);
		System.out.println(deletionMsg);
		if (deletionMsg.equals("No records to display")) {
			System.out.println("successfully deleted the lead");
			driver.close();
		}

	}

}

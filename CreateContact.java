package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("inputLogin")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//label[text()='Password']/following::input")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionHeader']//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//ul[@class='shortcuts']/li[2]/a")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Krishna");
		driver.findElement(By.id("lastNameField")).sendKeys("Bharathi");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("krish");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("bhar");
		driver.findElement(By.name("departmentName")).sendKeys("EEE");
		WebElement description = driver.findElement(By.name("description"));
		description.sendKeys("hi \nhello");
		driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("9876");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("krishna@gmail.com");
		Select s1 = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		s1.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("notes");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
	}

}

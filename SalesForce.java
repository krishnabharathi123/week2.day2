package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("UserFirstName")).sendKeys("Krishna");
		driver.findElement(By.name("UserLastName")).sendKeys("Bharathi");
		driver.findElement(By.name("UserEmail")).sendKeys("krishna@gmail.com");
		// Select s1=new
		// Select(driver.findElement(By.xpath("//div[contains(@class,'selectFieldInput')][1]//following::select]")));
		// ---> Invalid Selector Exception
		Select s1 = new Select(driver.findElement(By.name("UserTitle")));
		s1.selectByIndex(7);
		driver.findElement(By.name("CompanyName")).sendKeys("Volante");
		Select s2 = new Select(driver.findElement(By.name("CompanyEmployees")));
		s2.selectByIndex(5);
		driver.findElement(By.xpath("//div[contains(@class,'phoneInput')]//input")).sendKeys("9876543210");
		Select s3 = new Select(driver.findElement(By.name("CompanyCountry")));
		
		s3.selectByVisibleText("Ayerbaijan");
		// driver.findElement(By.xpath("//div[@class='checkboxInput
		// section']//div/div")).click(); --->ElementClickInterceptedException (portion is not clickable)
		driver.findElement(By.className("checkbox-ui")).click(); //doubt
		
		//driver.findElement(By.xpath("//div[contains(@class,'checkboxInput')]//div/div")).click();
		
	}

}

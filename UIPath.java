package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIPath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[contains(@class,'form-group')]//input")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//div[contains(@class,'form-group')][3]/preceding::input[1]")).sendKeys("leaf@12");
		driver.findElement(By.xpath("(//button[contains(text(),Login)])[2]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		Thread.sleep(10000);
		System.out.println(driver.findElement(By.id("email")).getAttribute("class"));
		driver.close();
		
	}

}

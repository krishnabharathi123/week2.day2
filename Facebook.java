package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Kavitha");
		driver.findElement(By.name("lastname")).sendKeys("ravi");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.id("password_step_input")).sendKeys("Bhar@0619");
		Select date=new Select(driver.findElement(By.name("birthday_day")));
		date.selectByValue("6");
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByIndex(7);
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("2000");
		driver.findElement(By.xpath("//span[@data-name='gender_wrapper']//input")).click();
		//driver.close();
	}

}

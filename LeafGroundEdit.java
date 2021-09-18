package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.xpath("//label[text()='Enter your email address']/following::input"))
				.sendKeys("krishna@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("values added", Keys.TAB);
		System.out.println(
				driver.findElement(By.xpath("//label[text()='Get default text entered']/following::input")).getAttribute("value"));
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		System.out.println(
				driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following::input"))
						.isEnabled());
	}

}

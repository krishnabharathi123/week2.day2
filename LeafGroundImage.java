package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundImage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img"))
				.click();

	}

}

package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.findElement(By.partialLinkText("without")).getAttribute("href"));
		driver.findElement(By.partialLinkText("broken")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.xpath("//a[@href='pages/Link.html']")).click();

	}

}

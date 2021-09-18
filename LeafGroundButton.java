package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.id("home")).click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		Point location = driver.findElement(By.id("position")).getLocation();
		System.out.println("Location is " + location);
		String cssValue = driver.findElement(By.xpath("//button[@style='background-color:lightgreen']")).getCssValue("background-color");
		System.out.println("colour is " + cssValue);
		Dimension size = driver.findElement(By.xpath("//button[text()='What is my size?']")).getSize();
		System.out.println("Dimension is "+size);
		
	}

}

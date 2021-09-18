package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGrounfCheckBox {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("//div[@class='example']/div/input")).click();
		System.out.println(driver.findElement(By.xpath("(//div[@class='example'])[2]/div/input")).isSelected());
		driver.findElement(By.xpath("(//div[@class='example'])[3]/div[2]/input")).click();
		for(int i=1;i<=5;i++) {
			driver.findElement(By.xpath("(//div[@class='example'])[last()]/div["+i+"]/input")).click();
		}
	}

}

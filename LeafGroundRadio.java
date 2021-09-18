package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundRadio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.findElement(By.xpath("//div[@id='first']//input")).click();
		boolean cBox1 = driver.findElement(By.xpath("//label[text()='Find default selected radio button']/following::label[1]/input")).isSelected();
		System.out.println("Checkbox 1 is "+cBox1);
		boolean cBox2 = driver.findElement(By.xpath("//label[text()='Find default selected radio button']/following::label[2]/input")).isSelected();
		System.out.println("Checkbox 2 is "+cBox2);
		WebElement cBox3=driver.findElement(By.xpath("(//label[@for='java'])[3]/following-sibling::input[1]"));
		String value=cBox3.getAttribute("value");
		if(value.equals("1")) {
			System.out.println("My age group is already selected");
		}
		else {
			cBox3.click();
		}
	}

}

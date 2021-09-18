package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		Select d1=new Select(driver.findElement(By.id("dropdown1")));
		d1.selectByIndex(2);
		Select d2=new Select(driver.findElement(By.name("dropdown2")));
		d2.selectByVisibleText("Loadrunner");
		Select d3=new Select(driver.findElement(By.id("dropdown3")));
		d3.selectByValue("3");
		Select d4=new Select(driver.findElement(By.xpath("//select[@class='dropdown']")));
		List<WebElement> options = d4.getOptions();
		System.out.println(options.size());
		WebElement d5=driver.findElement(By.xpath("//div[@class='example'][last()-1]/select"));
		/*
		 * Select s5=new Select(d5); s5.selectByIndex(2);
		 */
		d5.click();
		d5.sendKeys("App");
		d5.click();
		WebElement d6=driver.findElement(By.xpath("//div[@class='example'][last()]/select"));
		Select s6=new Select(d6);
		s6.selectByIndex(2);

	}

}

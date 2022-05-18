package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.leafground.com/pages/checkbox.html");
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		
		
		driver.close();
	}

}

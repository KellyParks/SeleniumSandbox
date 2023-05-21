package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
	
	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}

	public static void googleSearch() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Cats with sunglasses");
		element.submit();
		
		Thread.sleep(3000);
		
		driver.close();
		System.out.println("Test Completed");
	}
}

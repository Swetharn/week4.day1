package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		WebElement elementTable = driver.findElement(By.xpath("//table"));
		List<WebElement> rows = elementTable.findElements(By.tagName("tr"));
		int size = rows.size();
		System.out.println("The count of the Row is " + size);
		List<WebElement> cols = rows.get(1).findElements(By.tagName("td"));
		System.out.println("The count of the Column is " + cols.size());
		for (int i = 0; i < rows.size(); i++) {
			if (rows.get(i).getText().contains("Learn to interact with Elements")) {
				System.out.println("The progress values of:: " + rows.get(i).getText());
			}
		}
		driver.findElement(By.xpath("(//input[@name='vital'])[5]")).click();
		driver.quit();
	}

}

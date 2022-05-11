package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='render']"));
		List<WebElement> rowElements = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < rowElements.size(); i++) {
			if (i <= 2) {
				List<WebElement> columElements = rowElements.get(i).findElements(By.tagName("td"));
				for (int j = 0; j < columElements.size(); j++) {

					System.out.println("Column:" + columElements.get(j).getText());
				}
			}
		}
	}
}

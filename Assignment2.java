package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		System.out.println("The no of Rows:: "+rows.size());
		List<WebElement> cols = driver.findElements(By.tagName("td"));
		System.out.println("The no of Columns:: "+cols.size());
		driver.quit();
	}

}

package week4.day1;

import java.sql.DriverManager;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("//a[contains(text(),'NSE Bulk Deals') and @class='ch-bar-item ch-button']"))
				.click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-striped']"));
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++) {
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++) {
				if (j == 2) {
					System.out.println("The Securities Name List:: " + cols.get(j).getText());
					continue;
				}
			}
		}
		driver.quit();
	}

}

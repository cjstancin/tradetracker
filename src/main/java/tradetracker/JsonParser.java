package tradetracker;

import org.openqa.selenium.chrome.ChromeOptions;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsonParser {
		    
	public static void main(String[] args) {
		String url = "https://www.capitoltrades.com/trades?per_page=96&assetType=stock";
		System.setProperty("webdriver.chrome.driver","C:/Users/stanc/Documents/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless","--user-agent=Chrome/5.0"); 
 
		ChromeDriver driver = new ChromeDriver(options); 
 
		// connecting to the target web page 
		driver.get(url); 
		List<WebElement> elements = driver.findElements(By.className("q-tr"));
		List<String> holder = new LinkedList<String>();
//		for (int i = 0; i < elements.size(); i++) {
//			System.out.println(elements.get(i).getText());
//		}
		for (int j = 1; j < 2; j++) {
			holder.add(elements.get(j).getText());
		}
		String test[] = holder.get(0).split("\n");
		for (String line : test) {
			System.out.println(line);
			System.out.println("-------");
		}
		Trade trade = new Trade();
		trade.setname(test[0]);
		System.out.println(trade.getname());
//		for (int i = 0; i < holder.size(); i++) {
//			System.out.println(holder.get(i));
//		}
		
	}
}

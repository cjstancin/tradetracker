package tradetracker;

import org.openqa.selenium.chrome.ChromeOptions;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsonParser {
		    
	public static void main(String[] args) {
		int count = 0;
		String url = "https://www.capitoltrades.com/trades?per_page=96&assetType=stock";
		System.setProperty("webdriver.chrome.driver","C:/Users/stanc/Documents/chromedriver.exe");
		
		//sets up options for chrome driver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless","--user-agent=Chrome/5.0"); 
		ChromeDriver driver = new ChromeDriver(options); 
		
		// connecting to the target web page 
		driver.get(url); 
		
		List<WebElement> elements = driver.findElements(By.className("q-tr"));
		List<String> holder = new LinkedList<String>();
		
		//loops through list of elements with q-tr to find each trade
		for (int i = 1; i < elements.size(); i++) {
			holder.add(elements.get(i).getText());
			String test[] = holder.get(count).split("\n");
			
			//create trade object and assign stuff from elements
			Trade trade = new Trade();
			trade.setOwner(test[0]);
			trade.setState(test[1].substring(test[1].length()-2));
			trade.setParty(test[1].substring(0, test[1].length()-7));
			trade.setName(test[2]);
			trade.setTicker(test[3].substring(0, test[3].length()-3));
			trade.setDisclosureDate(test[5] + " " + test[4]);
			trade.setTransactionDate(test[7] + " " + test[6]);
			trade.setType(test[10]);
			trade.setAmount(test[11].replaceAll("[^a-zA-Z0-9]+","-"));
			
			
			//checking if setters works
			System.out.println("---------------");
			System.out.println(trade.getOwner());
			System.out.println(trade.getState());
			System.out.println(trade.getParty());
			System.out.println(trade.getName());
			System.out.println(trade.getTicker());
			System.out.println(trade.getDisclosureDate());
			System.out.println(trade.getTransactionDate());
			System.out.println(trade.getType());
			System.out.println(trade.getAmount());
			
			count++;
			
//			for (String line : test) {
//				System.out.println(line);
//				System.out.println("-------");
//			}
		}
//		for (int i = 0; i < holder.size(); i++) {
//			System.out.println(holder.get(i));
//		}
		
	}
}

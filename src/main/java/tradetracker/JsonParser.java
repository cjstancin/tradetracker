package tradetracker;

import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.*; 

public class JsonParser {
		    
	public static void main(String[] args) throws InterruptedException {
		int count = 0;
		String url = "https://www.capitoltrades.com/trades?per_page=96&assetType=stock";
		System.setProperty("webdriver.chrome.driver","C:/Users/stanc/Documents/chromedriver.exe");
		
		//sets up options for chrome driver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless","--user-agent=Chrome/5.0"); 
		ChromeDriver driver = new ChromeDriver(options); 
		
		List<String> holder = new LinkedList<String>();
		
		//creates a linked list with all the state abreviations
		Map<String, List<Trade>> map = new HashMap<>();
		List<String> states = new LinkedList<String>();
		File[] files = new File("states").listFiles();
		
		
		for (File file : files) {
		    if (file.isFile()) {
		        states.add(file.getName().substring(0,2));
		    }
		    map.put(file.getName().substring(0,2), new LinkedList<>());
		}
		
		for (int c = 1; c < 5; c++) {
			String newUrl = url + "&page=" + String.valueOf(c);
			System.out.println(newUrl);
			driver.get(newUrl);
			TimeUnit.SECONDS.sleep(2);
				
			List<WebElement> elements = driver.findElements(By.className("q-tr"));	
			
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
				
				if (map.containsKey(trade.getState())) {
				    map.get(trade.getState()).add(trade);
				}
				//checking if setters works
	//			System.out.println("---------------");
	//			System.out.println(trade.getOwner());
	//			System.out.println(trade.getState());
	//			System.out.println(trade.getParty());
	//			System.out.println(trade.getName());
	//			System.out.println(trade.getTicker());
	//			System.out.println(trade.getDisclosureDate());
	//			System.out.println(trade.getTransactionDate());
	//			System.out.println(trade.getType());
	//			System.out.println(trade.getAmount());
				
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
		System.out.println(map);
	}
	
	
}

package coderbyte;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coderbyteassement {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jahnvi\\eclipse-workspace\\inetbanking\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/"); 
		driver.manage().window().maximize();
		WebElement searchbox=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchbox.sendKeys("COVID-19");
		searchbox.sendKeys(Keys.ENTER);
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='fhQnRd']/div/g-inner-card/div/a/div/div[2]/div/g-img/img[contains(@id,'dimg_')]"));
		int agency_count= ele.size();
		System.out.println("Count of agency with duplicates are:" +agency_count);
		Set<String> hset = new HashSet<>();
		System.out.println("Name of news agency with duplicates are:");
		for(int i=0;i<agency_count;i++)
		{
			System.out.println(ele.get(i).getAttribute("alt"));
		}
		for(int i=0;i<agency_count;i++)
		{
			hset.add(ele.get(i).getAttribute("alt"));
		}
		if(hset.size()<3)
		{
			System.out.println("Missing Leading News Agencies");
		}
		else
		{
			System.out.println("Unique News agencies are:");
		for(String y: hset)
		{
			System.out.println(y);
		}
		}
		
		
	
		

	}

}



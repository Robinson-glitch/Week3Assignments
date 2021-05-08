package Week3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
	
		
		driver.findElement(By.id("txtStationFrom")).clear();
		
		driver.findElement(By.id("txtStationFrom")).sendKeys("MSB");
		
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("txtStationTo")).clear();
	
		driver.findElement(By.id("txtStationTo")).sendKeys("BCT");
		
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.TAB);
		
	    Thread.sleep(2000);		
	    
List<WebElement> Trainlist = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]//td[2]"));
		
		System.out.println("Total number of trains"+Trainlist.size());
		
		List<String> Trains=new ArrayList<String>();
		
		for(int i=0;i<Trainlist.size();i++)
		{
			Trains.add(Trainlist.get(i).getText());
			
		}
		System.out.println("Total number of trains"+Trains.size());
	}

}

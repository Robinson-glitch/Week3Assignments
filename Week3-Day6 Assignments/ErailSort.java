package Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

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
		
	
		
		List<WebElement> Trainlist = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]//td[2]"));
		
		System.out.println("Total number of trains"+Trainlist.size());
	

		List<String> Trainnames=new ArrayList<String>();
	
		
		for(int i=0;i<Trainlist.size();i++) {
		   
			
			Trainnames.add(Trainlist.get(i).getText());
			
		}
			
			Collections.sort(Trainnames);		
			System.out.println(Trainnames);
			
		}

	
			
			
		
	   }

	
	



package Week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MapInSelenium {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://erail.in/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			driver.findElement(By.id("txtStationFrom")).clear();
			
			driver.findElement(By.id("txtStationFrom")).sendKeys("MSB");
			
			driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.TAB);
			
			driver.findElement(By.id("txtStationTo")).clear();
		
			driver.findElement(By.id("txtStationTo")).sendKeys("BCT");
			
			driver.findElement(By.id("txtStationTo")).sendKeys(Keys.TAB);
			
			driver.findElement(By.id("chkSelectDateOnly")).click();
			
			Map<String ,Integer> map= new TreeMap<String,Integer>();
			
			
	
			List<WebElement> Trainlist = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]//td[2]"));
			System.out.println("Train count: " + Trainlist.size());
			
			// Thread.sleep(2000);

			List<String> all_elements_text=new ArrayList<String>();
		
			
				for (int i = 0; i <Trainlist.size(); i++) {
				
					all_elements_text.add(Trainlist.get(i).getText());
					
				//	System.out.println(all_elements_text.get(i));
		
				
				if(all_elements_text.get(i).startsWith("N")){
					
					map.put(all_elements_text.get(i),1);
					
					System.out.println(map);					
					
				}}}}
				

		
	
	




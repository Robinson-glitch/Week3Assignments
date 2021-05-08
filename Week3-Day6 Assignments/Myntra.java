package Week3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Actions a = new Actions(driver);
	     a.moveToElement(driver.findElement(By.xpath("//a[@data-reactid='179']"))).build().perform();
	    
	  Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//a[@data-reactid='233']")).click();
	     
	     int size = driver.findElements(By.xpath("//div[@class='product-thumbShim']")).size();
	     System.out.println("The number of Product present is"+size);
	     
	    int size2= driver.findElements(By.xpath("//ul[@class='categories-list']//label[@class='common-customCheckbox vertical-filters-label']")).size();
	     System.out.println("The number of categries is"+size2);
	     
	   String jackets = driver.findElement(By.xpath("//label[text()='Jackets']")).getText();
			String result1  = jackets.replaceAll("[0-9]", "");
			String coats = driver.findElement(By.xpath("//label[text()='Coats']")).getText();
				String result2 = coats.replaceAll("[0-9]", "");
				int sumOfCategories = Integer.parseInt(result1) + Integer.parseInt(result2);
				
			System.out.println(result1 + " + " + result2 + " = " + sumOfCategories);
	     
	     
	     driver.findElement(By.xpath("(//ul[@class='categories-list']//label[@class='common-customCheckbox vertical-filters-label'])[2]")).click();
		
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[@calss='brand-more']")).click();
	     
	     
	     
	     driver.findElement(By.xpath("//div[@class='FilterDirectory-searchInput']")).sendKeys("Mango");
	     
	     driver.findElement(By.xpath("//label[@class='common-customCheckbox']/div")).click();
	     
	  driver.findElement(By.xpath("//span[@class='myntraweb-sprite filter-summary-removeIcon sprites-remove']"));
	  
	int size3= driver.findElements(By.xpath("//h3[@class='product-brand']")).size();
	System.out.println("The number of Mango brands"+size3);
	
	String filterMango = driver.findElement(By.xpath("(//div[@class='filter-summary-filter'])[2]")).getText();
	
	if (filterMango.equalsIgnoreCase("MANGO")) {
		System.out.println("All the coats are belongs to MANGO brand");
	} else {
		System.out.println("Need to check");
	}


	WebElement sortBy = driver.findElement(By.className("sort-sortBy"));
	WebElement betterDiscount = driver.findElement(By.xpath("//label[text()='Better Discount']"));
	actions.moveToElement(sortBy).moveToElement(betterDiscount).click().perform();
	System.out.println("Sorted to Better Discount");
	Thread.sleep(2000);

	String firstDisplayedPrice = driver.findElement(By.xpath("(//div[@class='product-price']//span)[2]")).getText();
	System.out.println("Cost of first displayed item: " + firstDisplayedPrice);


	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,100)");
	
	Thread.sleep(3000);


	WebElement firstDisplayeditem = driver.findElement(By.xpath("(//div[@class='product-price']//span)[2]"));


	WebElement wishList = driver
			.findElement(By.xpath("//span[contains(@class,'product-wishlistFlex product-actionsButton')]"));
	actions.moveToElement(firstDisplayeditem).moveToElement(wishList).click().perform();
	Thread.sleep(2000);
	System.out.println(" Task Completed");


	driver.close();

}

}}
	
	}


	}



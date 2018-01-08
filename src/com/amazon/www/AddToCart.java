package com.amazon.www;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddToCart {
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=googinhydmabk-21&ref_=pd_mn_ABKror78");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement element=driver.findElementById("nav-link-shopall");
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();
		
		  WebElement element1=driver.findElementByXPath("//span[text()='Home, Kitchen, Pets']");
		  act.moveToElement(element1).build().perform();
		  
		 WebElement element2= driver.findElementByXPath("//span[text()='Fine Art']");
		  act.moveToElement(element2).build().perform();
		  
		 driver.findElementByXPath("//span[text()='Fine Art']").click();//to click on the particular element(fine art)
		 driver.findElementByXPath("//img[@src='https://images-eu.ssl-images-amazon.com/images/I/510N-gq1uhL._AC_US160_FMwebp_QL70_.jpg']").click();
		 
		 //window handles
		 Set<String> allWindows = driver.getWindowHandles();
//		 System.out.println(allWindows.size());
		 ArrayList<String> allHandles = new ArrayList<String>(); 
		 allHandles.addAll(allWindows);
//		 String secondWindow = allHandles.get(1);
		 driver.switchTo().window(allHandles.get(1));
		 driver.switchTo().defaultContent();
		 
		 driver.findElementByXPath("//input[@id='add-to-cart-button']").click();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		  
		  
		
		
		
		
		
		
		
		
		
		
	}
		
	}



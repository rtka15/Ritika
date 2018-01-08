package First1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ForUrl {
	
	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
//    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    
    driver.get("https://www.swiggy.com/");
    System.out.println("successfully open");
    driver.findElementByXPath("//a[text()='Login']").click();
    Thread.sleep(2000);
    driver.findElementByXPath("//button[@class='btn btn-warning']").click();
    Thread.sleep(10000);
    System.out.println("click on signup");
    
    driver.findElementById("fullnameField").sendKeys("Shweta");
    Thread.sleep(5000);
    driver.findElement(By.id("emailField")).sendKeys("shwetstylo53@gmail.com");
    Thread.sleep(5000);
    driver.findElementById("phoneNumberField").click();
    Thread.sleep(3000);
    driver.findElementById("phoneNumberField").sendKeys("8873982388");
    Thread.sleep(5000);
    driver.findElementById("passwordField").sendKeys("Shweta");
    Thread.sleep(5000);
    driver.findElementByName("blankbox icon-swgy-done visible").click();
    Thread.sleep(5000);
    driver.findElementByName("btn btn-success").click();
    
    
    
	}

}

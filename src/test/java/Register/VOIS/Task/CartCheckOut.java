package Register.VOIS.Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartCheckOut {

	public static void main(String[] args) {
		
		String ChromePath = System.getProperty("user.dir")+"\\Resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
			ChromeDriver driver= new ChromeDriver();
			
			//navigate to URL
			  driver.navigate().to("http://automationpractice.com/index.php");
			  driver.manage().window().maximize();
			 
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			 jsExecutor.executeScript("document.querySelector('#homefeatured > li:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > a:nth-child(1)').click()");
			  
			 WebElement foo = new WebDriverWait(driver, Duration.ofSeconds(3))
			          .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".button-medium > span:nth-child(1)")));
			 //JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			 jsExecutor.executeScript("document.querySelector('.button-medium > span:nth-child(1)').click()");
			  
			 // driver.findElement(By.cssSelector("#homefeatured > li:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > a:nth-child(1) > span:nth-child(1)")).click();
			 //driver.findElement(By.cssSelector("a.btn.btn-default.button.button-medium > span")).click();
			    driver.findElement(By.cssSelector("a.button.btn.btn-default.standard-checkout.button-medium > span")).click();
			    driver.findElement(By.id("email")).click();
			    driver.findElement(By.id("email")).clear();
			    driver.findElement(By.id("email")).sendKeys("abdaullah.wataney@gmail.com");
			    driver.findElement(By.id("passwd")).click();
			    driver.findElement(By.id("passwd")).clear();
			    driver.findElement(By.id("passwd")).sendKeys("Asd@12345");
			    driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
			    driver.findElement(By.cssSelector("button[name=\"processAddress\"] > span")).click();
			    driver.findElement(By.id("cgv")).click();
			    driver.findElement(By.cssSelector("button[name=\"processCarrier\"] > span")).click();
			    driver.findElement(By.cssSelector("a.cheque > span")).click();
			    driver.findElement(By.cssSelector("button.button.btn.btn-default.button-medium > span")).click();
	}

}

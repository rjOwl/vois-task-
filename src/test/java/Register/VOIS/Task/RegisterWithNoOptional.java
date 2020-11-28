package Register.VOIS.Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterWithNoOptional {

	public static void main(String[] args) {
		String ChromePath = System.getProperty("user.dir")+"\\Resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
			ChromeDriver driver= new ChromeDriver();
			
			//navigate to URL
			  driver.navigate().to("http://automationpractice.com/index.php");
			  driver.manage().window().maximize();
			  driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();


			  
			  driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("abdh.wata@gmail.com");
			  driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();
			  
			  WebElement foo = new WebDriverWait(driver, Duration.ofSeconds(3))
			          .until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_firstname")));

			
			  							
			  driver.findElement(By.id("customer_firstname")).sendKeys("Abdullah");
			 driver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("Wataney");
			 driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("Asd@12345");
			 
			 driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("Giza");
			 driver.findElement(By.xpath("//*[@id='address2']")).sendKeys("Smart");
			 driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Cairo");
			 
			 
			 Select State = new Select(driver.findElement(By.xpath("//*[@id='id_state']")));
			  State.selectByVisibleText("Florida");
			  
			  driver.findElement(By.xpath("//*[@id='postcode']")).sendKeys("12345");
			  
			  Select Country = new Select(driver.findElement(By.xpath("//*[@id='id_country']")));
			  Country.selectByVisibleText("United States");
			  
			  driver.findElement(By.xpath("//*[@id='phone_mobile']")).sendKeys("250250250");
			  driver.findElement(By.xpath("//*[@id='alias']")).sendKeys("None");
			  
			  driver.findElement(By.id("submitAccount")).click();
				System.out.println("Test case result: Pass!"); 

	}

}

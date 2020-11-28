package Register.VOIS.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithData {

	public static void main(String[] args) {
		String ChromePath = System.getProperty("user.dir")+"\\Resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		ChromeDriver driver= new ChromeDriver();

		//navigate to URL
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		  
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abdaullah.wataney@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("Asd@12345");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")).click();
		  
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")).click();
		  
		System.out.println("Test case: Pass!"); 
	}

}

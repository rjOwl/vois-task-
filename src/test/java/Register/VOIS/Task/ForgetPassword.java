package Register.VOIS.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgetPassword {

	public static void main(String[] args) {
		String ChromePath = System.getProperty("user.dir")+"\\Resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		ChromeDriver driver= new ChromeDriver();
			
		//navigate to URL
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();

		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("abdaullah.wataney@gmail.com");
		driver.findElement(By.cssSelector("button.btn.btn-default.button.button-medium > span")).click();
		System.out.println("Test case result: Pass!"); 
	}
}

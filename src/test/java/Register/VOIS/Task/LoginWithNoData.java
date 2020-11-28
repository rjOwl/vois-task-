package Register.VOIS.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithNoData {

	public static void main(String[] args) {
		String ChromePath = System.getProperty("user.dir")+"\\Resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
			ChromeDriver driver= new ChromeDriver();
			
			//navigate to URL
			  driver.navigate().to("http://automationpractice.com/index.php");
			  driver.manage().window().maximize();
			  driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
			  
			  driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
			    driver.findElement(By.cssSelector("ol > li")).click();
			    driver.findElement(By.cssSelector("ol > li")).click();
			    if(driver.findElements( By.id("center_column") ).size() != 0) {
			    	System.out.println(driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li/text()")));		    	
			    }

	}

}

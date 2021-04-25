import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class clearTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\KOVID\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		
		  driver.manage().deleteAllCookies(); driver.navigate().refresh();
		 
		
		Thread.sleep(6000);
		//driver.switchTo().alert().dismiss();
		driver.manage().window().maximize();
		
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("#FromTag")).sendKeys("Goa ");
		Thread.sleep(3000);
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='list'] a"));
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("Goa, IN - Dabolim Airport (GOI)"))
			{
				option.click();
				break;
			}
		}
		
		driver.findElement(By.cssSelector("#DepartDate")).click();
		driver.findElement(By.cssSelector("a[class*='ui-state-active']")).click();
		
		WebElement child=driver.findElement(By.cssSelector("select[name='childs']"));
		Select c=new Select(child);
		c.selectByVisibleText("2");
		
		WebElement infant=driver.findElement(By.cssSelector("select[name='infants']"));
		Select d=new Select(infant);
		d.selectByVisibleText("1");
		
		driver.findElement(By.cssSelector("#MoreOptionsLink")).click();
		
		
		WebElement flighttype=driver.findElement(By.cssSelector("#Class"));
		Select h=new Select(flighttype);
		h.selectByVisibleText("First");
		
		driver.findElement(By.cssSelector("#AirlineAutocomplete")).sendKeys("Indigo");
		
		driver.findElement(By.cssSelector("#SearchBtn")).click();
		
		
		System.out.println(driver.findElement(By.cssSelector("#homeErrorMessage")).getText());
		
		Thread.sleep(8000);
		driver.close();

	}

}

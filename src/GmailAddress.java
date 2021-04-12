import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.quit(); 
		
		driver.close();
		///ddhfguervevbjvvv
		

	}

}

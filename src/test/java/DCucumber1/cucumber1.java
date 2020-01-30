package DCucumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class cucumber1 {
	WebDriver driver;
	@Given("user enters the chrome webiste")
	public void user_enters_the_chrome_webiste() {
		System.out.println("user open Chrome browser and enters Registration page");
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.30\\Desktop\\Sel-Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
	}

	@Given("user navigates to Testme app")
	public void user_navigates_to_Testme_app() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@Given("user clicks on signin")
	public void user_clicks_on_signin() {
		driver.findElement(By.linkText("SignIn")).click();
	    	}

	@Given("user enters username as {string} in un field")
	public void user_enters_username_as_in_un_field(String un) {
		driver.findElement(By.name("userName")).sendKeys(un);	
	}

	@Given("user enters password as {string} in pd field")
	public void user_enters_password_as_in_pd_field(String pd) {
		driver.findElement(By.name("password")).sendKeys(pd);
	}

	@Given("clicks on Login button")
	public void clicks_on_Login_button() {
		 driver.findElement(By.name("Login")).click();
	}

}

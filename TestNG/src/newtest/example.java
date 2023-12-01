package newtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example {
	
// webdriver driver=new ChromeDriver();
public WebDriver driver;

@BeforeClass
public void setup()
{
System.out.println("1");
System.setProperty("Webdriver.firefox.driver","D:\\NEW SELENIUM\\geckodriver.exe");
driver=new FirefoxDriver();
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
}

@BeforeMethod
public void launchapp()
{
	System.out.println("2");
	driver.navigate().to("https://www.amazon.in/");
}

@Test
public void search_product() {
	driver.findElement(By.name("field-keywords")).sendKeys("formal wear");
	driver.findElement(By.id("nav-search-submit-button")).click();
}

@Test
public void bestseller() {
	System.out.println("3");
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
	
}
}



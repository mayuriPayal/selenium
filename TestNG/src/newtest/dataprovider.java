package newtest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class dataprovider {
  @Test(dataProvider = "searchprovider")
  public void f(String author) 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\NEW SELENIUM\\chromedriver.exe");
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://www.google.com/");
		ch.manage().window().maximize();
	  ch.findElement(By.name("q")).sendKeys("Guru99");
	  ch.findElement(By.name("btnK")).click();
	  
  }

  @DataProvider(name="searchprovider")
  public Object[][] dp() {
    return new Object[][] {
          new Object[] {"Guru99" },
    };
  }
}
   
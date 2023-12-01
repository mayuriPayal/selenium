package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\NEW SELENIUM\\chromedriver.exe");
		ChromeDriver ch=new ChromeDriver();
       ch.get("https://www.orangehrm.com/en/contact-sales/");
       ch.manage().window().maximize();
       Select obj=new Select(ch.findElement(By.name("Country")));
       obj.selectByVisibleText("India");
       Select obj1=new Select(ch.findElement(By.name("NoOfEmployees")));
       obj1.selectByIndex(4);
	}

}

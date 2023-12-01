package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selectors {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\NEW SELENIUM\\chromedriver.exe");
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://www.orangehrm.com/en/contact-sales/");
		ch.manage().window().maximize();
		ch.findElement(By.cssSelector("#Form_getForm_Contact")).sendKeys("7620254560");
		ch.findElement(By.cssSelector("#Form_getForm_Email")).sendKeys("mayurisatpute9@gmail.com");
	}

}

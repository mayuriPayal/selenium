package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\NEW SELENIUM\\chromedriver.exe");
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://www.orangehrm.com/en/contact-sales/");
		ch.manage().window().maximize();
		ch.findElement(By.xpath("//input[@id='Form_getForm_JobTitle']")).sendKeys("qa");
		ch.findElement(By.xpath("//input[@id='Form_getForm_FullName']")).sendKeys("mayuri");

	}

}

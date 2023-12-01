package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\NEW SELENIUM\\chromedriver.exe");
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://demoqa.com/radio-button");
		ch.manage().window().maximize();
		WebElement rd=ch.findElement(By.xpath("//label[contains(text(),'Impressive')]"));
		rd.click();
	}

}

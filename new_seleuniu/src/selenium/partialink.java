package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\NEW SELENIUM\\chromedriver.exe");
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://demo.guru99.com/test/block.html");
		ch.manage().window().maximize();
       ch.findElement(By.partialLinkText("Inside")).click();
       ch.navigate().back();
       ch.findElement(By.partialLinkText("outside")).click();
	}

}

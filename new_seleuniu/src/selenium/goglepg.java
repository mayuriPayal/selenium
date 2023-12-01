package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class goglepg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\NEW SELENIUM\\chromedriver.exe");
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://www.google.com/");
		ch.manage().window().maximize();
		ch.findElement(By.name("q")).sendKeys("mindscript");
        ch.findElement(By.name("btnK")).click();
	}

}

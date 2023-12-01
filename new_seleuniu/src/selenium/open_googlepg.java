package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class open_googlepg {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","D:\\NEW SELENIUM\\chromedriver.exe");
     ChromeDriver ch=new ChromeDriver();
     ch.get("https://www.orangehrm.com/en/contact-sales/");
     ch.manage().window().maximize();
     ch.findElement(By.name("FullName")).sendKeys("shashank");
     ch.findElement(By.name("Contact")).sendKeys("7620254565");
     ch.findElement(By.name("Email")).sendKeys("mayurisatpute@gmail.com");
     Select rd=new Select(ch.findElement(By.xpath("//select[@id='Form_getForm_NoOfEmployees']")));
     rd.selectByIndex(4);
     Select obj=new Select(ch.findElement(By.xpath("//select[@id='Form_getForm_Country']")));
     obj.selectByVisibleText("India");
  /*  WebElement wb=ch.findElement(By.linkText("recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox recaptcha-checkbox-checked"));
     wb.click();*/


	}

}

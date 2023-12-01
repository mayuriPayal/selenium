package newtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation {
	
	@BeforeSuite
	  public void one() {
		System.out.println("one");
	}
	@BeforeTest
	public void two() {
		System.out.println("two");
	}
	@BeforeClass
	public void three() {
		System.out.println("three");
	}
@BeforeMethod
public void four() {
	System.out.println("four");
}
  @Test
  public void f() {
	  System.out.println("five");
  }
  @AfterMethod
  public void six() {
		System.out.println("six");
	}
  @AfterClass
  public void seven() {
		System.out.println("seven");
	}
   @AfterTest
   public void eight() {
		System.out.println("eight");
	}
   @AfterSuite
   public void nine() {
		System.out.println("nine");
	}
}


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

public class annotation1 {
  @Test
  public void test1() {
	  System.out.println("test case 1");
  }
  @Test
  public void test2() {
	  System.out.println("test case 2");
  }
  @BeforeMethod
  public void BeforeMethod() {
	  System.out.println("Before Method");
  }
  @AfterMethod
  public void AfterMethod() {
	  System.out.println("AFTEER Method");
  }
  
  @BeforeClass
  public void BeforeClass() {
	  System.out.println("BEFORE CLASS");
	 
  }
  @AfterClass
  public void Afterclass() {
	  System.out.println("AFTEER class");
	 
  }
  @BeforeTest
  public void BeforeTest() {
	  System.out.println("BeforeTest");
  }
  @AfterTest
  public void Aftertest() {
	  System.out.println("AFTEER test");
	  }
  
  @BeforeSuite
  public void BeforeSuite() {
	  System.out.println("Before Suite");
	 
  }
  
@AfterSuite

public void AfterSuite() {
	  System.out.println("After Suitee");
	 
}
 
  
  
  
  
  
  
}


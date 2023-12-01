package newtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterMethod;
public class Annotations {
	  @Test
	  public void testcase1() {
		  System.out.println("in testcasee 1");
	  }
	
	  @Test
	  public void testcase2() {
		  
		  System.out.println("in testcasee 2");
		  }
	  
	  @BeforeMethod

	  public void BeforeMethod() {
		  System.out.println("in BeforeMethod ");
		  } 
	  
	  @BeforeClass
	  public void BeforeClass() {
		  System.out.println("in BeforeClass ");
	  }
	  
	  @AfterClass
	  public void AfterClass() {
		  System.out.println("in AfterClass ");
  
	  }
	  @BeforeTest
	  public void BeforeTest() {
		  System.out.println("in BeforeTest ");
 }
	  
	  @AfterTest
	  
	  public void AfterTest() {
		  System.out.println("in AfterTest ");
	  }
	  
	  @BeforeSuite
	  
	  public void BeforeSuite() {
		  System.out.println("in BeforeSuite ");
	  }
	  
	  
 @AfterSuite
	  
	  public void AfterSuite() {
		  System.out.println("in AfterSuite ");
	  }
	   
 @AfterMethod
 
 public void AfterMethod() {
	  System.out.println("in AfterMethod ");
 }  
	  
	  
	  
	  }
	  
	  



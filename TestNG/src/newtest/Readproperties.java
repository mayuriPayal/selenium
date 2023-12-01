package newtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Readproperties {
  @Test
  public void f() throws IOException 
  {
	// to read the file
	  FileInputStream fs=new FileInputStream("D:\\NEW SELENIUM\\TestNG\\newproprties");
	  Properties p =new Properties();
	  p.load(fs);
	  System.out.println(p.getProperty("Un"));
	  System.out.println(p.getProperty("pwd"));
	  
  }
}

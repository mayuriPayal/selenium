package newtest;

import org.testng.annotations.Test;

public class piority {
  @Test(priority=2)
  public void f() {
	  System.out.println("choco");
  }
  @Test(priority=1)
  public void g()
  {
	  System.out.println("biscute");
  }
  @Test(priority=1)
  public void h()
  {
	  System.out.println("coke");
  }
}

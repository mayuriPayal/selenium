package newtest;

import org.testng.annotations.Test;

public class enable {
  @Test(priority=1)
  public void registration() {
	  System.out.println("user registration");
  }
  @Test(priority=2,enabled=false)
  public void login()
  {
	  System.out.println("user login");
  }
  @Test(priority=3)
  public void logout()
  {
	  System.out.println("user logout");
  }
}

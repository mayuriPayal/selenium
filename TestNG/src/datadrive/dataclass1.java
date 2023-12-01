package datadrive;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class dataclass1 {
  @Test(dataProvider = "dp")
  public void f(int a, int b,int c) {
	  int sum=a+b+c;
	  System.out.println("add is="+sum);
	  int mul=a*b*c;
	  System.out.println("mil is="+ mul);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 7,5,3 },
    };
  }
}

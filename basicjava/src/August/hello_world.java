package August;

import java.util.Scanner;

public class hello_world {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no");
	int num= sc.nextInt();
	if(num==1)
	{
		System.out.println("monday");
	}
	else if(num==2)
	{
		System.out.println("tuewsda");
    }
	else if(num==3)
	{
		System.out.println("wed");
	}
	else
	{
		System.out.println("invalid");
	}
	}
}
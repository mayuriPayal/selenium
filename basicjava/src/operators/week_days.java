package operators;

import java.util.Scanner;

public class week_days {

	public static void main(String[] args) {
		Scanner bc=new Scanner(System.in);
		System.out.println("enter no");
        int week=bc.nextInt();
        
        if(week==1)
        {
        	System.out.println(" mon");
        }
        else   if (week==2)
        {
        	System.out.println("tue");
        }
        else if(week==3)
        {
        	System.out.println("wed");
   }
        else
        {
        	System.out.println("invalid");
        }
	}

}

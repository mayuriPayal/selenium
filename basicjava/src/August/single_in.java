package August;
class a{
	int a=23;
	int b=20;
	void add()
	{
		int c=a+b;
		System.out.println("add is="+c);
	}
}
class parent
{int a=23;
int b=20;
void mul()
	{
		int m=a*b;
		System.out.println("mul is ="+ m);
	}
}
public class single_in extends a
{
	void sub()
	{
		int d =a-b;
		System.out.println("sub is="+d);
	}
		public static void main(String[] args) {

		single_in obj=new single_in();
		obj.add();
		obj.sub();
		parent obj1=new parent();
		obj1.mul();
	}

}

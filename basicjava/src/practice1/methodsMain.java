package practice1;

 class methodsMain {
	 int x,y;
	 String str;
	 methodsMain (int a,int b,String s )	
		{
		 a=12;
			 y=b;
			str="str";
		}
		
	 void m1()
	 {
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(str);
	 }
	
	public static void main(String[] args) {

/*	methods1 obj=new methods1();
	obj.greeting();
		
//String str=obj.greeting1()	;
	//System.out.println(str);	
	
	
	System.out.println(obj.greeting1());
	
	obj.greeting2(2);
	
	obj.greeting3("aaaaaaaa");
	
	
	System.out.println(obj.greeting4("null"));*/
		methodsMain cd =new  methodsMain(1,2,"may");
		cd.m1();
		
		
	}

	
	
}

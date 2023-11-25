class Demo
{
	int a;
	int b;
	private static Demo objRef;
	
	private Demo()
	{
	}
	
	static Demo getDemoInstance(int x, int y)
	{
		if(objRef == null)
		{
			objRef = new Demo();
		}
		
		objRef.a = x;
		objRef.b = y;
		
		return objRef;
	}
	
	void myFun()
	{
		System.out.println("myFun of Demo");
	}
}

class SingletonDemo
{
	public static void main(String[]args)
	{
		Demo d = Demo.getDemoInstance(5,10);
		d.myFun();
		
		Demo d1 = Demo.getDemoInstance(15,20);
		d1.myFun();
	}
}
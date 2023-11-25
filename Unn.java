class Demo 
{
	public int iNo1;
	
	public double interest;
	
	{
		System.out.println("Inside Unnamed Block");
		
		interest = 2.5;
	}
	
	public Demo()
	{
		iNo1 = 0;
		
		System.out.println("Inside Default Constructor");
	}
	
	public Demo(int x)
	{
		iNo1 = x;
		System.out.println("Inside Parameterised Constructor");
	}
}

class Hello
{
	public static void main(String args[])
	{
		Demo obj1 = new Demo();
		
		Demo obj2 = new Demo(11);
		
	}
}

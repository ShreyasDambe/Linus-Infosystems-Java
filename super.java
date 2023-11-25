class Base
{

	public int i = 11;
	
	public Base(int x)	//public nahi lihil tar default consider karato
	{
		System.out.println("From Base Parameterised Constructor");
		
	}
	
	
	public void fun()
	{
			System.out.println("From Base fun");
			
			System.out.println(this.i);		//11
	}

}

class Derived extends Base
{
	public int x = 21;
	
	public Derived()			//:Base(11);
	{
		super(11);				
		System.out.println("From Derived Constructor");
	
	}
	
	public void gun()
	{
		System.out.println(super.i)			// 11
	
		System.out.println(this.x)			//21
		
		System.out.println(super.fun)		//3		//
	}
		
}

class Demo
{
	public static void main(String arr[])
	{
		//Derived dobj;				//Object Reference : Its going to refer to the object but curently its not refering anything because 
									// we not allocated memory yet of the object.
									
		Derived dobj = new Derived();		//At this point memory gets allocated inside heap and the refernce gets stored inside 												//dobj	
		
		dobj.gun();		
				
	}
	
}

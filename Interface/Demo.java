class Demo
{
	public static void main(String argc[])
	{
		SBI sobj = new SBI();
		BOI bobj = new BOI();
		
		System.out.println(sobj.fdIntrest());
		
		System.out.println(bobj.fdIntrest());
		
		
		//RBI rObj = new RBI();     //We cant create Object 
		
		RBI rObj;				//We can create Reference
		
		System.out.println(sobj.iAmount);			
		
		//sObj.iAmount++;					//It is by default... public : static : final
		
		System.out.println(RBI.iAmount);			//Public : We call from outside .....static : We cant call with object but by 
		//name
	}
} 

interface RBI
{
	int iAmount = 100000;
	
	/*
	public RBI()
	{					//We cant create constructor in interface
	}	
	*/
	
	double loanintrest();
	
	double fdIntrest();
}

class SBI implements RBI
{
	
	public double loanintrest()
	{
		System.out.println("Inside Loan Intrest");						//SBI
		return 8.5;
		
	}
	
	public double fdIntrest()
	{
		System.out.println("Inside FD Intrest");
		
		return 1.5;
	}
	 

}

class BOI implements RBI
{
	public double loanintrest()
	{
		System.out.println("Inside Loan Intrest");						//BOI
		return 7.5;
		
	}
	
	public double fdIntrest()
	{
		System.out.println("Inside FD Intrest");
		
		return 2.5;
	}
}


/*
In above example RBI is considered as a reference which is implemented by the SBI and BOI class.

This two classes implements all the abstract methods from the interface.

Imp - 
1.We cannot write constructor for the interface.
2.All the members of interface are by default public.
3.There is no need to use abstract keyword inside the interface.
4.One class can implements multiple intrfaces
5.Due to the multiple interface implementation there is no ambiguity because implementation of the 
  methods has to be provided by the class and class can define it only ones.
  
  
 * Abstract Class Vs. interface
 
1.Abstract class provides 0 to 100% abstraction.
1.Interface provides 100% abstraction.

2.Members of abstract class can be public private or protected.
2.All the members of interface are by default public.

3.Inside Abstract class we can write abstract or concreate methods.
3Inside interface all the methos are by default abstract.

4.Inside abstract class we can write a constructor.
4.Inside interface we cannot write constructor.

5.Multiple inheritance is not applicable with the abstract class.
5.Multiple inheritance is applicable with the interface.

6.Charactiristics of abstract class can be static non-static,final non-final.
6.Characteristics of interface are by default public static final and inisialised.
 

*/



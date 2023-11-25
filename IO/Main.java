import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Employee
{
   String Empname;
   int Empid;
   int Empage;
   
   Employee(String Empname, int Empage, int Empid)
   {
      this.Empname = Empname;
      this.Empage = Empage;
      this.Empid = Empid;
   }
   public void displayDetails()
   {
      System.out.println("Name: "+this.Empname);
      System.out.println("Age: "+this.Empage);
      System.out.println("Id: "+this.Empid);
   }
}

public class Main 
{
   	public static void main(String args[]) throws IOException 
   	{
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      
      System.out.println("Enter Your Name: ");
      String Ename = reader.readLine();
      
      System.out.println("Enter your age: ");
      int Eage = Integer.parseInt(reader.readLine());
      
      System.out.println("Enter your Id: ");
      int Eid = Integer.parseInt(reader.readLine());
      
      Employee std = new Employee(Ename, Eage, Eid);			//Parameterised Con Call
      std.displayDetails();
   }
}

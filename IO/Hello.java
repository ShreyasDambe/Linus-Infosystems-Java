import java.util.Scanner;

class Hello
{
    public static void main(String args[])
    {
        Scanner sObj = new Scanner(System.in);
        
        System.out.println("Enter Your Name:");
        String name = sObj.nextLine();
        
        System.out.println("Enter Your Age:");
        byte iAge = sObj.nextByte();
        
        System.out.println("Enter Your Percentage:");
        float fPer = sObj.nextFloat();
        
        
        System.out.println("Your Name Is:"+name);
        System.out.println("Your Age Is :"+iAge);
        System.out.println("Your Percentage Is :"+fPer);
    }
}

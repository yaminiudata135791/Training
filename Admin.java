package Phase1;
import java.util.Scanner;
public class Admin {
    public static void main(String[] args)
    {
    	Scanner input=new Scanner(System.in);
    	
    	String user,pass;
    	
    	System.out.println("Enter your username:");
    	user=input.nextLine();
    	
    	System.out.println("Enter your password:");
    	pass=input.nextLine();
    	
    	if(user.equals("Ankit")&&(pass.equals("Ankit@123")))
    	{
    		System.out.println("Login Successful");
    	}else {
    		System.out.println("Login is Denied");
    	}
    }
    
}

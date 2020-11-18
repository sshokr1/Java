
import java.util.Scanner;

class Task1b {
	
     public static void main(String[] args) {
    	 Scanner name = new Scanner(System.in);
    	 System.out.println("Please enter your name");
    	String userinput1 = name.next();
    	Scanner age = new Scanner(System.in);
   	 System.out.println("Please enter your age");
   	String userinput2 = age.next();
   	
   	Scanner email = new Scanner(System.in);
  	 System.out.println("Please enter your email");
  	String userinput3 = email.next();
  	
  	Scanner faculty = new Scanner(System.in);
  	 System.out.println("Please enter your faculty");
  	String userinput4 = faculty.next(); 
  	
		System.out.println("Your Name is " + userinput1 );
		System.out.println("Your Age is " + userinput2 );
		System.out.println("Your email is " + userinput3 );
		System.out.println("Your faculty is " + userinput4 );
	}   

        
    
}

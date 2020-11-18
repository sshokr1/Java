
import java.util.Scanner;

class Task1c {
	
     public static void main(String[] args) {
    	 Scanner name = new Scanner(System.in);
    	 System.out.println("Please enter your name");
    	String userName = name.next();
    	Scanner age = new Scanner(System.in);
   	 System.out.println("Please enter your age");
   	String userAge = age.next();
   	
   	Scanner email = new Scanner(System.in);
  	 System.out.println("Please enter your email");
  	String userEmail = email.next();
  	
  	Scanner faculty = new Scanner(System.in);
  	 System.out.println("Please enter your faculty");
  	String userFaculty = faculty.next(); 
  	
  	printUserData(userName,userAge,userEmail,userFaculty);
		
	}   

    
    		public static void printUserData(String userName,String userAge, String userEmail,String userFaculty)
    	
    		{	
    			System.out.println("Your Name is " + userName );
    			System.out.println("Your Age is " + userAge );
    			System.out.println("Your email is " + userEmail );
    			System.out.println("Your faculty is " + userFaculty );
    	 
    	 }
     }

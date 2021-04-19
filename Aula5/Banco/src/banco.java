import java.util.Scanner;

public class banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("***************** Welcome to Skyline Corp Bank **********");
		System.out.println();
		System.out.println("Opening your account...");
		System.out.println("What is your name?");
		String name = scan.nextLine();
		System.out.println("What kind of account do you want to?");
		System.out.println("Checking account");
		System.out.println("Saving account");
		String tipoConta = scan.nextLine();
		
		cliente c1 = new cliente(name, tipoConta);
		
	
		System.out.println("Making deposit....");
		System.out.println("How much would you like to deposit?");
		float deposit = scan.nextFloat();
		c1.depositar(deposit);
		
		
		System.out.println("Taking out ...");
		System.out.println("How much would you like to tak out?");
		float takeOut = scan.nextFloat();
		c1.sacar(takeOut);
		
		
		System.out.println("*********************************************************");
		
		

		

	}
	


}

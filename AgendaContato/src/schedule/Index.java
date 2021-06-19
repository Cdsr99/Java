package schedule;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import classes.*;


public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int op;
		
		String name;
		String number;
		String number2;
		String address;

		ArrayList<String> numero = new ArrayList<String>();
		ArrayList<String> a_endereco = new ArrayList<String>();
		Contact_Schedule Agenda = new Contact_Schedule();
		
		System.out.println("What would you like to do bru?");
		System.out.println("1) Savee");
		System.out.println("2) List Schedule");
		System.out.println("3) Exit");
		
		op = scan.nextInt();
		
		switch(op) {
		case 1:
			int op2;

			
			System.out.println("Please, enter with your name:");
			scan.nextLine();	
			name = scan.nextLine();			
			Agenda.setNome(name); 
			System.out.println("Name saved!");
			
			System.out.println("Please, enter with your number and address");
			System.out.println("Numer:");
			number = scan.nextLine();
			numero.add(number);			
			
			
			System.out.println("Address:");
			address = scan.nextLine();
			a_endereco.add(address);
			
			System.out.println("Do you have any other number? 1 <YES> Other <No>");
			op2 = scan.nextInt();
			
			if(op2 == 1) {
			System.out.println("Please, enter with your number and address");
			System.out.println("Numer:");
			number2 = scan.nextLine();
			numero.add(number2);			
			}else {
				
			}
			scan.nextLine();
			System.out.println("Do you have any other address? 1 <YES> Other <No>");
			op2 = scan.nextInt();
			
			if(op2 == 1) {
			System.out.println("Please, name it");
			System.out.println("Address:");
			address = scan.nextLine();
			a_endereco.add(address);			
			}else {
				
			}
			System.out.println();
			System.out.println("Contact List");
			System.out.println("----------------------------------------------");
			System.out.println("Name: " + Agenda.getNome());
			
			for(int i = 0; i < numero.size(); i++) {
				System.out.println("----------------------------------------------");
				System.out.println("Number :" + numero.get(i));
				System.out.println("Address :" + a_endereco.get(i));
				System.out.println("----------------------------------------------");
			}
			
			break;
		case 2:
			System.out.println("Contact List");
			System.out.println("----------------------------------------------");
			System.out.println("Name: " + Agenda.getNome());
			
			for(int i = 0; i < numero.size(); i++) {
				System.out.println("----------------------------------------------");
				System.out.println("Number :" + numero.get(i));
				System.out.println("Address :" + a_endereco.get(i));
				System.out.println("----------------------------------------------");
			}
			
			System.out.println();
			
			break;
		case 3:
			
			break;
		}
		
		while(op != 0) {
		
		}
		
		
		
		

		
		ArrayList<String> Acontato = new ArrayList<String>();
		
	    


        

        
	}


}

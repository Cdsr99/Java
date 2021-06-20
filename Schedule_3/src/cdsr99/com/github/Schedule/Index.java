package cdsr99.com.github.Schedule;

import java.util.ArrayList;
import java.util.Scanner;

import cdsr99.com.github.Classes.*;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int op = 1;
		int op2 = 0;
		String name;
		String address;
		String number;
		
		Contact contato1 = new Contact("(41) 98854-8118");
		Contact contato2 = new Contact("(41) 97945-7027");
		
		Address_data end1 = new Address_data("Rua Oiapoque");
		Address_data end2 = new Address_data("Rua Tiete");
		
		ArrayList<Contact> A_cont1 = new ArrayList<>();
		ArrayList<Address_data> A_end1 = new ArrayList<>();
		
		//Add those datas in the Array
		
		A_cont1.add(contato1);
		A_cont1.add(contato2);
		
		A_end1.add(end1);
		A_end1.add(end2);
		
		Contact_Schedule agenda = new Contact_Schedule("Caio",A_cont1,A_end1);
		
		//System.out.println("Name: " + agenda.getNome());
		//System.out.println("Contact: " + agenda.getContato().get(0).getCelular());
		//System.out.println("Address: " + agenda.getEndereco().get(0).getRua());
		
		while(op != 0)
		{
			
			
			System.out.println("Contact List");
			System.out.println("1) Save contact");
			System.out.println("2) Show list");
			System.out.println("3) Call");
			System.out.println("4) Exit");
			
			op = scan.nextInt();
			
			switch(op) {
			case 1:
				
				System.out.println("Please, enter with your name:");
				scan.nextLine();	
				name = scan.nextLine();			
				 
				System.out.println("Name saved!");
				
				System.out.println("Please, enter with your number and address");
				System.out.println("Numer:");
				number = scan.nextLine();
				Contact contato3 = new Contact(number);
				A_cont1.add(contato3);			
				
				
				System.out.println("Address:");
				address = scan.nextLine();
				Address_data end3 = new Address_data(address);
				A_end1.add(end3);
				
				System.out.println("Do you have any other number? 1 <YES> Other <No>");
				op2 = scan.nextInt();
				
				if(op2 == 1) {
					System.out.println("Please, enter with your other number ");
					System.out.println("Numer:");
					number = scan.nextLine();
					Contact contato4 = new Contact(number);
					A_cont1.add(contato3);	
				}else {}
				
				
				Contact_Schedule agenda1 = new Contact_Schedule(name,A_cont1,A_end1);
				System.out.println("Contact " + name + " saved!");
				break;
			case 2:
				System.out.println("Show list");
				System.out.println("Name: " + agenda.getNome());
				for(int i = 0; i < A_cont1.size(); i++) {
					System.out.println("Contact: " + agenda.getContato().get(i).getCelular());
					System.out.println("Address: " + agenda.getEndereco().get(i).getRua());	
					System.out.println();
				}
				System.out.println();
				break;
			case 3:
				break;
			case 4:
				op = 0;
				break;
				default:
					System.out.println("Wrong number, please try again!");
					break;
			}
		}
		

		
		
		
	}

}

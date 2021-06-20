package cdsr99.com.github.Schedule;

import java.util.ArrayList;
import cdsr99.com.github.Classes.*;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contact contato1 = new Contact("(41) 98854-8118");
		Contact contato2 = new Contact("(41) 97945-7027");
		
		Address_data end1 = new Address_data("Rua Oiapoque");
		Address_data end2 = new Address_data("Rua Tiete");
		
		ArrayList<Contact> A_cont1 = new ArrayList<>();
		ArrayList<Address_data> A_cont2 = new ArrayList<>();
		
		//Add those datas in the Array
		
		A_cont1.add(contato1);
		A_cont1.add(contato2);
		
		A_cont2.add(end1);
		A_cont2.add(end2);
		
		Contact_Schedule agenda = new Contact_Schedule("Caio",A_cont1,A_cont2);
		
		System.out.println("Name: " + agenda.getNome().get(0));
		System.out.println("Contact: " + agenda.getContato().get(0));
		
		
		
		
		
		
	}

}

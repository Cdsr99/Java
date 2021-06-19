package schedule;

import classes.Contact_Schedule;
import java.util.ArrayList;
import classes.Contact;
import java.util.ArrayList;
import classes.Address_data;
import classes.Company;


public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contact c1 = new Contact("1");
		Contact c2 = new Contact("12");
		
		Address_data endereco = new Address_data("Rua Paulinho");
		Address_data endereco2 = new Address_data("Rua Saulinho");
		
		
		ArrayList<Contact> ctt1 = new ArrayList<Contact>();
		//ctt1.add(c1);
		ctt1.set(0,c1);
	
		ArrayList<Address_data> end1 = new ArrayList<Address_data>();
		end1.add(endereco);
		end1.add(endereco2);
		
		
	    
	    	Contact_Schedule contato_agenda1 = new Contact_Schedule("Rodrigues",ctt1,end1 ); 
	        
	        System.out.println("1st contact: " + "Nome: " + contato_agenda1.getNome());
	        System.out.println("1st contact: " + "Nmro: " + contato_agenda1.getContato());
	        System.out.println("1st contact: " + "Ender: " + contato_agenda1.getEndereco());
	        
	        ArrayList<String> cars = new ArrayList<String>();
	        cars.add("Volvo");
	        cars.add("BMW");
	        cars.add("Ford");
	        cars.add("Mazda");
	        for (int i = 0; i < cars.size(); i++) {
	          System.out.println(cars.get(i));
	        }

        

        
	}

}

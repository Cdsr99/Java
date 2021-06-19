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
		
		Address_data endereco = new Address_data("Rua paulinho");
		
		
		ArrayList<Contact> ctt1 = new ArrayList<Contact>();
		ctt1.add(c1);
	
		ArrayList<Address_data> end1 = new ArrayList<Address_data>();
		end1.add(endereco);
		
        Contact_Schedule contato_agenda1 = new Contact_Schedule("Rodrigues",ctt1,end1 ); 
        

        
	}

}

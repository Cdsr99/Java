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
		
		Address_data enderecoIns1 = new Address_data("Rua Paulinho");
		Address_data enderecoIns2 = new Address_data("Rua Saulinho");
		
		
		ArrayList<String> ctt1 = new ArrayList<String>();		
		ctt1.add("4140028922");
		ctt1.add("41988548118");
		
		ArrayList<String> end1 = new ArrayList<String>();
		end1.add("Rua Paulinho");
		end1.add("Rua Saulinho");
		
		
	    for (int i = 0; i < ctt1.size(); i++) {
		    
	    	String contato = ctt1.get(i);
	    	String endereco = end1.get(i);
	    	
	    	//System.out.println(cars.get(i));
	    	Contact_Schedule contato_agenda1 = new Contact_Schedule("Rodrigues",contato,endereco); 
	        
	        System.out.println((i+1)+"st contact: " + "Nome: " + contato_agenda1.getNome());
	        System.out.println((i+1)+"st contact: " + "Nmro: " + contato_agenda1.getContato());
	        System.out.println((i+1)+"st contact: " + "Ende: " + contato_agenda1.getEndereco());
	        System.out.println();
	    	
		    }
		
	    

	        
        

        
	}

}

package schedule;

import classes.Contact_Schedule;
import classes.Contact;

import java.util.ArrayList;

import classes.Address_data;
import classes.Company;


public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact ctt1 = new Contact("041988548118");
		
		Address_data end1 = new Address_data();
		
        Contact_Schedule c1 = new Contact_Schedule("Rodrigues",ctt1, end1 ); 
        
	}

}

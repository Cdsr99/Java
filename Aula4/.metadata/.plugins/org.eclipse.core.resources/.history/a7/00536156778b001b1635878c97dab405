import java.util.Scanner;

public class Votos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vote1 = 0;
		int vote2 = 0;
		int vote3 = 0;
		int vote4 = 0;
		int vote5 = 0;
		int vote6 = 0;
		Integer vote;
		
		
		do {
			System.out.println("Who would you like to give your vote:");
			System.out.println("1 - Square Sponge");
			System.out.println("2 - Rick");
			System.out.println("3 - Obama");
			System.out.println("4 - Bieber");
			System.out.println("5 - Null");
			System.out.println("6 - Blank");
			Scanner scan = new Scanner (System.in);
			vote = scan.nextInt();
			
			if(vote == 1) {
				vote1++;
				
			}else if(vote == 2) {
				vote2++;
			}
			
			else if(vote == 3) {
				vote3++;
			}
			else if(vote == 4) {
				vote4++;
			}
			else if(vote == 5) {
				vote5++;
			}
			else if(vote == 6) {
				vote6++;
			}
		}
		while(vote != 0);
		
		System.out.println("Total of Votes:");
		System.out.println("Square Sponge: "+vote1);
		System.out.println("Rick: "+vote2);
		System.out.println("Obama: "+vote3);
		System.out.println("Bieber: "+vote4);
		System.out.println("Null: "+vote5);
		System.out.println("Blank: "+vote6);
		
		int porNull = vote5 / (vote1 + vote2 + vote3 + vote4)   ;
		
		System.out.println(porNull);
		

	}

}

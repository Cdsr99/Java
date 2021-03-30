import java.util.Scanner;
import java.text.DecimalFormat;


public class Votos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float vote1 = 0;
		float vote2 = 0;
		float vote3 = 0;
		float vote4 = 0;
		float vote5 = 0;
		float vote6 = 0;
		
		
		DecimalFormat f = new DecimalFormat("0.0");
		

		
		
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
		
		System.out.println();
		
		
		System.out.println("Total of Votes:");
		System.out.println("1� Square Sponge: "+vote1);
		System.out.println("2� Rick: "+vote2);
		System.out.println("3� Obama: "+vote3);
		System.out.println("4� Bieber: "+vote4);
		System.out.println("5� Null: "+vote5);
		System.out.println("6� Blank: "+vote6);
		System.out.println();
		
		float total = vote1 + vote2 + vote3 + vote4 + vote5 + vote6;

		float Pvote1 = porcentagem(vote1,total);
		float Pvote2 = porcentagem(vote2,total);
		float Pvote3 = porcentagem(vote3,total);
		float Pvote4 = porcentagem(vote4,total);
		float Pvote5 = porcentagem(vote5,total);
		float Pvote6 = porcentagem(vote6,total);
		
		
		
		System.out.println("Square Sponge: "+ f.format(Pvote1) + "%");
		System.out.println();
		

		System.out.println("Rick: "+ f.format(Pvote2) +"%");
		System.out.println();
		

		System.out.println("Obama: "+ f.format(Pvote3)+"%" );
		System.out.println();
		

		System.out.println("Bieber: "+ f.format(Pvote4) +"%");
		System.out.println();
		

		System.out.println("Null: "+ f.format(Pvote5) +"%");
		System.out.println();
		

		System.out.println("Blank: "+ f.format(Pvote6) +"%");
		System.out.println();
		

	}

	public static float porcentagem(float voto, float total){

		float porc = voto / total;
		float porc2 = porc *100;
		return porc2;
	}

}

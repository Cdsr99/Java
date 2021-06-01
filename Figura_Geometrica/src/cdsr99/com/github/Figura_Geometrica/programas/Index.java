package cdsr99.com.github.Figura_Geometrica.programas;

import java.util.Scanner;

import cdsr99.com.github.Figura_Geometrica.classes.Triangulo;


public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo tri = new Triangulo();
		
		
		System.out.println("************ Welcome ***************");
		System.out.println("* Please, choose one:              *");
		System.out.println("* 1) Triangule                     *");
		System.out.println("* 2) Square                        *");
		System.out.println("* 3) Rectangle                     *");
		System.out.println("* 4) Exit                          *");
		System.out.println("*************************************");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		int chose = scan.nextInt();
		
		switch(chose) {
		case 1:
			Triangulo fig = new Triangulo();
			
			Float l1 = 0;
			Float l2 = 0;
			Float l3 = 0;
			
			//System.out.println("A área do triangulo é: "+ fig.CalcularL2(5f, 23f));
			System.out.println("Enter with the side of the triangule");
			System.out.println();
			
			System.out.println("side 1:");
			System.out.println();
			l1 = scan.nextFloat();
			tri.setLado1(l1);
			
			System.out.println("side 2:");
			System.out.println();
			l2 = scan.nextFloat();
			
			System.out.println("side 3:");
			System.out.println();
			l3 = scan.nextFloat();
			
			System.out.println("The triangule's area is: "+ tri.CalcularArea());
			System.out.println();
			break;
			
		case 2:
			break;
			
		case 3:
			break;
			
		case 4:
			break;
		}
		
	}

}

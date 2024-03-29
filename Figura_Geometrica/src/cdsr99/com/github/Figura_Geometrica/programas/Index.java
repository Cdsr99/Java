package cdsr99.com.github.Figura_Geometrica.programas;

import java.util.Scanner;


import cdsr99.com.github.Figura_Geometrica.classes.Quadrado;
import cdsr99.com.github.Figura_Geometrica.classes.Retangulo;
import cdsr99.com.github.Figura_Geometrica.classes.Triangulo;


public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo tri = new Triangulo();
		
		int ciclo = 1;
		int continu;
		
		do {
			System.out.println();
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
				
				Float l1;
				Float l2;
				Float l3;
				
				Float base;
				Float height;
				
				//System.out.println("A �rea do triangulo �: "+ fig.CalcularL2(5f, 23f));
				System.out.println("Enter with the side of the triangule");
				System.out.println();
				
				System.out.println("side 1:");
				System.out.println();
				l1 = scan.nextFloat();
				tri.setLado1(l1);
				
				System.out.println("side 2:");
				System.out.println();
				l2 = scan.nextFloat();
				tri.setLado2(l2);
				
				System.out.println("side 3:");
				System.out.println();
				l3 = scan.nextFloat();
				tri.setLado3(l3);
				
				System.out.println("Please, enter with the base:");
				System.out.println();
				base = scan.nextFloat();
				tri.setBase(base);
				
				System.out.println("Please, enter with the height:");
				System.out.println();
				height = scan.nextFloat();
				tri.setHeight(height);
				
				System.out.println("Triangule Status: ");
				System.out.println();
				System.out.println("Area: "+ tri.CalcularArea());
				System.out.println();
				System.out.println("Perimeter: "+ tri.CalcularPerimetro());
				
				System.out.println();
				System.out.println("Do you would like to continue? <1>Yes <Other number> No");
				continu = scan.nextInt();
				if(continu == 1) {
					ciclo = 1;
				}else {
					ciclo = 0;
				}
				
				
				break;
				
			case 2:
				
				Quadrado FigQuadrado = new Quadrado();
				
				Float la1;

				
				//System.out.println("A �rea do triangulo �: "+ fig.CalcularL2(5f, 23f));
				System.out.println("Enter with the side of the square");
				System.out.println();
				
				System.out.println("side 1:");
				System.out.println();
				la1 = scan.nextFloat();
				FigQuadrado.setL1(la1);
				
				
				System.out.println("Square Status: ");
				System.out.println();
				System.out.println("Area: "+ FigQuadrado.CalcularArea());
				System.out.println();
				System.out.println("Perimeter: "+ FigQuadrado.CalcularPerimetro());
				
				System.out.println();
				System.out.println("Do you would like to continue? <1>Yes <Other number> No");
				continu = scan.nextInt();
				if(continu == 1) {
					ciclo = 1;
				}else {
					ciclo = 0;
				}
				
				break;
				
			case 3:
				
				Retangulo FigRetangulo = new Retangulo();
				
				System.out.println("Enter with the data of the retangulo");
				System.out.println();
				
				System.out.println("Width:");
				System.out.println();
				la1 = scan.nextFloat();
				FigRetangulo.setW(la1);
				System.out.println();
				
				System.out.println("length:");
				System.out.println();
				la1 = scan.nextFloat();
				FigRetangulo.setL(la1);
				
				
				System.out.println("Retangulo Status: ");
				System.out.println();
				System.out.println("Area: "+ FigRetangulo.CalcularArea());
				System.out.println();
				System.out.println("Perimeter: "+ FigRetangulo.CalcularPerimetro());
				
				System.out.println();
				System.out.println("Do you would like to continue? <1>Yes <Other number> No");
				continu = scan.nextInt();
				if(continu == 1) {
					ciclo = 1;
				}else {
					ciclo = 0;
				}
				break;
				
			case 4:
				ciclo = 0;
				//System.exit(0);
				break;
			}
			
		}while(ciclo == 1);
		

		
	}

}

import java.util.Scanner;

public class EntradaDados {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o primeiro numero ");
		
		//Primeiro numero
		Scanner scan = new Scanner(System.in);
		Integer numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero ");
		Integer numero2 = scan.nextInt();

		int soma = numero1 + numero2;
		int sub = numero1 - numero2;
		int mul = numero1 * numero2;
		int div = numero1 / numero2;
		
//		System.out.println("Ah soma é igual a: "+soma);
//		System.out.println("Ah subtração é igual a: "+sub);
//		System.out.println("Ah multiplicação é igual a: "+mul);
//		System.out.println("Ah divisão é igual a: "+div);
		
		System.out.println("Qual operação você gostaria de realizar com os números "+ numero1 + "e " + numero2 +"?");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		
		Integer escolha = scan.nextInt();
		
		switch(escolha) {
		case 1:
			System.out.println("Ah soma é igual a: "+ soma);
			break;
			
		case 2:
			System.out.println("Ah subtração é igual a: "+ sub);
			break;
			
		case 3:
			System.out.println("Ah multiplicação é igual a: "+ mul);
			break;
			
		case 4:
			System.out.println("Ah divisão é igual a: "+ div);
			break;
			
		}
		
	}



}

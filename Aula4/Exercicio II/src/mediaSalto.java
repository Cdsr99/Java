import java.util.Scanner;

public class mediaSalto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What is your name?");
		Scanner scan = new Scanner(System.in);
		
		String atleta = scan.nextLine();
		
		
		System.out.println("Insert the first jump:");
		Float salto1 = scan.nextFloat();
		
		System.out.println("Insert the second jump:");
		Float salto2 = scan.nextFloat();
		
		System.out.println("insert the 3° jump");
		Float salto3 = scan.nextFloat();
		
		System.out.println("Insert the 4° jump");
		Float salto4 = scan.nextFloat();
		
		System.out.println("Insert the 5° jump");
		Float salto5 = scan.nextFloat();
		
		//Média
	
		System.out.println();
		System.out.println();
		System.out.println("1° jump: "+salto1);
		System.out.println();
		System.out.println("2° jump: "+salto2);
		System.out.println();
		System.out.println("3° jump: "+salto3);
		System.out.println();
		System.out.println("4° jump: "+salto4);
		System.out.println();
		System.out.println("5° jump: "+salto5);
		System.out.println();
		
		System.out.println("Final result");
		System.out.println("Athlete: "+ atleta);
		System.out.println("Jumps: " + salto1 +" - "+ salto2+" - " +salto3+" - "  + salto4 +" - "+salto5);
		System.out.println();
		Float media = (salto1 + salto2 + salto3 + salto4 + salto5) /5 ;
		System.out.println("the average of the jumps is: "+ media);

	}

}

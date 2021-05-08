package carro;
import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner(System.in);
int stop = 0;
proprietario p1 = new proprietario("Caio da Silverira Rodrigues", 3);

Carro c1 = new Carro(p1.getNome(),p1.getCPF());

c1.setCor("Azul");
c1.setFabricante("Renault");
c1.setModelo("Sandero");
c1.setStatus("Parado");

endereco e1 = new endereco();

e1.setBairro("Iguaçu");
e1.setCep(123);
e1.setCidade("Fazenda Rio Grande");
e1.setComplemento("Casa");
e1.setEndereco("Rua Rio Tiete");
e1.setEstado("Paraná");

int option = 0;


while(option != 9) {
	
	System.out.println("***************************************************************************");
	System.out.println("Driving the car                                                           *");
	System.out.println("1) Speed up                                                               *");
	System.out.println("2) Slow down                                                              *");
	System.out.println("3) Stop                                                                   *");
	System.out.println("4) Current speed                                                          *");
	System.out.println("5) Gas level                                                              *");
	System.out.println("9) Exit                                                                   *");
	System.out.println("***************************************************************************");
	
	System.out.println("");
	option = scan.nextInt();
	
	switch(option) {
	case 1:
		c1.setVelocidadeAtual(c1.getVelocidadeAtual() + 5);
		System.out.println("Speeding up");
		break;
		
	case 2:
		c1.setVelocidade(c1.getVelocidadeAtual() - 5);
		break;
		
	case 3:
		c1.setVelocidade(0);
		break;
		
	case 4:
		System.out.println("Speed: " + c1.getVelocidadeAtual());
		break;
	case 5:
		System.out.println("still in development");
		break;
	default:
		System.out.println("Enter with another number this one isn't an option!");
	}
	
	
	
}

	}

}

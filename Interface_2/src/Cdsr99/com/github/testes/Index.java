package Cdsr99.com.github.testes;

import Cdsr99.com.github.pessoas.*;
import Cdsr99.com.github.transportes.*;
import java.util.ArrayList;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Instancias ------------------------------------------------------------------------------------------
		Pessoa p1 = new Pessoa("Caio da Silveira Rodrigues", "099.708.349-24");
		
		Carro car1 = new Carro("Uno Fiat");
		Carro car2 = new Carro("Fusca");
		Carro car3 = new Carro("Combi");
		
		Moto moto1 = new Moto("CB 160");
		Moto moto2 = new Moto("Ninja");
		Moto moto3 = new Moto("Yamaha");
		
		Bicicleta b1 = new Bicicleta("GTS");
		Bicicleta b2 = new Bicicleta("Vikings");
		Bicicleta b3 = new Bicicleta("Caloi");
		
		Contato c1 = new Contato("(41) 98854-8118");
		Contato c2 = new Contato("(41) 99958-5425");
		
		
// ArryList's ----------------------------------------------------------------------------------------
		ArrayList<Contato> AContato = new ArrayList<>();
		AContato.add(c1);
		AContato.add(c2);
		
		ArrayList<Carro> Acarro = new ArrayList<>();
		Acarro.add(car1);
		Acarro.add(car2);
		Acarro.add(car3);
		
		ArrayList<Moto> Amoto = new ArrayList<>();
		Amoto.add(moto1);
		Amoto.add(moto2);
		Amoto.add(moto3);
		
		ArrayList<Bicicleta> Abicicleta = new ArrayList<>();
		Abicicleta.add(b1);
		Abicicleta.add(b2);
		Abicicleta.add(b3);
		
		

		
		
		// Pessoas -----------------------------------------------------------
		p1.setContato(AContato);
		p1.setProfissao("Estagiario");
		p1.setCarro(Acarro);
		p1.setMoto(Amoto);
		p1.setBicicleta(Abicicleta);
		
		// ----------------------------------Show display-----------------------------------
		
		
		System.out.println("Aqui jás os bens de " + p1.getNome() + " do CPF:" + p1.getCpf());
		System.out.println();
		for(int i =0 ; Amoto.size() >= i; i++) {			
		System.out.println("Carro: " + p1.getCarro().get(i).getModelo());
		System.out.println("Moto: " + p1.getMoto().get(i).getModelo());
		System.out.println("Bike: " + p1.getBicicleta().get(i).getModelo());
		System.out.println("------------------------------------------------------------------------------");
		
			
		}
		
		
	}

	

}

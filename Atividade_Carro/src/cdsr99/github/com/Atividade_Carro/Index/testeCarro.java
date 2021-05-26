package cdsr99.github.com.Atividade_Carro.Index;

import cdsr99.github.com.Atividade_Carro.classes.Carro;
import cdsr99.github.com.Atividade_Carro.classes.Proprietario;

public class testeCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Proprietario p1 = new Proprietario("Caio da Silveira Rodrigues","099.708.349-24");
		
		Carro c1 = new Carro("Sandero", "Renauti", p1, false, false,2);
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.reduzir();
		c1.acelerar();
		c1.aumentaMarcha();
		c1.aumentaMarcha();
		c1.aumentaMarcha();
		c1.reduzMarcha();
		
	}

}

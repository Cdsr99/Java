package cdsr99.github.com.carro.programas;

import cdsr99.github.com.carro.classes.Carro;

public class testeCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro c1 = new Carro();
		c1.setAno("2021");
		c1.setChassi("AOO1298F42");
		c1.setModelo("Sandero");
		c1.setCor("Branco");
		c1.setnPortas(4);
		c1.SetMarchaAtual(1);
		c1.setnMarchas(6);
		
		c1.acelerar();
		c1.acelerar();
		c1.aumentaMarcha();
		
		c1.acelerar();
		c1.acelerar();
		c1.aumentaMarcha();
		
		System.out.println();
		
		c1.freiar();
		
		
	}

}

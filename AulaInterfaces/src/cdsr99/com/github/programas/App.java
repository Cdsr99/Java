package cdsr99.com.github.programas;

import cdsr99.com.github.aula.interfaces.*;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soma add = new Soma();
		Subtracao menus = new Subtracao();
		
		System.out.println("Soma: " + add.Calcular(5f, 1f));
		System.out.println("Soma: " + menus.Calcular(5f, 1f));
	}

}

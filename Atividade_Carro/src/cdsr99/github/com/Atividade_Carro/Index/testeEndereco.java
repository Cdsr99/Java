package cdsr99.github.com.Atividade_Carro.Index;

import cdsr99.github.com.Atividade_Carro.Endereco.*;
import cdsr99.github.com.Atividade_Carro.classes.Proprietario;

public class testeEndereco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proprietario p1 = new Proprietario("Caio da Silveira Rodrigues","099.708.349-24");
		Endereco e1 = new Endereco("Rua Oiapoque","1501", "Iguaçu II", "Fazenda Rio Grande", "Paraná", "83833-212", p1);

		
		e1.rotaCasa();
	}

}

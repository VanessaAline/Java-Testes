package View1;

import java.util.Scanner;

import Business3.PessoasBusiness;
import Dao4.PessoasDao;
import Modelo2.Pessoas;
import Repositorio5.Repositorio;

public class Principal {

	public static void main(String[] args) throws Exception{
		
		Repositorio rep = new Repositorio(new PessoasBusiness(), new PessoasDao());
		
		PessoasBusiness negocios = rep.getPessoasB();
		
		/*Scanner xt = new Scanner(System.in);
		System.out.println("Informe seu Nome: ");
		String nome = xt.nextLine();
		System.out.println("Informe seu Sexo: ");
		String sexo = xt.nextLine();
		System.out.println("Informe sua Idade: ");
		int idade = xt.nextInt();*/
		
		
		Pessoas pessoa1 = new Pessoas();
		pessoa1.setNome("Ana");
		pessoa1.setSexo("F");
		pessoa1.setIdade(35);
		
		
		negocios.Salvar(pessoa1);
		
		
		
		
	}

}

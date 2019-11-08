package Repositorio5;

import Business3.PessoasBusiness;
import Dao4.PessoasDao;

public class Repositorio {
	
	//Atributos\\
	private PessoasBusiness pessoasB;
	private PessoasDao pessoasD;
	
	//Construtor\\
	public Repositorio() {
		super();
	}
	
	public Repositorio(PessoasBusiness pessoasB, PessoasDao pessoasD) {
		super();
		
		if(pessoasB == null) {
			pessoasB = new PessoasBusiness();
			System.out.println("Criou PessoasBussines");
		}
		
		if(pessoasD == null) {
			pessoasD = new PessoasDao();
			System.out.println("Criou PessoasDao");
		}
		
		this.pessoasB = pessoasB; this.pessoasD = pessoasD;
		
	}

	//Get´s & Set´s\\
	public PessoasBusiness getPessoasB() {
		return pessoasB;
	}

	public void setPessoasB(PessoasBusiness pessoasB) {
		this.pessoasB = pessoasB;
	}

	public PessoasDao getPessoasD() {
		return pessoasD;
	}

	public void setPessoasD(PessoasDao pessoasD) {
		this.pessoasD = pessoasD;
	}
	
}

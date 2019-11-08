package Business3;

import Dao4.PessoasDao;
import Modelo2.Pessoas;

public class PessoasBusiness {
	
	PessoasDao people = new PessoasDao();
	
	public boolean Salvar(Pessoas pe) {
		if(pe.getIdade() >= 18) {
			
			this.people.inserirPessoa(pe);
			return true;
		}
		return false;
	}
	
}


public class NoLista {
	private int valor;
	private NoLista nextNoLista;
	
	//Construtor\\
	public NoLista(int valor) {
		this.valor = valor;
		this.nextNoLista = null;
	}

	//Gets / Sets\\
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public NoLista getNextNoLista() {
		return nextNoLista;
	}

	public void setNextNoLista(NoLista nextNoLista) {
		this.nextNoLista = nextNoLista;
	}
}

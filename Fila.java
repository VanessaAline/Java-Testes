

public class Fila {
	//Atributos
	protected int inicio;
	protected int fim;
	protected int qtdelemento;
	protected int filaV[] = new int[10];
	protected int tamanho;
	
	//Método Construtor
	public Fila() {
		this.inicio = 0;
		this.fim = -1;
	}
	
	//Métodos Especiais - Set/Get
	
	public void setinicio(int i) {
		this.inicio = i;
	}
	public int getinicio() {
		return this.inicio;
	}
	public void setfim(int f) {
		this.fim = f;
	}
	public int getfim() {
		return this.fim;
	}
	public void setqtdlemento(int qtd) {
		this.qtdelemento = qtd;
	}
	public int getqtdelemento() {
		return this.qtdelemento;
	}
	public void settamanho(int t) {
		this.tamanho = t;
	}
	public int gettamanho() {
		return this.tamanho;
	}
	
	//Métodos da Classe
	public void inserir(int i) {
		if(! estacheia()) {
				this.inicio = 0;
			}
			this.fim++;
			this.filaV[fim] = i;
			this.qtdelemento++;
		}
	public void remover() {
		if(!estavazia()) {
			this.inicio++;
			this.qtdelemento--;
		}
	}
	
	public boolean estavazia() {
		if (this.qtdelemento == 0) {
			return true;
		} else {
			return false;
		}	
	}
	public boolean estacheia() {
		if(this.qtdelemento == this.tamanho - 1) {
			return true;
		}else {
			return false;
		}
	}
	public void mostrar() {  // printa os valores inseridos
		for(int i = inicio; i<=fim; i++) {
			System.out.println("Valor Inserido: " + this.filaV[i]);
		}
	}
	
	//Método para mostrar o Estado atual da Fila...
		public void EstadoAtual() {
			System.out.println("O Inicio da Fila é: " + this.filaV[inicio]);
			System.out.println("O Final da Fila é: "+ this.filaV[fim]);
			System.out.println("A Quantidade de Elementos na Fila é: " + this.qtdelemento);
		}
}



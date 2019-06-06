
public class Pilha {
	protected int topo;
	protected int qtdelemento;
	protected int tamanho;
	protected int pilhaV[] = new int[10];
	
	//Método Construtor
		public Pilha() {
			this.topo = -1;
		}
		
		//Métodos Especiais - Set/Get
		
		public void settopo(int t) {
			this.topo = t;
		}
		public int gettopo() {
			return this.topo;
		}
		public void settamanho(int tm) {
			this.tamanho = tm;
		}
		public int gettamanho() {
			return this.tamanho;
		}
		
		//Métodos da Classe
		public void push(int p) { //inserir elementos
			if(!estacheia()) {
				this.topo++;
				this.pilhaV[topo] = p;
				this.qtdelemento++;
			}
		}
		public void pop() {  // remover elementos
			if(!estavazia()) {
				this.topo--;
				this.qtdelemento--;
			}
		}
		public void top() {  // acessa o elemento no topo da pilha	
			if(!estavazia()) {
				System.out.println("Valor do Topo: " + this.pilhaV[topo]);
			}
		}
		public void pull(int aux) {  //altera o elemento no topo da pilha
			if(!estavazia()) {
				int temp = this.pilhaV[topo];
				this.pilhaV[topo] = this.pilhaV[aux-1];
				this.pilhaV[aux-1] = temp;
			}
		}
		public void mostrar() { // printa os valores inseridos
			for(int i = 0; i<=topo; i++) {
				System.out.println("Valor Inserido: " + this.pilhaV[i]);
			}
		}
		public boolean estacheia() {
			if(this.qtdelemento == this.tamanho - 1) {
				return true;
			}else {
				return false;
			}
		}
		public boolean estavazia() {
			if (this.qtdelemento == 0) {
				return true;
			} else {
				return false;
			}
		}
}	
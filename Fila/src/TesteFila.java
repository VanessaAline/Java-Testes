
public class TesteFila {

	public static void main(String[] args) {
		
		Fila fila1 = new Fila();
		
		fila1.inserir(2);//inseri valores
		fila1.inserir(3);//inseri valores
		fila1.inserir(8);//inseri valores
		fila1.inserir(7);//inseri valores
		fila1.inserir(5);//inseri valores
		
		fila1.mostrar();//printa os valores da fila
		
		System.out.println("---------------------------");
		fila1.EstadoAtual();
		System.out.println("---------------------------");
		fila1.remover();
		fila1.mostrar();//printa os valores da fila
		System.out.println("---------------------------");
		fila1.EstadoAtual();
		
		
	}

}


public class TesteFila {

	public static void main(String[] args) {
		
		Fila fila1 = new Fila();
		
		
		fila1.inserir(2);
		fila1.inserir(3);
		fila1.inserir(8);
		fila1.inserir(7);
		fila1.inserir(9);
		
		fila1.mostrar();
		
		System.out.println("---------------------------");
		fila1.EstadoAtual();
		System.out.println("---------------------------");
		fila1.remover();
		System.out.println("---------------------------");
		fila1.mostrar();
		System.out.println("---------------------------");
		fila1.EstadoAtual();
		
	}

}

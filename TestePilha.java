
public class TestePilha {

	public static void main(String[] args) {
		 Pilha pilha1 = new Pilha();
		
		 pilha1.push(8);//inserir
		 pilha1.push(9);//inserir
		 pilha1.push(6);//inserir
		 pilha1.push(10);//inserir
		 pilha1.mostrar();//status
		 System.out.println("------------------------------");
		 pilha1.pop();//remover
		 pilha1.mostrar();//status
		 System.out.println("------------------------------");
		 pilha1.top();//acessa topo
		 System.out.println("------------------------------");
		 pilha1.push(55);//inserir
		 pilha1.mostrar();//status
		 System.out.println("------------------------------");
		 pilha1.pull(2);
		 System.out.println("------------------------------");
		 pilha1.mostrar();//status
	}

}

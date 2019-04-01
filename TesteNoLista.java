
public class TesteNoLista {

	public static void main(String[] args) {
		Lista l1 = new Lista();
		
		//l1.print();
		l1.adicionar(8);
		//l1.remove(8);
		l1.adicionar(9);
		l1.adicionar(7);
		l1.remove(7);
		l1.adicionar(6);
		l1.remove(6);
		//l1.remove(32);
		l1.print();
	
	}

}

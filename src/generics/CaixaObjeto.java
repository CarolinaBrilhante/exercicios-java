package generics;

public class CaixaObjeto {
	
	private Object coisa;
	
	public void guardar(Object coisa) { //método set - Altera
		this.coisa = coisa;
	}
	
	public Object abrir() { //método get - Ler
		return coisa;
	}
}

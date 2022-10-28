package encapsulamento.casaA;

public class Paulo {

	public static void main(String[] args) {
		
		Ana esposa = new Ana();
		
		Ana.formaDeFalar = "Falo mesmo";
	
	//	System.out.println(esposa.segredo);
	    System.out.println(esposa.facoDentroDecasa);
	    System.out.println(Ana.formaDeFalar);
		System.out.println(Ana.todosSabem);
		
		
	}

}

package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {

		Calculo calc = (x, y) -> { return x + y; }; // a função com chaves aceita que se tenha mais de uma sentença de código associada contanto que respeite os parâmetros passado na interface
		System.out.println(calc.executar(2, 3));

		calc = (x, y) -> x* y; // sem chaves não precisa declarar o retorno, mas tb só pode ter uma senteça de código associada
		System.out.println(calc.executar(2, 3));
	
		System.out.println(calc.legal());
		
		System.out.println(Calculo.muitoLegal());
	}
}	

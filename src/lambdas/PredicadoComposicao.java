package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
	
		Predicate <Integer> isPar = num -> num % 2 == 0;
		Predicate <Integer> isTresDigitos = num -> num >= 100 && num >= 999;
		
		System.out.println(isPar.and(isTresDigitos).negate().test(123));  // .and para adicionar no encadeamento outra função .negate é quando se precisa fazer negação lógica e .or quando o que se deseja é testar se uma ou outra função vai retornar verdadeira. 
		System.out.println(isPar.or(isTresDigitos).test(12));
	
	}
}

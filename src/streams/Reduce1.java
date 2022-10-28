package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
	
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		Integer total1 = nums.parallelStream().reduce(soma).get();
		System.out.println(total1); 
		
		Integer total2 = nums.stream().reduce(100, soma); // se for passar um valor, como no caso acima, pode usar o parallel mas quando ele é usando e é passado um valor para o acumulador esse valor vai ser adicionado a cada item de forma paralela, de maneira a modificar o resultado esperado
		System.out.println(total2);
		
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
	
	}
}

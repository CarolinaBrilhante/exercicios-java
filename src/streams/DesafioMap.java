package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.function.Function;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	
		UnaryOperator<String> inverter = 
				s -> new StringBuilder(s).reverse().toString();
		Function <String, Integer> binarioParaInt = 
				s -> Integer.parseInt(s, 2);
				
				
		nums.stream() //operação de build para gerar a stream
			.map(Integer::toBinaryString) // operação intermediária
			.map(inverter)
			.map(binarioParaInt)
			.forEach(System.out::println);
	}
}

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Alimento a1 = new Alimento("Arroz", false, true, 5.0, true);
		Alimento a2 = new Alimento("Batata", false, false, 3.0, true);
		Alimento a3 = new Alimento("Farinha de Trigo", true, true, 4.0, true);
		Alimento a4 = new Alimento("Manteiga", false, true, 2.0, false);
		Alimento a5 = new Alimento("Macarrão", true, false, 5.0, true);
		Alimento a6 = new Alimento("Feijão", false, true, 5.0, false);
		Alimento a7 = new Alimento("Carne", false, false, 8.0, true);
		
		List<Alimento> estoque = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);
		
		Predicate<Alimento> disponiveis = a -> a.temNoEstoque;
		Predicate<Alimento> estaValido = a -> a.validade;
		Function<Alimento, String> temNaPrateleira = 
				a -> a.nome + ". Estão disponíveis " + a.quantidade + " Kg";
				
		System.out.println("Hoje temos na prateleira para oferecer: ");
		
		estoque.stream()
			.filter(disponiveis)
			.filter(estaValido)
			.map(temNaPrateleira)
			.forEach(System.out::println);
	}

}

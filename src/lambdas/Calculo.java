package lambdas;

@FunctionalInterface // para ter uma interface funcional só podemos ter 1 função abstrata
public interface Calculo {

	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}
}

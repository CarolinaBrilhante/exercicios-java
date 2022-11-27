package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		try {			
			System.out.println(7 / entrada.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally { // Fazemos uso do finally quando houver a necessidade de que um trecho de código seja executado indepedentemente do resultado do try/catch, mesmo em casos de exception não tratada. 
			System.out.println("Finally.");
		//	entrada.close();  Neste exemplo é obrigatório que a aplicação feche o recurso que foi aberto. 
		}
		
		try {
			System.out.println(7 / entrada.nextInt());
		} finally { // Mesmo sem o catch podemos ter o finally.
			System.out.println("Finally #2");
			entrada.close();
		}
		
		System.out.println("Fim :)");
	}
		
}

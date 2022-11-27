package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // usando o recurso do framework para encerrar a execução do programa.
		janela.setSize(600, 200); // definindo o tamanho da janela
		janela.setLayout(new FlowLayout()); // alterando o layout da janela
		janela.setLocationRelativeTo(null); // centralizar o componente na Tela.
		
		
		JButton botao = new JButton("Clicar!");
		janela.add(botao);
		
		botao.addActionListener(e -> { //implementando o observer no swing
			System.out.println("Evento Ocorreu!");
		});
		
		janela.setVisible(true);
	}
}

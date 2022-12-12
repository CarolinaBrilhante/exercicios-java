package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoa2 {

	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome like ?";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a letra que deseja consultar: ");
		String letra = entrada.next();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + letra + "%");
		ResultSet resultado = stmt.executeQuery();
				
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for (Pessoa p:pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}
		
	    stmt.close();
		entrada.close();
		conexao.close();
	}
}

package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	/** Módulo de Conexão**/
	// Parâmetros de conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url =
"jdbc:mysql://127.0.0.1:3306/dbexames?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "240401Ajr@";
	
	// Criando Método de conexão 
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}		
	}
	// testando a Conexão
	public void testeConexao() {
		try {
			Connection con = conectar();
		    System.out.println(con);
		    con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	/** M?dulo de Conex?o**/
	// Par?metros de conex?o
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url =
"jdbc:mysql://127.0.0.1:3306/dbexames?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "240401Ajr@";
	
	// Criando M?todo de conex?o 
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
	// testando a Conex?o
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

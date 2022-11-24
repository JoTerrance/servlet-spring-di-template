package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class GestionarConexionMysql implements Gestionadora {
	private String jdbcUrl = "jdbc:mysql://192.168.1.50:3306/lol";
	@Override
	public Connection createConnection() {
		Connection conn;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(jdbcUrl, "sa", "");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return conn;
	}

}

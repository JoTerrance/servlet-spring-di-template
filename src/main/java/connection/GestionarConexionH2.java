package connection;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.stereotype.Component;

@Component
public class GestionarConexionH2 implements Gestionadora {
	private String jdbcUrl = "jdbc:h2:file:./src/main/resources/mydatabase";
	@Override
	public Connection createConnection() {
		Connection conn;
		try {
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection(jdbcUrl, "sa", "");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return conn;
	}

}

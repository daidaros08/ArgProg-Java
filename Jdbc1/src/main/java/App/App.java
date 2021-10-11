package App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) throws SQLException {
		
		//ruta del archivo de base de datos
		String url= "jdbc:sqlite:users.db";
		//hago la conexion con el DriverManager
		Connection connection = DriverManager.getConnection(url);
		
		
		//Pido la consulta que voy a realizar
		String sql="SELECT COUNT(1) AS TOTAL FROM USERS";
		PreparedStatement statement= connection.prepareStatement(sql);
		
		//Pido los resultados de esa consulta
		ResultSet resultados =statement.executeQuery();
		resultados.next();
		//Imprimo los resultados 
		System.out.println (resultados.getInt("TOTAL"));
		//cierro la conexion
		connection.close();
	}
 
}

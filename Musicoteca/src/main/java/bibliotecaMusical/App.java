package bibliotecaMusical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) throws SQLException{
		String url = "jdbc:sqlite:BibliotecaMusical.db";
		Connection conn = DriverManager.getConnection(url);
		Musicoteca musicoteca1 = new Musicoteca();
		
		String sql1 = "SELECT * FROM Canciones WHERE genero_musical = 'pop' OR genero_musical = 'Rock' OR genero_musical = 'Pop'";
		String sql2 = "SELECT * FROM Canciones";
		PreparedStatement statement = conn.prepareStatement(sql1);
		ResultSet results = statement.executeQuery();
		/*while (results.next()) {
			System.out.print(results.getString ("Titulo"));
			System.out.print(" - ");
			System.out.println(results.getString("Autor")+ " - "+ results.getString("genero_musical"));
		}*/
		
		while (results.next()) {
			String autor = results.getString("autor");
			String titulo = results.getString("titulo");
			int duracion = results.getInt("duracion");
			String genero = results.getString("genero_musical");
			Cancion cancionNueva = new Cancion(autor,titulo,duracion,genero);
			musicoteca1.agregarCancion(cancionNueva);
		}
		conn.close();
		System.out.println(musicoteca1.toString());
		

	}

}

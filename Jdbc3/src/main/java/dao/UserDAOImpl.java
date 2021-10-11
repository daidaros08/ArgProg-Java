package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import jdbc.ConnectionProvider;
import model.User;
public class UserDAOImpl implements UserDAO {

	public List<User> findAll() throws SQLException {
		String sql = "SELECT * FROM USERS";
		Connection conn = ConnectionProvider.getConection();
		PreparedStatement statement= conn.prepareStatement(sql);
		ResultSet results = statement.executeQuery();
		List <User> users = new LinkedList<User>();
		while (results.next()) {
			users.add(toUser(results));
		}
		return users;
	}

	public int countAll() throws SQLException {
		String sql = "SELECT COUNT (1) AS TOTAL FROM USERS";
		Connection conn = ConnectionProvider.getConection();
		PreparedStatement statement= conn.prepareStatement(sql);
		ResultSet results = statement.executeQuery();
		results.next();
		int total = results.getInt("TOTAL");
		
		return total;
	}

	public int insert(User t) throws SQLException {
		String sql = "INSERT INTO USERS (USERNAME,PASSWORD) VALUES (?,?)";
		Connection conn= ConnectionProvider.getConection();
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, t.getUsername());
		statement.setString(2, t.getPassword());
		int rows = statement.executeUpdate();
		return rows;
	}

	public int update(User t) throws SQLException {
		String sql = "UPDATE USERS SET PASSWORD = ? WHERE USERNAME = ?";
		Connection conn = ConnectionProvider.getConection();
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, t.getUsername());
		int rows = statement.executeUpdate();
		return rows;
	}

	public int delete(User t) throws SQLException {
		String sql= "DELETE FROM USERS WHERE USERNAME = ?";
		Connection conn = ConnectionProvider.getConection();
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, t.getUsername());
		int rows = statement.executeUpdate();
		return rows;
	}

	public User findByUsername(String username) throws SQLException {
		String sql = "SELECT * FROM USERS WHERE USERNAME = ?";
		Connection conn = ConnectionProvider.getConection();
		PreparedStatement statement= conn.prepareStatement(sql);
		statement.setString(1, username);
		ResultSet results = statement.executeQuery();
		User user = null;
		if (results==null) {
			user=toUser(results);
		}
		return user;
	}
	private User toUser(ResultSet results) throws SQLException{
		return new User (results.getString(1), results.getString(2));
	}

}

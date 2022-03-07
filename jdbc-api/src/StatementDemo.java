import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class StatementDemo {
	public static void main(String[] args) {
		String sql = "insert into citizen values (5, 'Jack', 24, 'Delhi')";
		try {
			Connection conn = JdbcFactory.getConnection();

			Statement stmt = conn.createStatement();

			stmt.executeUpdate(sql); // DML Operation

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

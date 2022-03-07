import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {
	public static void main(String[] args) {
		String sql1 = "insert into Citizen values (8, 'Kim', 31, 'Thiruvanthapuram')";
		String sql2 = "update Citizen set age = 27 where id = 3";
		String sql3 = "delete from Citizen where id=4";

		Connection conn = null;

		try {
			conn = JdbcFactory.getConnection();

			Statement stmt = conn.createStatement();
			// adding batch of queries to execute in one go
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);

			conn.setAutoCommit(false); // Setting auto-commit state to false

			stmt.executeBatch(); // Exexcuting all Queries

			conn.commit(); // committing transaction on successful execution of all queries
		} catch (SQLException e) {
			try {
				conn.rollback(); // roll back transaction if any of the queries failed
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}
}

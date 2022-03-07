import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class QueryAnalyzer {
	public static void main(String[] args) throws SQLException {
		String sql = "select name, age from Citizen";

		Connection conn = JdbcFactory.getConnection();
		ResultSet rs = conn.createStatement().executeQuery(sql);
		ResultSetMetaData meta = rs.getMetaData();

		for (int c = 1; c <= meta.getColumnCount(); c++)
			System.out.println(meta.getColumnName(c).toUpperCase() + "\t");
		System.out.println();

		while (rs.next()) {
			for (int c = 1; c <= meta.getColumnCount(); c++)
				System.out.println(rs.getString(c) + "\t");
			System.out.println();
		}

	}

}

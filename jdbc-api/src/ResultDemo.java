import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultDemo {
	public static void main(String[] args) {

		String sql = "select * from citizen";

		try {
			Connection conn = JdbcFactory.getConnection();
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = stmt.executeQuery(sql);

//			rs.absolute(5);
//			rs.updateString("Name", "John");
//			rs.updateRow();
//			System.out.println("Values UPDATED");

			rs.moveToInsertRow();
			rs.updateInt(1, 7);
			rs.updateString(2, "Matt");
			rs.updateInt(3, 35);
			rs.updateString(4, "Noida");
			rs.insertRow();
			rs.moveToCurrentRow();

			ResultSetMetaData meta = rs.getMetaData();

			for (int c = 1; c <= meta.getColumnCount(); c++)
				System.out.println(meta.getColumnName(c) + "\t");
			System.out.println();

			while (rs.next())
				System.out
						.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getString(4));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

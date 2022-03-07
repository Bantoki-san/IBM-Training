import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;
import com.mysql.cj.jdbc.Driver;

public class ConnectionDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/training";

		try {
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
//			Connection conn = DriverManager.getConnection(url, "root", "#HareKrishnaistheGr8est");
			
			Connection conn = JdbcFactory.getConnection();
			System.out.println("Connection Successful");

			DatabaseMetaData meta = conn.getMetaData();
			System.out.println("DB NAME: " + meta.getDatabaseProductName());
			System.out.println("DB Ver: " + meta.getDatabaseProductVersion());
			System.out.println("Driver Name: " + meta.getDriverName());
			System.out.println("Driver Version: " + meta.getDriverVersion());

		} catch (SQLException e) {
			System.out.println("Connection Failed");
			e.printStackTrace();
		}

	}
}

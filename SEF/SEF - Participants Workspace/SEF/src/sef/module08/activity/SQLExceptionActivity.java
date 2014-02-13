package sef.module08.activity;

//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//The following program throws a checked exception. 
public class SQLExceptionActivity {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost/activity1";
		String user = "root";
		String pass = "abcd1234";

		// The following code would not compile unless it's put inside a try
		// catch
		// 1 - put it in a try block and handle ClassNotFoundException
		Connection cn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established! \n");

		} catch (ClassNotFoundException e) {
			System.out
					.println("Não foi possível encontrar a classe com.mysql.jdbc.Driver");
		} catch (SQLException e) {
			System.out
					.println("Não foi possível estabelecer conexão com o banco");
		} finally {
			if (cn != null)
				try {
					cn.close();
				} catch (SQLException e) {
					System.out
							.println("Não foi possível fechar a conexão com o banco. Conexão já fechada");
				}
		}

		// 2 - You also need to catch SQLException for it to compile

	}
}

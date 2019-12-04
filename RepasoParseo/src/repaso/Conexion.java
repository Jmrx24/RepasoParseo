import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Conexion {

	static String usuario = "root";
	static String passwd = "";
	static String url="jdbc:mysql://localhost:3306/repaso?serverTimezone=UTC";
	static String driver="com.mysql.cj.jdbc.Driver";
	static Connection conex;

	
	public static void Acceder() {
		
		try {
			 Class.forName(driver);
			 conex=DriverManager.getConnection(url, usuario,passwd);
			 System.out.println("Conexión realizada a la base de datos con éxito.");
		} catch (Exception e) {
			 System.out.println(e.getLocalizedMessage());
		}
	}
	
	 public static Connection getConnection() {
	        return conex;
	    }

	public static void insertarDatos(ArrayList<Tráfico> lista) 
	{
		
	}
	 
	
	 
	
}

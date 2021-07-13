package Dal;
import java.sql.*;

public class Conexao {
    public static Connection conector(){
        java.sql.Connection conexao = null;
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/teste";
        String user = "root";
        String password = "";
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }
    
}

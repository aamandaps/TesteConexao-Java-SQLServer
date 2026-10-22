import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexaoSQLServer {
    
    private Connection c;
    
    public TesteConexaoSQLServer() {
        super();
    }
    
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        
        String hostName = "localhost";
        String dbName = "testeConnection"; 
        
        String user = "amanda"; 
        String senha = ""; 
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        String urlFormato = "jdbc:sqlserver://%s\\ESTUDOSSQL2;testeConnection=%s;encrypt=true;trustServerCertificate=true;";
        String urlConexao = String.format(urlFormato, hostName, dbName);
        
        
        c = DriverManager.getConnection(urlConexao, user, senha);
        
        return c;
    }
}


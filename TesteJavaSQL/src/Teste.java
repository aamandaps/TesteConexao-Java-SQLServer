import java.sql.Connection;
import java.sql.SQLException;

public class Teste {
    
    
    public static void main (String[] args) {
    
        TesteConexaoSQLServer testesql = new TesteConexaoSQLServer();
        
        try
        {
            Connection c = testesql.getConnection();
        
            String sgbd = c.getMetaData().getDatabaseProductName();
            System.out.println(sgbd);
        }
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println("Erro ao conectar");
        }
    }
    
    
}

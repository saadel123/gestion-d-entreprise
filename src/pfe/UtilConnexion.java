package pfe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class UtilConnexion {
    
    public static Connection seConnecter() throws Exception
    {
        Connection con=null;
        String url="jdbc:oracle:thin:@localhost:1521/XE";
        String user="moh";
        String mdp="moh";
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
           con=DriverManager.getConnection(url,user,mdp);
           return con;  
        }catch(ClassNotFoundException ex){
            throw new Exception("Impossible de charger le driver");
        }catch(SQLException e){
             throw new Exception("Problem de connexion "+e.getMessage());
        }
        
    }
}

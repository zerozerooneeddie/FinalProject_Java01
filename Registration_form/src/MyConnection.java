
import java.sql.Connection;
import java.sql.DriverManager;
        
/**
 *
 * @author Shortcourse
 */

public class MyConnection {
    
    //Database
    public static Connection getConnection(){
         Connection con = null;
       
         try{
       
        
 Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost/regform","root","");
    
        
        
    }catch (Exception ex){
    
            System.out.println(ex.getMessage());
    }
    
    
    return con;
    
    }
}

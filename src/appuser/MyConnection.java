/**
 * @author Edward F. 
 * GitHub - JavierBmrg
 * description - Singleton class for MySQL Connection !
 */
package appuser;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MyConnection {
    
    public Connection connect = null;            
    static private MyConnection instance = null;

        
    
    protected MyConnection()
    {       
        try {
            // This will load the MySQL driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB and Autocommit set false.
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/appuser?" + "user=root&password=root");
            connect.setAutoCommit(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), "Problem during connect !");
            System.exit(-1);
        }   
    }
    
        static MyConnection getInstance() 
        {
            if (null == instance) {
                instance = new MyConnection();
            }
            return instance;
        }

    
     
    
}

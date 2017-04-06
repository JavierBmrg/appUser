/**
 * @author Edward F. 
 * @GitHub - JavierBmrg
 */
package appuser;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AppResUser {
    
    public Integer idRestrict;
    public String userNameRestrict;
    
    boolean cntrlExistsRes;
    
    private final MyConnection db;
    
    public AppResUser(String userNameRestrict)
    {        
        this.userNameRestrict = userNameRestrict;
        
        this.db = MyConnection.getInstance();
    }
    
/**
 * This function validate if the name is restrited
 * @return boolean  
 */        
    
    public boolean validateIfExistsRes()
    {
         PreparedStatement pst ;
                  
        try {
            pst = this.db.connect.prepareStatement("select * from user_restrict where user_name_restrict = ?");
            pst.setString(1,this.userNameRestrict);
            ResultSet rs = pst.executeQuery();
            
            cntrlExistsRes = rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(AppForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return cntrlExistsRes;
    }
    
/**
 * This function insert restricted usernames. After validateIfExistsRes function.  
 */    
    
    public void insertRes()
    {       
        PreparedStatement pst;
        
        try{
            pst = this.db.connect.prepareStatement("insert into user_restrict (user_name_restrict) values(?)");
            pst.setString(1,this.userNameRestrict);
            
            pst.executeUpdate();
            this.db.connect.commit();
        
        } catch(SQLException ex) {
            Logger.getLogger(AppForm.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
        
   
    
    
    
}

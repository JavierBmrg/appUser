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



public class AppUser {
    
    
    public Integer idUser;
    public String  userName;
    private boolean cntrlExists;
    private Integer cntrlInsert;
    
    private final MyConnection db;
    
    public AppUser()
    {        
        this.db = MyConnection.getInstance();
    }
    
/**
 * This function validate if the name already exists 
 * @param userName
 * @return boolean  
 */    
    protected boolean validateIfExists(String userName)
    {
        PreparedStatement pst ;
        try {
            pst = this.db.connect.prepareStatement("select * from user where user_name = ?");
            pst.setString(1,userName);
            ResultSet rs = pst.executeQuery();
            
            cntrlExists = rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(AppForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return cntrlExists;
    }
    
    
/**
 * This function insert user, After validateIfExists function.
 * @return integer  
 */    
    protected Integer insertUser(String userName)
    {
        PreparedStatement pst;
        try{
            pst = this.db.connect.prepareStatement("insert into user (user_name) values(?)");
            pst.setString(1,userName);
            
            pst.executeUpdate();
            this.db.connect.commit();            
        } catch (SQLException ex){
            Logger.getLogger(AppForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return cntrlInsert;
    }        
                       
    
}

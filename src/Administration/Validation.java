/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administration;

import Connection.db_connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jcebalus
 */
public class Validation {
    
    private PreparedStatement PREPARED_STATEMENT = null;
    private ResultSet RESPONSE;
    private final db_connection CONNECTOR = new db_connection();
    
    public boolean validateUser(String user, String password){
        String SQL_QUERY = "SELECT password FROM partners WHERE user='"+user+"'";
        String p = null;
        try {
            PREPARED_STATEMENT = CONNECTOR.openConnection().prepareStatement(SQL_QUERY);
            RESPONSE = PREPARED_STATEMENT.executeQuery();
            
            while(RESPONSE.next()){
                p = RESPONSE.getString(1);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos");
        } finally {
            PREPARED_STATEMENT = null;
            RESPONSE = null;
            CONNECTOR.closeConnection();
        }    
        
        return password.equals(p);
    }
    
    public boolean validateAdmin(String password){
        String SQL_SELECT = "SELECT password FROM admin WHERE id=1";
        String admin_password = null;
        try {
            PREPARED_STATEMENT = CONNECTOR.openConnection().prepareStatement(SQL_SELECT);
            RESPONSE = PREPARED_STATEMENT.executeQuery();
            
            while(RESPONSE.next()){
                admin_password = RESPONSE.getString(1);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos");
        } finally {
            PREPARED_STATEMENT = null;
            RESPONSE = null;
            CONNECTOR.closeConnection();
        }
        
        
        return admin_password.equals(password);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jcebalus
 */
public class db_connection {
    
    private Connection CONNECTOR;
    //private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "misiontic";
    private static final String PASSWORD = "_-m1s10nTIC-_";
    private static final String URL = "jdbc:mysql://localhost:3306/library";

    public db_connection() {
        this.CONNECTOR = null;
    }
    
    public Connection openConnection(){
        try {
            Class.forName(DRIVER);
            CONNECTOR = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al establecer la conexión con la base de datos", JOptionPane.ERROR_MESSAGE);
        }
        return CONNECTOR;
    }
    
        public void closeConnection(){
        try {
            CONNECTOR.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al cerrar la conexión con la base de datos", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}


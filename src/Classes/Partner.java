/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Connection.db_connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author jcebalus
 */
public class Partner {
    private int id;
    private String user;
    private String password;
    private String name;
    private String telephone;
    private String email;
    private String address;
    private int borrowed_books;
    private int penalized_days;

    private final String SQL_INSERT = "INSERT INTO partners (user, password, name, telephone, email, address) VALUES (?,?,?,?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM partners";
    private PreparedStatement PREPARED_STATEMENT;
    private ResultSet RESPONSE;
    private final db_connection CONNECTOR;
    
    
    public Partner() {
        this.PREPARED_STATEMENT = null;
        this.CONNECTOR = new db_connection();
    }

    public Partner(String user, String password, String name, String telephone, String email, String address) {
        this.user = user;
        this.password = password;
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
        this.borrowed_books = 0;
        this.penalized_days = 0;
        this.PREPARED_STATEMENT = null;
        this.CONNECTOR = new db_connection();
    }

    private Partner(int id, String user, String password, String name, String telephone, String email, String address) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
        this.PREPARED_STATEMENT = null;
        this.CONNECTOR = new db_connection();
    }
    
    
    
    public void registerPartner(){
        try {
            PREPARED_STATEMENT = CONNECTOR.openConnection().prepareStatement(SQL_INSERT);
            PREPARED_STATEMENT.setString(1, this.user);
            PREPARED_STATEMENT.setString(2, this.password);
            PREPARED_STATEMENT.setString(3, this.name);
            PREPARED_STATEMENT.setString(4, this.telephone);
            PREPARED_STATEMENT.setString(5, this.email);
            PREPARED_STATEMENT.setString(6, this.address);
            
            int result = PREPARED_STATEMENT.executeUpdate();
            if(result > 0){
                JOptionPane.showMessageDialog(null, "Socio registrado con éxito.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al guardar registro en la base de datos", JOptionPane.ERROR_MESSAGE);
        } finally {
            PREPARED_STATEMENT = null;
            RESPONSE = null;
            CONNECTOR.closeConnection();
        }
    }
    
    public Partner searchByUser(String user){
        Partner partner = null;
        String SELECT_USER = "SELECT * FROM partners WHERE user='"+user+"'";
        try {
            PREPARED_STATEMENT = CONNECTOR.openConnection().prepareStatement(SELECT_USER);
            RESPONSE = PREPARED_STATEMENT.executeQuery();
            
            while (RESPONSE.next()){
                int partner_id = RESPONSE.getInt(1);
                String partner_user = RESPONSE.getString(2);
                String partner_password = RESPONSE.getString(3);
                String partner_name = RESPONSE.getString(4);
                String partner_telephone = RESPONSE.getString(5);
                String partner_email = RESPONSE.getString(6);
                String partner_address = RESPONSE.getString(7);

                partner = new Partner(partner_id, partner_user, partner_password, partner_name, partner_telephone, partner_email, partner_address);
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos");
        } finally {
            PREPARED_STATEMENT = null;
            RESPONSE = null;
            CONNECTOR.closeConnection();
        }

        return partner;
    }
    
    public Integer[] getPartnerStatus(String partner_user){
        String SQL_QUERY = "SELECT borrowed_books, penalized_days FROM `partners` WHERE user='"+partner_user+"'";
        Integer[] status = new Integer[2];
        try {
            PREPARED_STATEMENT = CONNECTOR.openConnection().prepareStatement(SQL_QUERY);
            RESPONSE = PREPARED_STATEMENT.executeQuery();
            while (RESPONSE.next()) {                
                status[0] = RESPONSE.getInt(1);
                status[1] = RESPONSE.getInt(2);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos");
        } finally {
            PREPARED_STATEMENT = null;
            RESPONSE = null;
            CONNECTOR.closeConnection();
        }

        return status;
    }
    
    public void upBorrowedBooks(int partner_id){
        int borrowed = 0;
        String SQL_QUERY_SELECT = "SELECT borrowed_books FROM `partners` WHERE id='" + partner_id + "'";
                
        try {
            PREPARED_STATEMENT = CONNECTOR.openConnection().prepareStatement(SQL_QUERY_SELECT);
            RESPONSE = PREPARED_STATEMENT.executeQuery();
            while (RESPONSE.next()) {                
                borrowed = RESPONSE.getInt(1);
            }
            borrowed++;

            String SQL_QUERY_UPDATE = "UPDATE `partners` SET borrowed_books = " + borrowed + " WHERE id = '" + partner_id + "'";

            PREPARED_STATEMENT = CONNECTOR.openConnection().prepareStatement(SQL_QUERY_UPDATE);
            int res = PREPARED_STATEMENT.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos");
        } finally {
            PREPARED_STATEMENT = null;
            RESPONSE = null;
            CONNECTOR.closeConnection();
        }
    }
    
    public void downBorrowedBooks(int partner_id){
        int borrowed = 0;
        String SQL_QUERY_SELECT = "SELECT borrowed_books FROM `partners` WHERE id='" + partner_id + "'";
                
        try {
            PREPARED_STATEMENT = CONNECTOR.openConnection().prepareStatement(SQL_QUERY_SELECT);
            RESPONSE = PREPARED_STATEMENT.executeQuery();
            while (RESPONSE.next()) {                
                borrowed = RESPONSE.getInt(1);
            }
            borrowed--;

            String SQL_QUERY_UPDATE = "UPDATE `partners` SET borrowed_books = " + borrowed + " WHERE id = '" + partner_id + "'";

            PREPARED_STATEMENT = CONNECTOR.openConnection().prepareStatement(SQL_QUERY_UPDATE);
            int res = PREPARED_STATEMENT.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos");
        } finally {
            PREPARED_STATEMENT = null;
            RESPONSE = null;
            CONNECTOR.closeConnection();
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PARTNER");
        sb.append("\nUser: ").append(user);
        sb.append("\nName: ").append(name);
        sb.append("\nTelephone: ").append(telephone);
        sb.append("\nEmail: ").append(email);
        sb.append("\nAddres: ").append(address);
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

}

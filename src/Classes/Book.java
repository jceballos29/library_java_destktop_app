/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Administration.Administration;
import Connection.db_connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author jcebalus
 */
public class Book {
    
    private final Administration admin = new Administration();
    
    private int id;
    private String name;
    private String type;
    private int author_id;
    private String editorial;
    private int year_publication;
    private String state;
    private int loan_partner_id;
    private String returns_date;

    private final String SQL_INSERT = "INSERT INTO books (name,type,author_id,editorial,year_publication) VALUES (?,?,?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM books";
    private PreparedStatement PREPARED_STATEMENT;
    private ResultSet RESPONSE;
    private final db_connection CONNECTOR;

    public Book() {
        this.PREPARED_STATEMENT = null;
        this.CONNECTOR = new db_connection();
    }        
    
    public Book(String name, String type, int author_id, String editorial, int year_publication) {
        this.name = name;
        this.type = type;
        this.author_id = author_id;
        this.editorial = editorial;
        this.year_publication = year_publication;
        this.state = "library";
        this.returns_date = null;
        this.PREPARED_STATEMENT = null;
        this.CONNECTOR = new db_connection();
    }

    public void resgisterBook(){
        try {
            PREPARED_STATEMENT = CONNECTOR.openConnection().prepareStatement(SQL_INSERT);
            PREPARED_STATEMENT.setString(1, this.name);
            PREPARED_STATEMENT.setString(2, this.type);
            PREPARED_STATEMENT.setInt(3, author_id);
            PREPARED_STATEMENT.setString(4, this.editorial);
            PREPARED_STATEMENT.setInt(5, this.year_publication);
            int result = PREPARED_STATEMENT.executeUpdate();
            if(result > 0){
                JOptionPane.showMessageDialog(null, "Libro registrado con éxito.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al guardar registro en la base de datos", JOptionPane.ERROR_MESSAGE);
        } finally {
            PREPARED_STATEMENT = null;
            RESPONSE = null;
            CONNECTOR.closeConnection();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(id);
        sb.append("\nType: ").append(type);
        sb.append("\nName: ").append(name);
        sb.append("\nAuthor Id: ").append(author_id);
        sb.append("\nEditorial: ").append(editorial);
        sb.append("\nYear of Publicatio: ").append(year_publication);
        sb.append("\nState: ").append(state);
        
        return sb.toString();
    }

   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Administration.Administration;
import Classes.Author;
import Connection.db_connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jcebalus
 */
public class Book {
    
    private final Administration admin = new Administration();
    private final Author author = new Author();
    private int id;
    private String name;
    private String type;
    private int author_id;
    private String editorial;
    private int year_publication;
    private String state;
    private int loan_partner_id;
    private String returns_date;
    private DefaultTableModel table;
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

    private Book(int id, String name, String type, int author_id, String editorial, int year_publication, String state) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.author_id = author_id;
        this.editorial = editorial;
        this.year_publication = year_publication;
        this.state = state;
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
    
    private void setTitles(){
        table = new DefaultTableModel();
        table.addColumn("id");
        table.addColumn("Nombre");
        table.addColumn("Tipo");
        table.addColumn("Autor");
        table.addColumn("Editorial");
        table.addColumn("Año");
        table.addColumn("Estado");
    }

    public DefaultTableModel getBooks(){
        try {
            setTitles();
            PREPARED_STATEMENT = CONNECTOR.openConnection().prepareStatement(SQL_SELECT);
            RESPONSE = PREPARED_STATEMENT.executeQuery();
            
            Object[] fila = new Object[7];
            while (RESPONSE.next()){
                fila[0] = RESPONSE.getInt(1);
                fila[1] = RESPONSE.getString(2);
                fila[2] = RESPONSE.getString(3);
                int i = RESPONSE.getInt(4);
                String author_name = this.author.searchNameById(i);
                fila[3] = author_name;
                fila[4] = RESPONSE.getString(5);
                fila[5] = RESPONSE.getString(6);
                fila[6] = RESPONSE.getString(7);
                table.addRow(fila);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos");
        } finally {
            PREPARED_STATEMENT = null;
            RESPONSE = null;
            CONNECTOR.closeConnection();
        }
        return table;
    }
    
    
    public ArrayList getBooksList(){
        ArrayList<Book> books_list;
        books_list = new ArrayList<>();
        
        try {
            PREPARED_STATEMENT = CONNECTOR.openConnection().prepareStatement(SQL_SELECT);
            RESPONSE = PREPARED_STATEMENT.executeQuery();
            
            while (RESPONSE.next()){
                int book_id = RESPONSE.getInt(1);
                String book_name = RESPONSE.getString(2);
                String book_type = RESPONSE.getString(3);
                int book_author_id = RESPONSE.getInt(4);
                String book_editorial = RESPONSE.getString(5);
                int book_year = RESPONSE.getInt(6);
                String book_state = RESPONSE.getString(7);
                books_list.add(new Book(book_id, book_name, book_type, book_author_id, book_editorial, book_year, book_state));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos");
        } finally {
            PREPARED_STATEMENT = null;
            RESPONSE = null;
            CONNECTOR.closeConnection();
        }
        
        return books_list;
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

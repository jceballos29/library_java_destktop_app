
package Classes;

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
public class Author {
    private int id;
    private String name;
    private String nationality;
    private String date_birth;
    private DefaultTableModel table;
    private final String SQL_INSERT = "INSERT INTO authors (name, nacionality, date_birth) VALUES (?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM authors";
    private PreparedStatement PREPARED_STATEMENT;
    private ResultSet RESPONSE;
    private final db_connection CONNECTOR;
    
    
    public Author() {
        this.PREPARED_STATEMENT = null;
        this.CONNECTOR = new db_connection();
    }

    public Author(String name, String nationalty, String date_birth) {
        this.name = name;
        this.nationality = nationalty;
        this.date_birth = date_birth;
        this.PREPARED_STATEMENT = null;
        this.CONNECTOR = new db_connection();
    }
    
    private Author(int id, String name, String nationalty, String date_birth) {
        this.id = id;
        this.name = name;
        this.nationality = nationalty;
        this.date_birth = date_birth;
        this.PREPARED_STATEMENT = null;
        this.CONNECTOR = new db_connection();
    }

    public ArrayList getAuthorsList() {    
        
        ArrayList<Author> authors_list;
        authors_list = new ArrayList<>();
        
        try {
            PREPARED_STATEMENT = CONNECTOR.openConnection().prepareStatement(SQL_SELECT);
            RESPONSE = PREPARED_STATEMENT.executeQuery();
            
            while (RESPONSE.next()){
                int author_id = RESPONSE.getInt(1);
                String autor_name = RESPONSE.getString(2);
                String autor_nationality = RESPONSE.getString(3);
                String autor_date_birth = RESPONSE.getString(4);
                authors_list.add(new Author(author_id, autor_name, autor_nationality, autor_date_birth));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos");
        } finally {
            PREPARED_STATEMENT = null;
            RESPONSE = null;
            CONNECTOR.closeConnection();
        }
        
        return authors_list;
    }
    
    public void resgisterAuthor(){
        try {
            PREPARED_STATEMENT = CONNECTOR.openConnection().prepareStatement(SQL_INSERT);
            PREPARED_STATEMENT.setString(1, this.name);
            PREPARED_STATEMENT.setString(2, this.nationality);
            PREPARED_STATEMENT.setString(3, this.date_birth);
            int result = PREPARED_STATEMENT.executeUpdate();
            if(result > 0){
                JOptionPane.showMessageDialog(null, "Autor registrado con ??xito.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al guardar registro en la base de datos", JOptionPane.ERROR_MESSAGE);
        } finally {
            PREPARED_STATEMENT = null;
            RESPONSE = null;
            CONNECTOR.closeConnection();
        }
    }
    
    public int searchIdByName(String name){
        ArrayList<Author> authors_list = this.getAuthorsList();
        int author_id = 0;
        for(int i = 0; i< authors_list.size(); i++){
            if(authors_list.get(i).getName().equals(name)){
                author_id = authors_list.get(i).getId();
            }
        }
       
        return author_id;
    }
    
    public String searchNameById(int id){
        ArrayList<Author> author_list = this.getAuthorsList();
        String author_name = null;
        for(int i = 0; i<author_list.size();i++){
            if(author_list.get(i).getId()==id){
                author_name = author_list.get(i).getName();
            }
        }
        return author_name;
    }
    
    public ArrayList getAuthorsNames(){
        ArrayList<String> authors_name;
        authors_name = new ArrayList<>();
        ArrayList<Author> authors_list = getAuthorsList();
        for(int i = 0; i < authors_list.size(); i++){
            authors_name.add(authors_list.get(i).getName());
        }
        return authors_name;
    }

    private void setTitles(){
        table = new DefaultTableModel();
        table.addColumn("id");
        table.addColumn("Nombre");
        table.addColumn("Nacionlidad");
        table.addColumn("Fecha de nacimiento");
    }
    
    public DefaultTableModel getAuthors(){
        try {
            setTitles();
            PREPARED_STATEMENT = CONNECTOR.openConnection().prepareStatement(SQL_SELECT);
            RESPONSE = PREPARED_STATEMENT.executeQuery();
            
            Object[] fila = new Object[4];
            while (RESPONSE.next()){
                fila[0] = RESPONSE.getInt(1);
                fila[1] = RESPONSE.getString(2);
                fila[2] = RESPONSE.getString(3);
                fila[3] = RESPONSE.getString(4);
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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    
}

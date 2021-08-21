package Library;

import Form.Index;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author jcebalus
 */
public class Library {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        System.out.println("LIBRARY");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Eror al aplicar estios del sistema", JOptionPane.ERROR_MESSAGE);
        }
        Index index = new Index();
        index.setVisible(true);
        
    }
    
}

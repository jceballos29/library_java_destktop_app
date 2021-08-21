package Form;

import Administration.Administration;
import Classes.Author;
import Classes.Book;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jcebalus
 */
public class Book_Registry extends javax.swing.JFrame {

    private Book book;
    private final Administration admin = new Administration();
    private final Author author  = new Author();
    private final ArrayList<Author> authors;
    private final String[] authors_names;
    
         
    public Book_Registry() {
        this.authors = author.getAuthorsList();
        this.authors_names = this.setAuthorsNameArray();
        initComponents();
        this.setLocationRelativeTo(null);
 
    }
    
    private void cleanFields(){
        this.name_field.setText("");
        this.editorial_field.setText("");
        this.type_field.setText("");
        this.year_field.setText("");
    }
    
    private String[] setAuthorsNameArray(){
        ArrayList<String> authors_names_helper;
        authors_names_helper = author.getAuthorsNames();
        Collections.sort(authors_names_helper);
        int index = authors_names_helper.size();
        String[] list = new String[index];
        for(int i = 0;i<index;i++){
            list[i] = authors_names_helper.get(i);
        }
        return list;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        type_label = new javax.swing.JLabel();
        type_field = new javax.swing.JTextField();
        author_label = new javax.swing.JLabel();
        editorial_label = new javax.swing.JLabel();
        editorial_field = new javax.swing.JTextField();
        year_label = new javax.swing.JLabel();
        year_field = new javax.swing.JTextField();
        addBook = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        author_field = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Agregar Libro");

        name_label.setText("Nombre");

        type_label.setText("Tipo");

        author_label.setText("Autor");

        editorial_label.setText("Editorial");

        year_label.setText("Año");

        addBook.setText("Agregar");
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });

        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        author_field.setModel(new javax.swing.DefaultComboBoxModel<String>(authors_names));
        author_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                author_fieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_label)
                            .addComponent(type_label)
                            .addComponent(author_label)
                            .addComponent(editorial_label)
                            .addComponent(year_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name_field, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(type_field)
                            .addComponent(editorial_field)
                            .addComponent(year_field, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(author_field, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addBook, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_label)
                    .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type_label)
                    .addComponent(type_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(author_label)
                    .addComponent(author_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editorial_label)
                    .addComponent(editorial_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(year_label)
                    .addComponent(year_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBook)
                    .addComponent(cancel))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        cleanFields();
        this.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
        // TODO add your handling code here:
        String name = this.name_field.getText();
        String author_name = this.author_field.getSelectedItem().toString();
        int author_id = this.author.searchIdByName(author_name);
        String editorial = this.editorial_field.getText();
        String type = this.type_field.getText();
        int year = Integer.parseInt(this.year_field.getText());
        
        book = new Book(name, type, author_id, editorial, year);
        book.resgisterBook();
        
        cleanFields();
        this.setVisible(false);
    }//GEN-LAST:event_addBookActionPerformed

    private void author_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_author_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_author_fieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBook;
    private javax.swing.JComboBox<String> author_field;
    private javax.swing.JLabel author_label;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField editorial_field;
    private javax.swing.JLabel editorial_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name_field;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField type_field;
    private javax.swing.JLabel type_label;
    private javax.swing.JTextField year_field;
    private javax.swing.JLabel year_label;
    // End of variables declaration//GEN-END:variables
}

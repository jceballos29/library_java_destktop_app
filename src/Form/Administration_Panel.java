/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Classes.Author;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author jcebalus
 */
public class Administration_Panel extends javax.swing.JFrame {
      
    
    /**
     * Creates new form Administration_Panel
     */
    public Administration_Panel() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

//Author_Registry author_registry = new Author_Registry();
    //Book_Registry book_registry = new Book_Registry();
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        exit_button = new javax.swing.JButton();
        add_author_button = new javax.swing.JButton();
        add_book_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );

        title.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        title.setText("PANEL DE ADMINISTRACIÓN");

        exit_button.setText("Salir");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        add_author_button.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        add_author_button.setText("Agregar Autor");
        add_author_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_author_buttonActionPerformed(evt);
            }
        });

        add_book_button.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        add_book_button.setText("Agregar Libro");
        add_book_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_book_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_author_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_book_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(30, 30, 30)
                        .addComponent(add_author_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(add_book_button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit_button))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_author_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_author_buttonActionPerformed
        // TODO add your handling code here:
        Author_Registry author_registry = new Author_Registry();
        author_registry.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        author_registry.setVisible(true);
    }//GEN-LAST:event_add_author_buttonActionPerformed

    private void add_book_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_book_buttonActionPerformed
        // TODO add your handling code here:
        Book_Registry book_registry = new Book_Registry();
        Author author = new Author();;
        ArrayList<String> authors;
        authors = author.getAuthorsList();
        if(authors.size()> 0){
            book_registry.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            book_registry.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No hay autores registrados.\n\nPor favor registre al menos un autor\npara poder registrar un libro.\n");
        }
    }//GEN-LAST:event_add_book_buttonActionPerformed

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        // TODO add your handling code here:
        Index index  = new Index();
        this.setVisible(false);
        index.setVisible(true);
        
    }//GEN-LAST:event_exit_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_author_button;
    private javax.swing.JButton add_book_button;
    private javax.swing.JButton exit_button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}

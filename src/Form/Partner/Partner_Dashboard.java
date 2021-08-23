
package Form.Partner;

import Classes.Book;
import Classes.Partner;
import Classes.Author;
import Form.Index;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jcebalus
 */
public class Partner_Dashboard extends javax.swing.JFrame {

    private final Author main_author;
    private final Book main_book;
    private final Partner main_partner;
    private final Partner partner;
    private final String user;
    private int partner_id;
    private int book_id;
    private String name;
    private int borrowed_books;
    private int penalizad_days;
    
    DefaultComboBoxModel<String> booksOnLibrary = new DefaultComboBoxModel<>();
    private DefaultTableModel table;
    
    public Partner_Dashboard(String user) {
        this.user = user;
        initComponents();
        this.setLocationRelativeTo(null);
        this.main_author = new Author();
        this.main_book = new Book();
        this.main_partner = new Partner();
        this.partner = main_partner.searchByUser(this.user);
        //this.books_on_library = this.main_book.getBooksOnLibrary();
        this.setPartnerInformation();
        this.setPartnerLoanInformation();
        this.setPartnerBooksTable();
        this.setBooksOnLibraryList();
        this.books_available.setModel(booksOnLibrary);
        this.returns_book_button.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sign_off_button = new javax.swing.JButton();
        name_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        user_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        telephone_label = new javax.swing.JLabel();
        address_label = new javax.swing.JLabel();
        borrowed_books_label = new javax.swing.JLabel();
        penalized_days_label = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        returns_book_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        books_available = new javax.swing.JComboBox<>();
        loan_book_button = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1020, 520));

        jPanel1.setBackground(new java.awt.Color(156, 156, 156));

        sign_off_button.setText("Cerrar Sesión");
        sign_off_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_off_buttonActionPerformed(evt);
            }
        });

        name_label.setBackground(new java.awt.Color(156, 156, 156));
        name_label.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        name_label.setForeground(java.awt.SystemColor.activeCaptionText);
        name_label.setText("Partner's Name");

        jLabel1.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabel1.setText("Usuario");

        jLabel2.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabel2.setText("Correo Electrónico");

        jLabel3.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabel3.setText("Número Telefónico");

        jLabel4.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabel4.setText("Dirección");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(1, 1, 1));
        jLabel5.setText("Libros Prestados");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(1, 1, 1));
        jLabel6.setText("Días Penalizado");

        user_label.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        user_label.setForeground(new java.awt.Color(1, 1, 1));
        user_label.setText("Usuario");

        email_label.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        email_label.setForeground(new java.awt.Color(1, 1, 1));
        email_label.setText("partner@email.com");

        telephone_label.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        telephone_label.setForeground(new java.awt.Color(1, 1, 1));
        telephone_label.setText("1234567890");

        address_label.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        address_label.setForeground(new java.awt.Color(1, 1, 1));
        address_label.setText("CL 0 # 00 - 00");

        borrowed_books_label.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        borrowed_books_label.setForeground(new java.awt.Color(1, 1, 1));
        borrowed_books_label.setText("0");

        penalized_days_label.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        penalized_days_label.setForeground(new java.awt.Color(1, 1, 1));
        penalized_days_label.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(user_label)
                                    .addComponent(email_label)
                                    .addComponent(telephone_label)
                                    .addComponent(address_label)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(name_label))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(sign_off_button, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 78, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jSeparator3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(borrowed_books_label)
                                    .addComponent(penalized_days_label))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(name_label)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(user_label))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(email_label))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(telephone_label))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(address_label))
                .addGap(24, 24, 24)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(borrowed_books_label))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(penalized_days_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sign_off_button)
                .addContainerGap())
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel7.setText("Mis Libros");

        returns_book_button.setText("Devolver Libro");
        returns_book_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returns_book_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returns_book_button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(returns_book_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel8.setText("Prestar Libro");

        books_available.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        loan_book_button.setText("Prestar Libro");
        loan_book_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loan_book_buttonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel9.setText("Libros Disponibles");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(books_available, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loan_book_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(books_available, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loan_book_button)
                    .addComponent(jLabel9))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setPartnerInformation(){
        this.partner_id = this.partner.getId();
        this.name_label.setText(this.partner.getName());
        this.user_label.setText(this.partner.getUser());
        this.email_label.setText(this.partner.getEmail());
        this.telephone_label.setText(this.partner.getTelephone());
        this.address_label.setText(this.partner.getAddress());
    }
    
    private void setPartnerLoanInformation(){
        Integer[] status = main_partner.getPartnerStatus(this.user);
        this.borrowed_books = status[0];
        this.penalizad_days = status[1];
        this.borrowed_books_label.setText(String.valueOf(this.borrowed_books));
        this.penalized_days_label.setText(String.valueOf(penalizad_days = status[1]));
    }
    
    private void setTitles(){
        table = new DefaultTableModel();
        table.addColumn("id");
        table.addColumn("Nombre");
        table.addColumn("Autor");
        table.addColumn("Fecha de devolución");
    }
    
    private void setPartnerBooksTable(){
        ArrayList<Book> partner_books = main_book.getPartnerBooks(this.partner_id);
        Object[] row = new Object[4];
        setTitles();
        for (int i = 0; i < partner_books.size(); i++){
            row[0] = partner_books.get(i).getId();
            row[1] = partner_books.get(i).getName();
            String author_name = this.main_author.searchNameById(partner_books.get(i).getAuthor_id());
            row[2] = author_name;
            row[3] = partner_books.get(i).getReturns_date();
            this. table.addRow(row);
        }
        
        this.jTable2.setModel(this.table);
    }

    private void setBooksOnLibraryList(){
        ArrayList<Book> books_on_library = this.main_book.getBooksOnLibrary();
        for(int i = 0; i< books_on_library.size(); i++){
            booksOnLibrary.addElement(books_on_library.get(i).getName());
        }
        
    }
    
    private void sign_off_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_off_buttonActionPerformed
        // TODO add your handling code here:
        Index index = new Index();
        this.setVisible(false);
        this.dispose();
        index.setVisible(true);
    }//GEN-LAST:event_sign_off_buttonActionPerformed

    private void loan_book_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loan_book_buttonActionPerformed
        // TODO add your handling code here:
        String name_book = books_available.getSelectedItem().toString();
        this.main_book.loanBook(name_book, this.partner_id);
        this.main_partner.upBorrowedBooks(partner_id);
        this.booksOnLibrary.removeElement(name_book);
        this.setPartnerLoanInformation();
        this.setPartnerBooksTable();
    }//GEN-LAST:event_loan_book_buttonActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int row = jTable2.getSelectedRow();
        this.book_id = (int) jTable2.getValueAt(row, 0);
        this.name = (String) jTable2.getValueAt(row, 1);
        this.returns_book_button.setEnabled(true);
    }//GEN-LAST:event_jTable2MouseClicked

    private void returns_book_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returns_book_buttonActionPerformed
        // TODO add your handling code here:
        this.main_book.returnBook(this.book_id);
        this.main_partner.downBorrowedBooks(partner_id);
        this.booksOnLibrary.addElement(name);
        this.setPartnerLoanInformation();
        this.setPartnerBooksTable();
    }//GEN-LAST:event_returns_book_buttonActionPerformed
   
    /*   private String[] getArrayBooksOnLibrary(){
    String[] list = new String[books_on_library.size()];
    for(int i = 0; i < books_on_library.size(); i++){
    list[i] = books_on_library.get(i).getName();
    }
    return list;
    }*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address_label;
    private javax.swing.JComboBox<String> books_available;
    private javax.swing.JLabel borrowed_books_label;
    private javax.swing.JLabel email_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton loan_book_button;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel penalized_days_label;
    private javax.swing.JButton returns_book_button;
    private javax.swing.JButton sign_off_button;
    private javax.swing.JLabel telephone_label;
    private javax.swing.JLabel user_label;
    // End of variables declaration//GEN-END:variables
}

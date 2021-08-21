/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

/**
 *
 * @author jcebalus
 */
public class user_data extends javax.swing.JPanel {

    private String user;
    private String password;
    private String confirm_password;
    
    public user_data() {
        initComponents();
        this.user_field.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        title = new javax.swing.JLabel();
        user_label = new javax.swing.JLabel();
        user_field = new javax.swing.JTextField();
        password_label = new javax.swing.JLabel();
        password_field = new javax.swing.JPasswordField();
        confirm_password_label = new javax.swing.JLabel();
        conrifm_password_field = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(323, 328));

        title.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        title.setText("Datos de Usuario");

        user_label.setText("Ususario");

        password_label.setText("Contraseña");

        confirm_password_label.setText("Confirmar Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(title)
                    .addComponent(user_label)
                    .addComponent(user_field, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(password_label)
                    .addComponent(password_field)
                    .addComponent(confirm_password_label)
                    .addComponent(conrifm_password_field)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(title)
                .addGap(28, 28, 28)
                .addComponent(user_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(password_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirm_password_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conrifm_password_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel confirm_password_label;
    private javax.swing.JPasswordField conrifm_password_field;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JLabel password_label;
    private javax.swing.JLabel title;
    private javax.swing.JTextField user_field;
    private javax.swing.JLabel user_label;
    // End of variables declaration//GEN-END:variables

    public String getPassword() {
        this.password = String.valueOf(this.password_field.getPassword());
        return this.password;
    }

    public String getUser() {
        this.user = user_field.getText();
        return user;
    }

    public String getConfirm_password() {
        this.confirm_password = String.valueOf(this.conrifm_password_field.getPassword());
        return this.confirm_password;
    }
    
    public void cleanPaswordField(){
        this.password_field.setText("");
        this.conrifm_password_field.setText("");
    }
    
    public void cleanFields(){
        this.user_field.setText("");
        this.password_field.setText("");
        this.conrifm_password_field.setText("");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form.Partner;

/**
 *
 * @author jcebalus
 */
public class personal_information extends javax.swing.JPanel {

    private String name;
    private String telephone;
    private String email;
    private String addres; 
    
    public personal_information() {
        initComponents();
        this.name_field.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        telephone_label = new javax.swing.JLabel();
        telephone_field = new javax.swing.JTextField();
        emial_label = new javax.swing.JLabel();
        email_field = new javax.swing.JTextField();
        address_label = new javax.swing.JLabel();
        address_field = new javax.swing.JTextField();

        title.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        title.setText("Información Personal");

        name_label.setText("Nombre");

        telephone_label.setText("Telefono");

        emial_label.setText("Correo Electrónico");

        address_label.setText("Dirección");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(address_label)
                    .addComponent(emial_label)
                    .addComponent(telephone_label)
                    .addComponent(name_label)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name_field)
                    .addComponent(telephone_field)
                    .addComponent(email_field)
                    .addComponent(address_field))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(name_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(telephone_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telephone_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emial_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(address_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(address_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_field;
    private javax.swing.JLabel address_label;
    private javax.swing.JTextField email_field;
    private javax.swing.JLabel emial_label;
    private javax.swing.JTextField name_field;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField telephone_field;
    private javax.swing.JLabel telephone_label;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    public String getUserName() {
        this.name = this.name_field.getText();
        return this.name;
    }

    public String getTelephone() {
        this.telephone = this.telephone_field.getText();
        return this.telephone;
    }

    public String getEmail() {
        this.email = this.email_field.getText();
        return this.email;
    }

    public String getAddres() {
        this.addres = this.address_field.getText();
        return addres;
    }
    
    public void cleanFields(){
        this.name_field.setText("");
        this.telephone_field.setText("");
        this.email_field.setText("");
        this.address_field.setText("");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import javax.swing.JOptionPane;

/**
 *
 * @author jcebalus
 */
public class Partner_Registry extends javax.swing.JFrame {
    
    user_data user_data = new user_data();
    personal_information personal_info = new personal_information();
    Index index = new Index();
    
    private String user;
    private String password;
    private String confirm_password;
    private String name;
    private String telephone;
    private String email;
    private String addres; 
    
    public Partner_Registry() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                
        this.sign_up_button.setEnabled(false);
        container.add(user_data);
        container.add(personal_info);
        user_data.setSize(330, 328);
        personal_info.setSize(330, 328);
        user_data.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sign_up_button = new javax.swing.JButton();
        next_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sign_up_button.setText("Registrar");
        sign_up_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_up_buttonActionPerformed(evt);
            }
        });

        next_button.setText("Siguiente");
        next_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_buttonActionPerformed(evt);
            }
        });

        cancel_button.setText("Cancelar");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sign_up_button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(next_button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sign_up_button)
                    .addComponent(next_button)
                    .addComponent(cancel_button))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void next_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_buttonActionPerformed
        // TODO add your handling code here:
        this.user = user_data.getUser();
        this.password = user_data.getPassword();
        this.confirm_password = user_data.getConfirm_password();

        if(password.equals(confirm_password)){
            this.sign_up_button.setEnabled(true);
            this.next_button.setEnabled(false);
            user_data.setVisible(false);
            user_data.cleanFields();
            personal_info.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden");
            user_data.cleanPaswordField();
        }
    }//GEN-LAST:event_next_buttonActionPerformed

    private void sign_up_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_up_buttonActionPerformed
        // TODO add your handling code here:
        this.name = personal_info.getUserName();
        this.telephone = personal_info.getTelephone();
        this.email = personal_info.getEmail();
        this.addres = personal_info.getAddres();
        
        JOptionPane.showMessageDialog(this, this.toString());
        this.setVisible(false);
        index.setVisible(true);
    }//GEN-LAST:event_sign_up_buttonActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        // TODO add your handling code here:
        user_data.cleanFields();
        personal_info.cleanFields();
        this.setVisible(false);
        index.setVisible(true);
    }//GEN-LAST:event_cancel_buttonActionPerformed

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PARTNER");
        sb.append("\nUser: ").append(user);
        sb.append("\nName: ").append(name);
        sb.append("\nTelephone: ").append(telephone);
        sb.append("\nEmail: ").append(email);
        sb.append("\nAddres: ").append(addres);
        return sb.toString();
    }
    
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_button;
    private javax.swing.JPanel container;
    private javax.swing.JButton next_button;
    private javax.swing.JButton sign_up_button;
    // End of variables declaration//GEN-END:variables
}

package panels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import static panels.UpdateEmployePanel.DB_URL;
import static panels.UpdateEmployePanel.PASS;
import static panels.UpdateEmployePanel.USER;

public class UpdateSupplierPanel extends javax.swing.JPanel {

    public UpdateSupplierPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        updatedSupName = new javax.swing.JTextField();
        updatedSupContact = new javax.swing.JTextField();
        updatedSupSupplies = new javax.swing.JTextField();
        supIDCombobox = new javax.swing.JComboBox<>();
        fetchButton = new javax.swing.JButton();
        updateSupButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 51, 51));
        jLabel36.setText("Supplier ID");

        jLabel37.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 51, 51));
        jLabel37.setText("Updated Name");

        jLabel38.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 51, 51));
        jLabel38.setText("Updated Contact");

        jLabel39.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 51, 51));
        jLabel39.setText("Supplies");

        updatedSupName.setBackground(new java.awt.Color(242, 242, 242));
        updatedSupName.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        updatedSupContact.setBackground(new java.awt.Color(242, 242, 242));
        updatedSupContact.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        updatedSupSupplies.setBackground(new java.awt.Color(242, 242, 242));
        updatedSupSupplies.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        supIDCombobox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                supIDComboboxItemStateChanged(evt);
            }
        });

        fetchButton.setText("Fetch");
        fetchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchButtonActionPerformed(evt);
            }
        });

        updateSupButton.setBackground(new java.awt.Color(0, 0, 0));
        updateSupButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        updateSupButton.setForeground(new java.awt.Color(255, 255, 255));
        updateSupButton.setText("Update");
        updateSupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSupButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateSupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updatedSupName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatedSupContact, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatedSupSupplies, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(supIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(fetchButton)))
                        .addGap(273, 273, 273))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fetchButton))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatedSupName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatedSupContact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatedSupSupplies, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(updateSupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fetchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchButtonActionPerformed
       int supID = Integer.parseInt(supIDCombobox.getSelectedItem().toString());

        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            String query = "select * from suppliers where Supplier_Id=" + supID;
            ResultSet rs = statement.executeQuery(query);
            String selectedValue = supIDCombobox.getSelectedItem().toString();
                while (rs.next()) {
                    String name = rs.getString("Name");
                    String contact = String.valueOf(rs.getLong("Contact_No"));
                    String supplies = rs.getString("Supplies");
                    updatedSupName.setText(name);
                    updatedSupContact.setText(contact);
                    updatedSupSupplies.setText(supplies);
                
            }

        } catch (SQLException se) {
            se.printStackTrace();
        }
    }//GEN-LAST:event_fetchButtonActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            String query = "select Supplier_ID from suppliers";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String id = String.valueOf(resultSet.getInt("Supplier_ID"));
                if (((DefaultComboBoxModel) supIDCombobox.getModel()).getIndexOf(id) == -1) {
                    supIDCombobox.addItem(id);
                }
            }

        } catch (SQLException se) {
            se.printStackTrace();
        }
    }//GEN-LAST:event_formMouseEntered

    private void updateSupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSupButtonActionPerformed
           int id = Integer.parseInt(supIDCombobox.getSelectedItem().toString());
        String name = updatedSupName.getText();
        long contact = Long.parseLong(updatedSupContact.getText());
        String supplies = updatedSupSupplies.getText();
        
        try{
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            String query = "update suppliers set Name='"+name+"', Contact_no="+contact+", Supplies='"+supplies+"' where Supplier_ID="+id;
            statement.executeUpdate(query);
        }
        catch(SQLException se){
            se.printStackTrace();
        }
       
    }//GEN-LAST:event_updateSupButtonActionPerformed

    private void supIDComboboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_supIDComboboxItemStateChanged
        int supID = Integer.parseInt(supIDCombobox.getSelectedItem().toString());

        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            String query = "select * from suppliers where Supplier_Id=" + supID;
            ResultSet rs = statement.executeQuery(query);
            String selectedValue = supIDCombobox.getSelectedItem().toString();
            while (rs.next()) {
                String name = rs.getString("Name");
                String contact = String.valueOf(rs.getLong("Contact_No"));
                String supplies = rs.getString("Supplies");
                updatedSupName.setText(name);
                updatedSupContact.setText(contact);
                updatedSupSupplies.setText(supplies);

            }

        } catch (SQLException se) {
            se.printStackTrace();
        }
    }//GEN-LAST:event_supIDComboboxItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fetchButton;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JComboBox<String> supIDCombobox;
    private javax.swing.JButton updateSupButton;
    private javax.swing.JTextField updatedSupContact;
    private javax.swing.JTextField updatedSupName;
    private javax.swing.JTextField updatedSupSupplies;
    // End of variables declaration//GEN-END:variables
}

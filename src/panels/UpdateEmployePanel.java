package panels;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class UpdateEmployePanel extends javax.swing.JPanel {

    static final String DB_URL = "jdbc:mysql://localhost/sai_leela_caterers";
    static final String USER = "root";
    static final String PASS = "1234";

    public UpdateEmployePanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        updateEmpButton = new javax.swing.JButton();
        updatedEmpName = new javax.swing.JTextField();
        updatedEmpContact = new javax.swing.JTextField();
        updatedEmpAdd = new javax.swing.JTextField();
        updatedEmpDesgn = new javax.swing.JTextField();
        empIDCombobox = new javax.swing.JComboBox<>();
        errorLabel = new javax.swing.JLabel();
        fetchButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 51, 51));
        jLabel26.setText("Enter ID");

        jLabel27.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 51, 51));
        jLabel27.setText("Enter Name");

        jLabel28.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 51, 51));
        jLabel28.setText("Enter Contact");

        jLabel29.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 51, 51));
        jLabel29.setText("Enter Address");

        jLabel30.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 51, 51));
        jLabel30.setText("Enter Designation");

        updateEmpButton.setBackground(new java.awt.Color(0, 0, 0));
        updateEmpButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        updateEmpButton.setForeground(new java.awt.Color(255, 255, 255));
        updateEmpButton.setText("Update");
        updateEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmpButtonActionPerformed(evt);
            }
        });

        updatedEmpName.setBackground(new java.awt.Color(242, 242, 242));
        updatedEmpName.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        updatedEmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatedEmpNameActionPerformed(evt);
            }
        });

        updatedEmpContact.setBackground(new java.awt.Color(242, 242, 242));
        updatedEmpContact.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        updatedEmpAdd.setBackground(new java.awt.Color(242, 242, 242));
        updatedEmpAdd.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        updatedEmpDesgn.setBackground(new java.awt.Color(242, 242, 242));
        updatedEmpDesgn.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        errorLabel.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 51, 51));

        fetchButton.setText("Fetch");
        fetchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updatedEmpDesgn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updatedEmpAdd)
                                    .addComponent(updatedEmpName)
                                    .addComponent(updatedEmpContact)
                                    .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(empIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(fetchButton)))))
                        .addGap(164, 164, 164))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(empIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fetchButton))
                .addGap(30, 30, 30)
                .addComponent(errorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatedEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatedEmpContact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatedEmpAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatedEmpDesgn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(updateEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updatedEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatedEmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatedEmpNameActionPerformed

    private void updateEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmpButtonActionPerformed
           
        int id = Integer.parseInt(empIDCombobox.getSelectedItem().toString());
        String name = updatedEmpName.getText();
        long contact = Long.parseLong(updatedEmpContact.getText());
        String address = updatedEmpAdd.getText();
        String designation = updatedEmpDesgn.getText();
         try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            String query = "update employees set Name='"+name+"', Contact_no="+contact+", Address='"+address+"', Designati"
                    + "on='"+designation+"' where Emp_ID="+id;
            statement.executeUpdate(query);
         }
         catch(SQLException se){
             se.printStackTrace();
         }
    }//GEN-LAST:event_updateEmpButtonActionPerformed

    private void fetchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchButtonActionPerformed
        int empID = Integer.parseInt(empIDCombobox.getSelectedItem().toString());

        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            String query = "select * from employees where Emp_Id=" + empID;
            ResultSet rs = statement.executeQuery(query);
            String selectedValue = empIDCombobox.getSelectedItem().toString();
            if (selectedValue.equals("Select Employee ID")) {
                errorLabel.setText("Select ID");

            } else {
                while (rs.next()) {
                    String name = rs.getString("Name");
                    String contact = String.valueOf(rs.getLong("Contact_No"));
                    String address = rs.getString("Address");
                    String desgn = rs.getString("Designation");
                    updatedEmpName.setText(name);
                    updatedEmpContact.setText(contact);
                    updatedEmpAdd.setText(address);
                    updatedEmpDesgn.setText(desgn);
                }
            }

        } catch (SQLException se) {
            se.printStackTrace();
        }
    }//GEN-LAST:event_fetchButtonActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            String query = "select EMP_ID from employees";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String id = String.valueOf(resultSet.getInt("Emp_ID"));
                if (((DefaultComboBoxModel) empIDCombobox.getModel()).getIndexOf(id) == -1) {
                    empIDCombobox.addItem(id);
                }
            }

        } catch (SQLException se) {
            se.printStackTrace();
        }
    }//GEN-LAST:event_formMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> empIDCombobox;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton fetchButton;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JButton updateEmpButton;
    private javax.swing.JTextField updatedEmpAdd;
    private javax.swing.JTextField updatedEmpContact;
    private javax.swing.JTextField updatedEmpDesgn;
    private javax.swing.JTextField updatedEmpName;
    // End of variables declaration//GEN-END:variables
}

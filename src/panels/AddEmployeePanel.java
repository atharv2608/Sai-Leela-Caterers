package panels;
import java.sql.*;
import javax.swing.JOptionPane;
public class AddEmployeePanel extends javax.swing.JPanel {
    static final String DB_URL = "jdbc:mysql://localhost/sai_leela_caterers";
    static final String USER = "root";
    static final String PASS = "1234";
    Methods methods = new Methods();
    public AddEmployeePanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel14 = new javax.swing.JLabel();
        empAddress = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        empContact = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        empDesgn = new javax.swing.JTextField();
        addEmpButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        empName = new javax.swing.JTextField();
        mainErrorLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 51));
        jLabel14.setText("Designation");

        empAddress.setBackground(new java.awt.Color(242, 242, 242));
        empAddress.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 51));
        jLabel15.setText("Enter Contact ");

        empContact.setBackground(new java.awt.Color(242, 242, 242));
        empContact.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 51));
        jLabel16.setText("Enter Address");

        empDesgn.setBackground(new java.awt.Color(242, 242, 242));
        empDesgn.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        addEmpButton.setBackground(new java.awt.Color(0, 0, 0));
        addEmpButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        addEmpButton.setForeground(new java.awt.Color(255, 255, 255));
        addEmpButton.setText("Add Employee");
        addEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmpButtonActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 51));
        jLabel13.setText("Enter Name");

        empName.setBackground(new java.awt.Color(242, 242, 242));
        empName.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        mainErrorLabel.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        mainErrorLabel.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empContact, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empDesgn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addEmpButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                        .addComponent(mainErrorLabel)
                        .addGap(232, 232, 232))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empContact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empDesgn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmpButtonActionPerformed
        final String name = empName.getText();
        final String con = empContact.getText();       
        final String address = empAddress.getText();
        final String designation = empDesgn.getText();

        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            
            if(name.equals("") || con.equals("") || address.equals("") || designation.equals("")){
                mainErrorLabel.setText("Please fill all details");
            }
            else{
                final long contact = Long.parseLong(con);
                String query = "Insert into employees(Name, Contact_No, Address, Designation) " + "values('" + name + "', '" + contact + "', '" + address + "', '" + designation + "')";
                statement.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Employee Inserted",
                                          "Successful",
                                          JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (SQLException se) {
            se.printStackTrace();
        }
        new java.util.Timer().schedule(
            new java.util.TimerTask() {
                @Override
                public void run() {
                    empName.setText("");
                    empContact.setText("");
                    empAddress.setText("");
                    empDesgn.setText("");
                }
            },
            2000
        );
    }//GEN-LAST:event_addEmpButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmpButton;
    private javax.swing.JTextField empAddress;
    private javax.swing.JTextField empContact;
    private javax.swing.JTextField empDesgn;
    private javax.swing.JTextField empName;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel mainErrorLabel;
    // End of variables declaration//GEN-END:variables
}

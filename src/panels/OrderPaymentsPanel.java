
package panels;
import java.sql.*;
import java.text.SimpleDateFormat;
public class OrderPaymentsPanel extends javax.swing.JPanel {
    static final String DB_URL = "jdbc:mysql://localhost/sai_leela_caterers";
    static final String USER = "root";
    static final String PASS = "1234";
    
    

    public OrderPaymentsPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel29 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        paymentOrderID = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        amountPaid = new javax.swing.JTextField();
        outstandingBalance = new javax.swing.JTextField();
        searchEmpButton1 = new javax.swing.JButton();
        paymentModeCombo = new javax.swing.JComboBox<>();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Lucida Handwriting", 0, 22)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 156, 186));
        jLabel29.setText("Payment");

        jLabel63.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 51, 51));
        jLabel63.setText("Order ID");

        paymentOrderID.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        paymentOrderID.setForeground(new java.awt.Color(0, 51, 51));
        paymentOrderID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel64.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 51, 51));
        jLabel64.setText("Payment Mode");

        jLabel65.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 51, 51));
        jLabel65.setText("Amount");

        jLabel66.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 51, 51));
        jLabel66.setText("Oustanding Balance");

        amountPaid.setBackground(new java.awt.Color(242, 242, 242));
        amountPaid.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        outstandingBalance.setBackground(new java.awt.Color(242, 242, 242));
        outstandingBalance.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        searchEmpButton1.setBackground(new java.awt.Color(0, 0, 0));
        searchEmpButton1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        searchEmpButton1.setForeground(new java.awt.Color(255, 255, 255));
        searchEmpButton1.setText("Add");
        searchEmpButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEmpButton1ActionPerformed(evt);
            }
        });

        paymentModeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "UPI", "Credit/Debit Card" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchEmpButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(outstandingBalance)
                            .addComponent(paymentOrderID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amountPaid)
                            .addComponent(paymentModeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(333, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(amountPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentModeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outstandingBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(searchEmpButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        try{
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            String query = "select Order_ID from orders ORDER BY Order_ID DESC LIMIT 1";
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                String orderID = String.valueOf(rs.getInt("Order_ID"));
                paymentOrderID.setText(orderID);
            }
        }
        catch(SQLException se){
            
        }
    }//GEN-LAST:event_formMouseEntered

    private void searchEmpButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchEmpButton1ActionPerformed
        int orderID = Integer.parseInt(paymentOrderID.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Timestamp currentDate = new java.sql.Timestamp(new java.util.Date().getTime());
        String paymentDate = sdf.format(currentDate);
        double amount = Double.parseDouble(amountPaid.getText());
        String paymentMode = paymentModeCombo.getSelectedItem().toString();
        double outstanding = Double.parseDouble(outstandingBalance.getText());
        
        
        try{
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String query = "insert into order_payment values(?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, orderID);
            ps.setString(2, paymentDate);
            ps.setDouble(3, amount);
            ps.setString(4, paymentMode);
            ps.setDouble(5, outstanding);
            ps.executeUpdate();
            
        }
        catch(SQLException se){
            
        }
    }//GEN-LAST:event_searchEmpButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountPaid;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JTextField outstandingBalance;
    private javax.swing.JComboBox<String> paymentModeCombo;
    private javax.swing.JLabel paymentOrderID;
    private javax.swing.JButton searchEmpButton1;
    // End of variables declaration//GEN-END:variables
}

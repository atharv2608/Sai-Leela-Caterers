
package panels;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class ViewEmployeesPanel extends javax.swing.JPanel {
    Methods methods = new Methods();
    static final String DB_URL = "jdbc:mysql://localhost/sai_leela_caterers";
    static final String USER = "root";
    static final String PASS = "1234";

    public ViewEmployeesPanel() {
        initComponents();
        methods.designTable(employeeSearchTable, 25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel31 = new javax.swing.JLabel();
        searchEmpButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        employeeSearchTable = new javax.swing.JTable();
        empIDCombobox = new javax.swing.JComboBox<>();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 51, 51));
        jLabel31.setText("ID of the Employee");

        searchEmpButton.setBackground(new java.awt.Color(0, 0, 0));
        searchEmpButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        searchEmpButton.setForeground(new java.awt.Color(255, 255, 255));
        searchEmpButton.setText("Search");
        searchEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEmpButtonActionPerformed(evt);
            }
        });

        employeeSearchTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        employeeSearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Name", "Contact", "Address", "Designation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeeSearchTable.setFocusable(false);
        employeeSearchTable.setRowHeight(30);
        employeeSearchTable.setSelectionBackground(new java.awt.Color(237, 57, 95));
        employeeSearchTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(employeeSearchTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(empIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(searchEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchEmpButtonActionPerformed
        int ID = Integer.parseInt(empIDCombobox.getSelectedItem().toString());
        try{
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            String query = "select * from employees where Emp_ID="+ID;
            ResultSet rs = statement.executeQuery(query);
            DefaultTableModel model = (DefaultTableModel) employeeSearchTable.getModel();
            int rowCount = model.getRowCount();
            if(rowCount ==1){
                model.removeRow(0);
            }
            while(rs.next()){
                String empID1 = String.valueOf(rs.getInt("Emp_ID"));
                String name = rs.getString("Name");
                String contact = String.valueOf(rs.getLong("Contact_No"));
                String address = rs.getString("Address");
                String designation = rs.getString("Designation");
                String[] tableContent = {empID1, name, contact, address , designation};
                model.addRow(tableContent);
            }

        }
        catch(SQLException se){
            se.printStackTrace();
        }
    }//GEN-LAST:event_searchEmpButtonActionPerformed

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
    private javax.swing.JTable employeeSearchTable;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton searchEmpButton;
    // End of variables declaration//GEN-END:variables
}

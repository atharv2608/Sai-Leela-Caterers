package panels;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class ViewSuppliersPanel extends javax.swing.JPanel {
    Methods methods = new Methods();
    static final String DB_URL = "jdbc:mysql://localhost/sai_leela_caterers";
    static final String USER = "root";
    static final String PASS = "1234";
    public ViewSuppliersPanel() {
        initComponents();
        methods.designTable(supplierSearchTable, 25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel40 = new javax.swing.JLabel();
        searchSupButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        supplierSearchTable = new javax.swing.JTable();
        supIDCombobox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 51, 51));
        jLabel40.setText("ID of the Supplier");

        searchSupButton.setBackground(new java.awt.Color(0, 0, 0));
        searchSupButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        searchSupButton.setForeground(new java.awt.Color(255, 255, 255));
        searchSupButton.setText("Search");
        searchSupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSupButtonActionPerformed(evt);
            }
        });

        supplierSearchTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        supplierSearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier ID", "Name", "Contact", "Supplies"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        supplierSearchTable.setFocusable(false);
        supplierSearchTable.setRowHeight(30);
        supplierSearchTable.setSelectionBackground(new java.awt.Color(237, 57, 95));
        supplierSearchTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(supplierSearchTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchSupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(supIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(507, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(searchSupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchSupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSupButtonActionPerformed
        int ID = Integer.parseInt(supIDCombobox.getSelectedItem().toString());
        try{
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            String query = "select * from suppliers where Supplier_ID="+ID;
            ResultSet rs = statement.executeQuery(query);
            DefaultTableModel model = (DefaultTableModel) supplierSearchTable.getModel();
            int rowCount = model.getRowCount();
            if(rowCount ==1){
                model.removeRow(0);
            }
            while(rs.next()){
                String supID1 = String.valueOf(rs.getInt("Supplier_ID"));
                String name = rs.getString("Name");
                String contact = String.valueOf(rs.getLong("Contact_No"));
                String description = rs.getString("Supplies");
                String[] tableContent = {supID1, name, contact, description};
                model.addRow(tableContent);
            }

        }

        catch(SQLException se){
            se.printStackTrace();
        }
    }//GEN-LAST:event_searchSupButtonActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel40;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton searchSupButton;
    private javax.swing.JComboBox<String> supIDCombobox;
    private javax.swing.JTable supplierSearchTable;
    // End of variables declaration//GEN-END:variables
}

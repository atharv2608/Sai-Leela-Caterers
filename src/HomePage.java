
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        navigatorPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        SLC_Title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Employee = new javax.swing.JPanel();
        emp_icon = new javax.swing.JLabel();
        emp_text = new javax.swing.JLabel();
        Suppliers = new javax.swing.JPanel();
        supp_icon = new javax.swing.JLabel();
        supp_text = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        menu_icon = new javax.swing.JLabel();
        menu_text = new javax.swing.JLabel();
        Orders = new javax.swing.JPanel();
        order_icon = new javax.swing.JLabel();
        order_text = new javax.swing.JLabel();
        Payment = new javax.swing.JPanel();
        payment_icon = new javax.swing.JLabel();
        payment_text = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        mainTabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        employeeTab = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        suppliersTab = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        menuTab = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ordersTab = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        paymentsTab = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navigatorPanel.setBackground(new java.awt.Color(0, 176, 155));

        titlePanel.setBackground(new java.awt.Color(0, 176, 155));

        SLC_Title.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        SLC_Title.setForeground(new java.awt.Color(255, 255, 255));
        SLC_Title.setText("SAI LEELA CATERERS");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/catering logo.png"))); // NOI18N

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SLC_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SLC_Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        Employee.setBackground(new java.awt.Color(0, 176, 155));
        Employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeMouseClicked(evt);
            }
        });

        emp_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Employee Icon.png"))); // NOI18N

        emp_text.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        emp_text.setForeground(new java.awt.Color(255, 255, 255));
        emp_text.setText("Employees");

        javax.swing.GroupLayout EmployeeLayout = new javax.swing.GroupLayout(Employee);
        Employee.setLayout(EmployeeLayout);
        EmployeeLayout.setHorizontalGroup(
            EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emp_icon)
                .addGap(18, 18, 18)
                .addComponent(emp_text, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EmployeeLayout.setVerticalGroup(
            EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EmployeeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(emp_text))
                    .addComponent(emp_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Suppliers.setBackground(new java.awt.Color(0, 176, 155));
        Suppliers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SuppliersMouseClicked(evt);
            }
        });

        supp_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Supplier Icon.png"))); // NOI18N

        supp_text.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        supp_text.setForeground(new java.awt.Color(255, 255, 255));
        supp_text.setText("Suppliers");

        javax.swing.GroupLayout SuppliersLayout = new javax.swing.GroupLayout(Suppliers);
        Suppliers.setLayout(SuppliersLayout);
        SuppliersLayout.setHorizontalGroup(
            SuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuppliersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(supp_icon)
                .addGap(18, 18, 18)
                .addComponent(supp_text, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SuppliersLayout.setVerticalGroup(
            SuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SuppliersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(supp_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(SuppliersLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(supp_text)))
                .addContainerGap())
        );

        Menu.setBackground(new java.awt.Color(0, 176, 155));
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClicked(evt);
            }
        });

        menu_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/food-tray.png"))); // NOI18N

        menu_text.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        menu_text.setForeground(new java.awt.Color(255, 255, 255));
        menu_text.setText("Menu");

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu_icon)
                .addGap(18, 18, 18)
                .addComponent(menu_text, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(menu_text)))
                .addContainerGap())
        );

        Orders.setBackground(new java.awt.Color(0, 176, 155));
        Orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrdersMouseClicked(evt);
            }
        });

        order_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/order icon.png"))); // NOI18N

        order_text.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        order_text.setForeground(new java.awt.Color(255, 255, 255));
        order_text.setText("Orders");

        javax.swing.GroupLayout OrdersLayout = new javax.swing.GroupLayout(Orders);
        Orders.setLayout(OrdersLayout);
        OrdersLayout.setHorizontalGroup(
            OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(order_icon)
                .addGap(18, 18, 18)
                .addComponent(order_text, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OrdersLayout.setVerticalGroup(
            OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(order_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(OrdersLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(order_text)))
                .addContainerGap())
        );

        Payment.setBackground(new java.awt.Color(0, 176, 155));
        Payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaymentMouseClicked(evt);
            }
        });

        payment_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/payment icon.png"))); // NOI18N

        payment_text.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        payment_text.setForeground(new java.awt.Color(255, 255, 255));
        payment_text.setText("Payments");

        javax.swing.GroupLayout PaymentLayout = new javax.swing.GroupLayout(Payment);
        Payment.setLayout(PaymentLayout);
        PaymentLayout.setHorizontalGroup(
            PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(payment_icon)
                .addGap(18, 18, 18)
                .addComponent(payment_text, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PaymentLayout.setVerticalGroup(
            PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payment_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PaymentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(payment_text)))
                .addContainerGap())
        );

        javax.swing.GroupLayout navigatorPanelLayout = new javax.swing.GroupLayout(navigatorPanel);
        navigatorPanel.setLayout(navigatorPanelLayout);
        navigatorPanelLayout.setHorizontalGroup(
            navigatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Employee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Suppliers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Orders, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(navigatorPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(Payment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        navigatorPanelLayout.setVerticalGroup(
            navigatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigatorPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Orders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        backgroundPanel.add(navigatorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
        );

        mainTabbedPane.addTab("tab6", jPanel2);

        employeeTab.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Employee Tab");

        javax.swing.GroupLayout employeeTabLayout = new javax.swing.GroupLayout(employeeTab);
        employeeTab.setLayout(employeeTabLayout);
        employeeTabLayout.setHorizontalGroup(
            employeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employeeTabLayout.createSequentialGroup()
                .addContainerGap(717, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        employeeTabLayout.setVerticalGroup(
            employeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employeeTabLayout.createSequentialGroup()
                .addContainerGap(519, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        mainTabbedPane.addTab("tab1", employeeTab);

        suppliersTab.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Suppliers Tab");

        javax.swing.GroupLayout suppliersTabLayout = new javax.swing.GroupLayout(suppliersTab);
        suppliersTab.setLayout(suppliersTabLayout);
        suppliersTabLayout.setHorizontalGroup(
            suppliersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, suppliersTabLayout.createSequentialGroup()
                .addContainerGap(707, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        suppliersTabLayout.setVerticalGroup(
            suppliersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, suppliersTabLayout.createSequentialGroup()
                .addContainerGap(542, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        mainTabbedPane.addTab("tab2", suppliersTab);

        menuTab.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Menu Tab");

        javax.swing.GroupLayout menuTabLayout = new javax.swing.GroupLayout(menuTab);
        menuTab.setLayout(menuTabLayout);
        menuTabLayout.setHorizontalGroup(
            menuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuTabLayout.createSequentialGroup()
                .addContainerGap(707, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menuTabLayout.setVerticalGroup(
            menuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuTabLayout.createSequentialGroup()
                .addContainerGap(542, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        mainTabbedPane.addTab("tab3", menuTab);

        ordersTab.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Orders Tab");

        javax.swing.GroupLayout ordersTabLayout = new javax.swing.GroupLayout(ordersTab);
        ordersTab.setLayout(ordersTabLayout);
        ordersTabLayout.setHorizontalGroup(
            ordersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ordersTabLayout.createSequentialGroup()
                .addContainerGap(707, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ordersTabLayout.setVerticalGroup(
            ordersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ordersTabLayout.createSequentialGroup()
                .addContainerGap(542, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        mainTabbedPane.addTab("tab4", ordersTab);

        paymentsTab.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Payments Tab");

        javax.swing.GroupLayout paymentsTabLayout = new javax.swing.GroupLayout(paymentsTab);
        paymentsTab.setLayout(paymentsTabLayout);
        paymentsTabLayout.setHorizontalGroup(
            paymentsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentsTabLayout.createSequentialGroup()
                .addContainerGap(707, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        paymentsTabLayout.setVerticalGroup(
            paymentsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentsTabLayout.createSequentialGroup()
                .addContainerGap(542, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        mainTabbedPane.addTab("tab5", paymentsTab);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabbedPane)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        backgroundPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 810, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaymentMouseClicked
        mainTabbedPane.setSelectedIndex(4);
        Payment.setBackground(new Color(182,208,206));
        Employee.setBackground(new Color(0,176,155));
        Menu.setBackground(new Color(0,176,155));
        Orders.setBackground(new Color(0,176,155));
        Suppliers.setBackground(new Color(0,176,155));
    }//GEN-LAST:event_PaymentMouseClicked

    private void OrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdersMouseClicked
        mainTabbedPane.setSelectedIndex(3);
        Orders.setBackground(new Color(182,208,206));
        Employee.setBackground(new Color(0,176,155));
        Menu.setBackground(new Color(0,176,155));
        Suppliers.setBackground(new Color(0,176,155));
        Payment.setBackground(new Color(0,176,155));
    }//GEN-LAST:event_OrdersMouseClicked

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        mainTabbedPane.setSelectedIndex(2);
        Menu.setBackground(new Color(182,208,206));
        Employee.setBackground(new Color(0,176,155));
        Suppliers.setBackground(new Color(0,176,155));
        Orders.setBackground(new Color(0,176,155));
        Payment.setBackground(new Color(0,176,155));
    }//GEN-LAST:event_MenuMouseClicked

    private void SuppliersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuppliersMouseClicked
        mainTabbedPane.setSelectedIndex(1);
        Suppliers.setBackground(new Color(182,208,206));
        Employee.setBackground(new Color(0,176,155));
        Menu.setBackground(new Color(0,176,155));
        Orders.setBackground(new Color(0,176,155));
        Payment.setBackground(new Color(0,176,155));
    }//GEN-LAST:event_SuppliersMouseClicked

    private void EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseClicked
        mainTabbedPane.setSelectedIndex(0);
        Employee.setBackground(new Color(182,208,206));
        Suppliers.setBackground(new Color(0,176,155));
        Menu.setBackground(new Color(0,176,155));
        Orders.setBackground(new Color(0,176,155));
        Payment.setBackground(new Color(0,176,155));
    }//GEN-LAST:event_EmployeeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Employee;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Orders;
    private javax.swing.JPanel Payment;
    private javax.swing.JLabel SLC_Title;
    private javax.swing.JPanel Suppliers;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel emp_icon;
    private javax.swing.JLabel emp_text;
    private javax.swing.JPanel employeeTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JPanel menuTab;
    private javax.swing.JLabel menu_icon;
    private javax.swing.JLabel menu_text;
    private javax.swing.JPanel navigatorPanel;
    private javax.swing.JLabel order_icon;
    private javax.swing.JLabel order_text;
    private javax.swing.JPanel ordersTab;
    private javax.swing.JLabel payment_icon;
    private javax.swing.JLabel payment_text;
    private javax.swing.JPanel paymentsTab;
    private javax.swing.JLabel supp_icon;
    private javax.swing.JLabel supp_text;
    private javax.swing.JPanel suppliersTab;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}

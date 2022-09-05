import java.awt.Color;
import java.sql.*;

/**
 *
 * @author Atharv
 */
public class HomePage extends javax.swing.JFrame {
    int xMouse, yMouse;
    static final String DB_URL="jdbc:mysql://localhost/sai_leela_caterers";
    static final String USER = "root";
    static final String PASS = "1234";
    
    public HomePage() {
        initComponents();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        navigatorPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        SLC_Title = new javax.swing.JLabel();
        SLC_Logo = new javax.swing.JLabel();
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
        homeTab = new javax.swing.JPanel();
        employeeTab = new javax.swing.JPanel();
        employeeTabbedPanel = new javax.swing.JTabbedPane();
        employeeHome = new javax.swing.JPanel();
        addEmployee = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        delEmployee = new keeptoo.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        searchEmployee = new keeptoo.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        updateEmployee = new keeptoo.KGradientPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        addEmp = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        empName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        empAddress = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        empContact = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        empDesgn = new javax.swing.JTextField();
        addEmpButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        suppliersTab = new javax.swing.JPanel();
        suppliersTabbedPane = new javax.swing.JTabbedPane();
        suppliersHome = new javax.swing.JPanel();
        addSupplier = new keeptoo.KGradientPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        deleteSupplier = new keeptoo.KGradientPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        searchSupplier = new keeptoo.KGradientPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        updateSupplier = new keeptoo.KGradientPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        menuTab = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ordersTab = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        paymentsTab = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setResizable(false);

        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navigatorPanel.setBackground(new java.awt.Color(0, 172, 228));

        titlePanel.setBackground(new java.awt.Color(0, 172, 228));
        titlePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titlePanelMouseDragged(evt);
            }
        });
        titlePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titlePanelMousePressed(evt);
            }
        });

        SLC_Title.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        SLC_Title.setForeground(new java.awt.Color(255, 255, 255));
        SLC_Title.setText("SAI LEELA CATERERS");

        SLC_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/catering logo.png"))); // NOI18N

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SLC_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SLC_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SLC_Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SLC_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        Employee.setBackground(new java.awt.Color(0, 172, 228));
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

        Suppliers.setBackground(new java.awt.Color(0, 172, 228));
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

        Menu.setBackground(new java.awt.Color(0, 172, 228));
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

        Orders.setBackground(new java.awt.Color(0, 172, 228));
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

        Payment.setBackground(new java.awt.Color(0, 172, 228));
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
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
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
                .addContainerGap(268, Short.MAX_VALUE))
        );

        backgroundPanel.add(navigatorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeTab.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout homeTabLayout = new javax.swing.GroupLayout(homeTab);
        homeTab.setLayout(homeTabLayout);
        homeTabLayout.setHorizontalGroup(
            homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        homeTabLayout.setVerticalGroup(
            homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );

        mainTabbedPane.addTab("tab6", homeTab);

        employeeTab.setBackground(new java.awt.Color(255, 255, 255));

        employeeHome.setBackground(new java.awt.Color(255, 255, 255));

        addEmployee.setkEndColor(new java.awt.Color(172, 182, 229));
        addEmployee.setkStartColor(new java.awt.Color(116, 235, 213));
        addEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEmployeeMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add employee icon.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add Employee");

        javax.swing.GroupLayout addEmployeeLayout = new javax.swing.GroupLayout(addEmployee);
        addEmployee.setLayout(addEmployeeLayout);
        addEmployeeLayout.setHorizontalGroup(
            addEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        addEmployeeLayout.setVerticalGroup(
            addEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmployeeLayout.createSequentialGroup()
                .addGroup(addEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addEmployeeLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(addEmployeeLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        delEmployee.setkEndColor(new java.awt.Color(172, 182, 229));
        delEmployee.setkStartColor(new java.awt.Color(116, 235, 213));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete employee icon.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Delete Employee");

        javax.swing.GroupLayout delEmployeeLayout = new javax.swing.GroupLayout(delEmployee);
        delEmployee.setLayout(delEmployeeLayout);
        delEmployeeLayout.setHorizontalGroup(
            delEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delEmployeeLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        delEmployeeLayout.setVerticalGroup(
            delEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delEmployeeLayout.createSequentialGroup()
                .addGroup(delEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(delEmployeeLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7))
                    .addGroup(delEmployeeLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel8)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        searchEmployee.setkEndColor(new java.awt.Color(172, 182, 229));
        searchEmployee.setkStartColor(new java.awt.Color(116, 235, 213));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search icon.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Search Employee");

        javax.swing.GroupLayout searchEmployeeLayout = new javax.swing.GroupLayout(searchEmployee);
        searchEmployee.setLayout(searchEmployeeLayout);
        searchEmployeeLayout.setHorizontalGroup(
            searchEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchEmployeeLayout.setVerticalGroup(
            searchEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchEmployeeLayout.createSequentialGroup()
                .addGroup(searchEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchEmployeeLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel9))
                    .addGroup(searchEmployeeLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel10)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        updateEmployee.setkEndColor(new java.awt.Color(172, 182, 229));
        updateEmployee.setkStartColor(new java.awt.Color(116, 235, 213));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update data icon.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Update Employee");

        javax.swing.GroupLayout updateEmployeeLayout = new javax.swing.GroupLayout(updateEmployee);
        updateEmployee.setLayout(updateEmployeeLayout);
        updateEmployeeLayout.setHorizontalGroup(
            updateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        updateEmployeeLayout.setVerticalGroup(
            updateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateEmployeeLayout.createSequentialGroup()
                .addGroup(updateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateEmployeeLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel11))
                    .addGroup(updateEmployeeLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel12)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout employeeHomeLayout = new javax.swing.GroupLayout(employeeHome);
        employeeHome.setLayout(employeeHomeLayout);
        employeeHomeLayout.setHorizontalGroup(
            employeeHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeHomeLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(employeeHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(85, 85, 85)
                .addGroup(employeeHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        employeeHomeLayout.setVerticalGroup(
            employeeHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeHomeLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(employeeHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(delEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(employeeHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        employeeTabbedPanel.addTab("tab1", employeeHome);

        addEmp.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 51));
        jLabel13.setText("Enter Name");

        empName.setBackground(new java.awt.Color(242, 242, 242));
        empName.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

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

        addEmpButton.setBackground(new java.awt.Color(0, 0, 0,100));
        addEmpButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        addEmpButton.setForeground(new java.awt.Color(255, 255, 255));
        addEmpButton.setText("Add Employee");
        addEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addEmpLayout = new javax.swing.GroupLayout(addEmp);
        addEmp.setLayout(addEmpLayout);
        addEmpLayout.setHorizontalGroup(
            addEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addEmpLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(addEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addEmpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(addEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empContact, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empDesgn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(482, 482, 482))
        );
        addEmpLayout.setVerticalGroup(
            addEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmpLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(addEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empContact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(addEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empDesgn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(addEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(333, Short.MAX_VALUE))
        );

        employeeTabbedPanel.addTab("tab2", addEmp);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        employeeTabbedPanel.addTab("tab3", jPanel3);

        javax.swing.GroupLayout employeeTabLayout = new javax.swing.GroupLayout(employeeTab);
        employeeTab.setLayout(employeeTabLayout);
        employeeTabLayout.setHorizontalGroup(
            employeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeTabLayout.createSequentialGroup()
                .addComponent(employeeTabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );
        employeeTabLayout.setVerticalGroup(
            employeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(employeeTabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        mainTabbedPane.addTab("tab1", employeeTab);

        suppliersTab.setBackground(new java.awt.Color(255, 255, 255));

        suppliersHome.setBackground(new java.awt.Color(255, 255, 255));

        addSupplier.setkEndColor(new java.awt.Color(172, 182, 229));
        addSupplier.setkStartColor(new java.awt.Color(116, 235, 213));
        addSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSupplierMouseClicked(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add employee icon.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Add Supplier");

        javax.swing.GroupLayout addSupplierLayout = new javax.swing.GroupLayout(addSupplier);
        addSupplier.setLayout(addSupplierLayout);
        addSupplierLayout.setHorizontalGroup(
            addSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addSupplierLayout.setVerticalGroup(
            addSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSupplierLayout.createSequentialGroup()
                .addGroup(addSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addSupplierLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel18))
                    .addGroup(addSupplierLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel19)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        deleteSupplier.setkEndColor(new java.awt.Color(172, 182, 229));
        deleteSupplier.setkStartColor(new java.awt.Color(116, 235, 213));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete employee icon.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Delete Supplier");

        javax.swing.GroupLayout deleteSupplierLayout = new javax.swing.GroupLayout(deleteSupplier);
        deleteSupplier.setLayout(deleteSupplierLayout);
        deleteSupplierLayout.setHorizontalGroup(
            deleteSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteSupplierLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        deleteSupplierLayout.setVerticalGroup(
            deleteSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteSupplierLayout.createSequentialGroup()
                .addGroup(deleteSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteSupplierLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel20))
                    .addGroup(deleteSupplierLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel21)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        searchSupplier.setkEndColor(new java.awt.Color(172, 182, 229));
        searchSupplier.setkStartColor(new java.awt.Color(116, 235, 213));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search icon.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Search Supplier");

        javax.swing.GroupLayout searchSupplierLayout = new javax.swing.GroupLayout(searchSupplier);
        searchSupplier.setLayout(searchSupplierLayout);
        searchSupplierLayout.setHorizontalGroup(
            searchSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchSupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchSupplierLayout.setVerticalGroup(
            searchSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchSupplierLayout.createSequentialGroup()
                .addGroup(searchSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchSupplierLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel22))
                    .addGroup(searchSupplierLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel23)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        updateSupplier.setkEndColor(new java.awt.Color(172, 182, 229));
        updateSupplier.setkStartColor(new java.awt.Color(116, 235, 213));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update data icon.png"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Update Supplier");

        javax.swing.GroupLayout updateSupplierLayout = new javax.swing.GroupLayout(updateSupplier);
        updateSupplier.setLayout(updateSupplierLayout);
        updateSupplierLayout.setHorizontalGroup(
            updateSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateSupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        updateSupplierLayout.setVerticalGroup(
            updateSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateSupplierLayout.createSequentialGroup()
                .addGroup(updateSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateSupplierLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel24))
                    .addGroup(updateSupplierLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel25)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout suppliersHomeLayout = new javax.swing.GroupLayout(suppliersHome);
        suppliersHome.setLayout(suppliersHomeLayout);
        suppliersHomeLayout.setHorizontalGroup(
            suppliersHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suppliersHomeLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(suppliersHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68)
                .addGroup(suppliersHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        suppliersHomeLayout.setVerticalGroup(
            suppliersHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suppliersHomeLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(suppliersHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(suppliersHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        suppliersTabbedPane.addTab("tab1", suppliersHome);

        javax.swing.GroupLayout suppliersTabLayout = new javax.swing.GroupLayout(suppliersTab);
        suppliersTab.setLayout(suppliersTabLayout);
        suppliersTabLayout.setHorizontalGroup(
            suppliersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suppliersTabLayout.createSequentialGroup()
                .addComponent(suppliersTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        suppliersTabLayout.setVerticalGroup(
            suppliersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suppliersTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(suppliersTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        mainTabbedPane.addTab("tab2", suppliersTab);

        menuTab.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Menu Tab");

        javax.swing.GroupLayout menuTabLayout = new javax.swing.GroupLayout(menuTab);
        menuTab.setLayout(menuTabLayout);
        menuTabLayout.setHorizontalGroup(
            menuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuTabLayout.createSequentialGroup()
                .addContainerGap(747, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menuTabLayout.setVerticalGroup(
            menuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuTabLayout.createSequentialGroup()
                .addContainerGap(612, Short.MAX_VALUE)
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
                .addContainerGap(747, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ordersTabLayout.setVerticalGroup(
            ordersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ordersTabLayout.createSequentialGroup()
                .addContainerGap(612, Short.MAX_VALUE)
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
                .addContainerGap(747, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        paymentsTabLayout.setVerticalGroup(
            paymentsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentsTabLayout.createSequentialGroup()
                .addContainerGap(612, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        mainTabbedPane.addTab("tab5", paymentsTab);

        jPanel1.add(mainTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -38, -1, 770));

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
        mainTabbedPane.setSelectedIndex(5);
        Payment.setBackground(new Color(191,224,233));
        Employee.setBackground(new Color(0,172,228));
        Menu.setBackground(new Color(0,172,228));
        Orders.setBackground(new Color(0,172,228));
        Suppliers.setBackground(new Color(0,172,228));
    }//GEN-LAST:event_PaymentMouseClicked

    private void OrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdersMouseClicked
        mainTabbedPane.setSelectedIndex(4);
        Orders.setBackground(new Color(191,224,233));
        Employee.setBackground(new Color(0,172,228));
        Menu.setBackground(new Color(0,172,228));
        Suppliers.setBackground(new Color(0,172,228));
        Payment.setBackground(new Color(0,172,228));
    }//GEN-LAST:event_OrdersMouseClicked

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        mainTabbedPane.setSelectedIndex(3);
        Menu.setBackground(new Color(191,224,233));
        Employee.setBackground(new Color(0,172,228));
        Suppliers.setBackground(new Color(0,172,228));
        Orders.setBackground(new Color(0,172,228));
        Payment.setBackground(new Color(0,172,228));
    }//GEN-LAST:event_MenuMouseClicked

    private void SuppliersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuppliersMouseClicked
        mainTabbedPane.setSelectedIndex(2);
        Suppliers.setBackground(new Color(191,224,233));
        Employee.setBackground(new Color(0,172,228));
        Menu.setBackground(new Color(0,172,228));
        Orders.setBackground(new Color(0,172,228));
        Payment.setBackground(new Color(0,172,228));
    }//GEN-LAST:event_SuppliersMouseClicked

    private void EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseClicked
        mainTabbedPane.setSelectedIndex(1);
        Employee.setBackground(new Color(191,224,233));
        Suppliers.setBackground(new Color(0,172,228));
        Menu.setBackground(new Color(0,172,228));
        Orders.setBackground(new Color(0,172,228));
        Payment.setBackground(new Color(0,172,228));
    }//GEN-LAST:event_EmployeeMouseClicked

    private void titlePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlePanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_titlePanelMousePressed

    private void titlePanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlePanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_titlePanelMouseDragged

    private void addEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmployeeMouseClicked
        employeeTabbedPanel.setSelectedIndex(1);
    }//GEN-LAST:event_addEmployeeMouseClicked

    private void addEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmpButtonActionPerformed
        final String name = empName.getText();
        final String con = empContact.getText();
        final long contact = Long.parseLong(con);
        final String address = empAddress.getText();
        final String designation = empDesgn.getText();
        
        try{
            Connection connection=DriverManager.getConnection(DB_URL,USER,PASS);
            Statement statement = connection.createStatement();
            String query = "Insert into employees(Name, Contact_No, Address, Designation) " + "values('" + name+"', '"+contact+"', '"+address+"', '"+designation+"')";
            statement.executeUpdate(query);
            
            //Reocrd is inserting correctly. Validations are remaining
        }
        catch(SQLException se){
            se.printStackTrace();
        }
    }//GEN-LAST:event_addEmpButtonActionPerformed

    private void addSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSupplierMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addSupplierMouseClicked

    public static void main(String args[]) {
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
    private javax.swing.JLabel SLC_Logo;
    private javax.swing.JLabel SLC_Title;
    private javax.swing.JPanel Suppliers;
    private javax.swing.JPanel addEmp;
    private javax.swing.JButton addEmpButton;
    private keeptoo.KGradientPanel addEmployee;
    private keeptoo.KGradientPanel addSupplier;
    private javax.swing.JPanel backgroundPanel;
    private keeptoo.KGradientPanel delEmployee;
    private keeptoo.KGradientPanel deleteSupplier;
    private javax.swing.JTextField empAddress;
    private javax.swing.JTextField empContact;
    private javax.swing.JTextField empDesgn;
    private javax.swing.JTextField empName;
    private javax.swing.JLabel emp_icon;
    private javax.swing.JLabel emp_text;
    private javax.swing.JPanel employeeHome;
    private javax.swing.JPanel employeeTab;
    private javax.swing.JTabbedPane employeeTabbedPanel;
    private javax.swing.JPanel homeTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
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
    private keeptoo.KGradientPanel searchEmployee;
    private keeptoo.KGradientPanel searchSupplier;
    private javax.swing.JLabel supp_icon;
    private javax.swing.JLabel supp_text;
    private javax.swing.JPanel suppliersHome;
    private javax.swing.JPanel suppliersTab;
    private javax.swing.JTabbedPane suppliersTabbedPane;
    private javax.swing.JPanel titlePanel;
    private keeptoo.KGradientPanel updateEmployee;
    private keeptoo.KGradientPanel updateSupplier;
    // End of variables declaration//GEN-END:variables
}

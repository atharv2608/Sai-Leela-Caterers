
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Atharv
 */
public class HomePage extends javax.swing.JFrame {

    int xMouse, yMouse;
    static final String DB_URL = "jdbc:mysql://localhost/sai_leela_caterers";
    static final String USER = "root";
    static final String PASS = "1234";

    public static Statement establishConnection() throws SQLException {

        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = connection.createStatement();
        return statement;
    }

    public HomePage() {
        initComponents();
        Methods methods = new Methods();
        methods.designTable(menuTable, 25);
//        methods.designTable(supplierSearchTable, 25);
        // methods.designTable(employeeSearchTable, 25);
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
        employeeTabbedPane = new javax.swing.JTabbedPane();
        employeeHomeTab = new javax.swing.JPanel();
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
        addEmpTab = new javax.swing.JPanel();
        addEmployeePanel1 = new panels.AddEmployeePanel();
        delEmpTab = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        delEmpButton = new javax.swing.JButton();
        empIDCombobox = new javax.swing.JComboBox<>();
        updateEmpTab = new javax.swing.JPanel();
        updateEmployePanel2 = new panels.UpdateEmployePanel();
        searchEmpTab = new javax.swing.JPanel();
        viewEmployeesPanel1 = new panels.ViewEmployeesPanel();
        suppliersTab = new javax.swing.JPanel();
        suppliersTabbedPane = new javax.swing.JTabbedPane();
        suppliersHomeTab = new javax.swing.JPanel();
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
        addSupTab = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        supName = new javax.swing.JTextField();
        supContact = new javax.swing.JTextField();
        supplies = new javax.swing.JTextField();
        addSupButton = new javax.swing.JButton();
        mainErrorLabel = new javax.swing.JLabel();
        delSupTab = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        delSupButton = new javax.swing.JButton();
        supIDCombobox = new javax.swing.JComboBox<>();
        updateSupTab = new javax.swing.JPanel();
        updateSupplierPanel1 = new panels.UpdateSupplierPanel();
        searchSupTab = new javax.swing.JPanel();
        viewSuppliersPanel1 = new panels.ViewSuppliersPanel();
        menuTab = new javax.swing.JPanel();
        menuTabbedPane = new javax.swing.JTabbedPane();
        menuHomeTab = new javax.swing.JPanel();
        addMenu = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        viewMenu = new keeptoo.KGradientPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        addMenuTab = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        plateName = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        welcomeDrink = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        starter = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        cost = new javax.swing.JTextField();
        addMenuButton = new javax.swing.JButton();
        viewMenuTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        jLabel47 = new javax.swing.JLabel();
        ordersTab = new javax.swing.JPanel();
        ordersTabbedPane = new javax.swing.JTabbedPane();
        orderHomeTab = new javax.swing.JPanel();
        addEmployee1 = new keeptoo.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        addEmployee2 = new keeptoo.KGradientPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        customerName = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        customerContact = new javax.swing.JTextField();
        searchEmpButton1 = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        customerEmail = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        expectedPeople = new javax.swing.JTextField();
        eventTime = new javax.swing.JTextField();
        searchEmpButton2 = new javax.swing.JButton();
        eventDate = new com.toedter.calendar.JDateChooser();
        jLabel27 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        specialRequest = new javax.swing.JTextField();
        menuIDCombobox = new javax.swing.JComboBox<>();
        deliveryComboBox = new javax.swing.JComboBox<>();
        placeOrderButton = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        totalAmount = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        deliveryAddress = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
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
            .addGap(0, 864, Short.MAX_VALUE)
        );
        homeTabLayout.setVerticalGroup(
            homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );

        mainTabbedPane.addTab("tab6", homeTab);

        employeeTab.setBackground(new java.awt.Color(255, 255, 255));

        employeeHomeTab.setBackground(new java.awt.Color(255, 255, 255));

        addEmployee.setkEndColor(new java.awt.Color(74, 0, 224));
        addEmployee.setkStartColor(new java.awt.Color(142, 45, 226));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        delEmployee.setkEndColor(new java.awt.Color(74, 0, 224));
        delEmployee.setkStartColor(new java.awt.Color(142, 45, 226));
        delEmployee.setPreferredSize(new java.awt.Dimension(255, 112));
        delEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delEmployeeMouseClicked(evt);
            }
        });

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

        searchEmployee.setkEndColor(new java.awt.Color(74, 0, 224));
        searchEmployee.setkStartColor(new java.awt.Color(142, 45, 226));
        searchEmployee.setPreferredSize(new java.awt.Dimension(255, 112));
        searchEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchEmployeeMouseClicked(evt);
            }
        });

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

        updateEmployee.setkEndColor(new java.awt.Color(74, 0, 224));
        updateEmployee.setkStartColor(new java.awt.Color(142, 45, 226));
        updateEmployee.setPreferredSize(new java.awt.Dimension(255, 112));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update data icon.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Update Employee");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout updateEmployeeLayout = new javax.swing.GroupLayout(updateEmployee);
        updateEmployee.setLayout(updateEmployeeLayout);
        updateEmployeeLayout.setHorizontalGroup(
            updateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(13, Short.MAX_VALUE))
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

        javax.swing.GroupLayout employeeHomeTabLayout = new javax.swing.GroupLayout(employeeHomeTab);
        employeeHomeTab.setLayout(employeeHomeTabLayout);
        employeeHomeTabLayout.setHorizontalGroup(
            employeeHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeHomeTabLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(employeeHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(addEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(85, 85, 85)
                .addGroup(employeeHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(searchEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        employeeHomeTabLayout.setVerticalGroup(
            employeeHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeHomeTabLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(employeeHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(delEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(employeeHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        employeeTabbedPane.addTab("tab1", employeeHomeTab);

        addEmpTab.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout addEmpTabLayout = new javax.swing.GroupLayout(addEmpTab);
        addEmpTab.setLayout(addEmpTabLayout);
        addEmpTabLayout.setHorizontalGroup(
            addEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmpTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addEmployeePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        addEmpTabLayout.setVerticalGroup(
            addEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmpTabLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(addEmployeePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        employeeTabbedPane.addTab("tab2", addEmpTab);

        delEmpTab.setBackground(new java.awt.Color(255, 255, 255));
        delEmpTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delEmpTabMouseEntered(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 51));
        jLabel17.setText("Enter ID of the Employee");

        delEmpButton.setBackground(new java.awt.Color(0, 0, 0));
        delEmpButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        delEmpButton.setForeground(new java.awt.Color(255, 255, 255));
        delEmpButton.setText("Delete Employee");
        delEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delEmpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout delEmpTabLayout = new javax.swing.GroupLayout(delEmpTab);
        delEmpTab.setLayout(delEmpTabLayout);
        delEmpTabLayout.setHorizontalGroup(
            delEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delEmpTabLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(delEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delEmpButton)
                    .addGroup(delEmpTabLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(empIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(458, Short.MAX_VALUE))
        );
        delEmpTabLayout.setVerticalGroup(
            delEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delEmpTabLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(delEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(delEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(452, Short.MAX_VALUE))
        );

        employeeTabbedPane.addTab("tab3", delEmpTab);

        updateEmpTab.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout updateEmpTabLayout = new javax.swing.GroupLayout(updateEmpTab);
        updateEmpTab.setLayout(updateEmpTabLayout);
        updateEmpTabLayout.setHorizontalGroup(
            updateEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateEmpTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateEmployePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );
        updateEmpTabLayout.setVerticalGroup(
            updateEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateEmpTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateEmployePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        employeeTabbedPane.addTab("tab4", updateEmpTab);

        searchEmpTab.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout searchEmpTabLayout = new javax.swing.GroupLayout(searchEmpTab);
        searchEmpTab.setLayout(searchEmpTabLayout);
        searchEmpTabLayout.setHorizontalGroup(
            searchEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchEmpTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewEmployeesPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchEmpTabLayout.setVerticalGroup(
            searchEmpTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchEmpTabLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(viewEmployeesPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        employeeTabbedPane.addTab("tab5", searchEmpTab);

        javax.swing.GroupLayout employeeTabLayout = new javax.swing.GroupLayout(employeeTab);
        employeeTab.setLayout(employeeTabLayout);
        employeeTabLayout.setHorizontalGroup(
            employeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeTabLayout.createSequentialGroup()
                .addComponent(employeeTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );
        employeeTabLayout.setVerticalGroup(
            employeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(employeeTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        mainTabbedPane.addTab("tab1", employeeTab);

        suppliersTab.setBackground(new java.awt.Color(255, 255, 255));

        suppliersHomeTab.setBackground(new java.awt.Color(255, 255, 255));

        addSupplier.setkEndColor(new java.awt.Color(74, 0, 224));
        addSupplier.setkStartColor(new java.awt.Color(142, 45, 226));
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

        deleteSupplier.setkEndColor(new java.awt.Color(74, 0, 224));
        deleteSupplier.setkStartColor(new java.awt.Color(142, 45, 226));
        deleteSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteSupplierMouseClicked(evt);
            }
        });

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

        searchSupplier.setkEndColor(new java.awt.Color(74, 0, 224));
        searchSupplier.setkStartColor(new java.awt.Color(142, 45, 226));
        searchSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchSupplierMouseClicked(evt);
            }
        });

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

        updateSupplier.setkEndColor(new java.awt.Color(74, 0, 224));
        updateSupplier.setkStartColor(new java.awt.Color(142, 45, 226));
        updateSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateSupplierMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout suppliersHomeTabLayout = new javax.swing.GroupLayout(suppliersHomeTab);
        suppliersHomeTab.setLayout(suppliersHomeTabLayout);
        suppliersHomeTabLayout.setHorizontalGroup(
            suppliersHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suppliersHomeTabLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(suppliersHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68)
                .addGroup(suppliersHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        suppliersHomeTabLayout.setVerticalGroup(
            suppliersHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suppliersHomeTabLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(suppliersHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(suppliersHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        suppliersTabbedPane.addTab("tab1", suppliersHomeTab);

        addSupTab.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 51, 51));
        jLabel32.setText("Enter Contact");

        jLabel33.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 51, 51));
        jLabel33.setText("Enter Name");

        jLabel34.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 51, 51));
        jLabel34.setText("Supplies");

        supName.setBackground(new java.awt.Color(242, 242, 242));
        supName.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        supContact.setBackground(new java.awt.Color(242, 242, 242));
        supContact.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        supplies.setBackground(new java.awt.Color(242, 242, 242));
        supplies.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        addSupButton.setBackground(new java.awt.Color(0, 0, 0));
        addSupButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        addSupButton.setForeground(new java.awt.Color(255, 255, 255));
        addSupButton.setText("Add Supplier");
        addSupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSupButtonActionPerformed(evt);
            }
        });

        mainErrorLabel.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        mainErrorLabel.setForeground(new java.awt.Color(255, 0, 51));
        mainErrorLabel.setText("Please");

        javax.swing.GroupLayout addSupTabLayout = new javax.swing.GroupLayout(addSupTab);
        addSupTab.setLayout(addSupTabLayout);
        addSupTabLayout.setHorizontalGroup(
            addSupTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSupTabLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(addSupTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addSupButton, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addGroup(addSupTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addSupTabLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(addSupTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(supName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supContact, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supplies, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addSupTabLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(mainErrorLabel)))
                .addContainerGap(514, Short.MAX_VALUE))
        );
        addSupTabLayout.setVerticalGroup(
            addSupTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSupTabLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(addSupTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addSupTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supContact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addSupTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplies, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(addSupTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainErrorLabel))
                .addContainerGap(387, Short.MAX_VALUE))
        );

        suppliersTabbedPane.addTab("tab2", addSupTab);

        delSupTab.setBackground(new java.awt.Color(255, 255, 255));
        delSupTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delSupTabMouseEntered(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 51, 51));
        jLabel35.setText("Supplier ID");

        delSupButton.setBackground(new java.awt.Color(0, 0, 0));
        delSupButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        delSupButton.setForeground(new java.awt.Color(255, 255, 255));
        delSupButton.setText("Delete");
        delSupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delSupButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout delSupTabLayout = new javax.swing.GroupLayout(delSupTab);
        delSupTab.setLayout(delSupTabLayout);
        delSupTabLayout.setHorizontalGroup(
            delSupTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delSupTabLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(delSupTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delSupButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addComponent(supIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(530, Short.MAX_VALUE))
        );
        delSupTabLayout.setVerticalGroup(
            delSupTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delSupTabLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(delSupTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(delSupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(527, Short.MAX_VALUE))
        );

        suppliersTabbedPane.addTab("tab3", delSupTab);

        updateSupTab.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout updateSupTabLayout = new javax.swing.GroupLayout(updateSupTab);
        updateSupTab.setLayout(updateSupTabLayout);
        updateSupTabLayout.setHorizontalGroup(
            updateSupTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateSupTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateSupplierPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        updateSupTabLayout.setVerticalGroup(
            updateSupTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateSupTabLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(updateSupplierPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        suppliersTabbedPane.addTab("tab4", updateSupTab);

        searchSupTab.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout searchSupTabLayout = new javax.swing.GroupLayout(searchSupTab);
        searchSupTab.setLayout(searchSupTabLayout);
        searchSupTabLayout.setHorizontalGroup(
            searchSupTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchSupTabLayout.createSequentialGroup()
                .addComponent(viewSuppliersPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        searchSupTabLayout.setVerticalGroup(
            searchSupTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchSupTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewSuppliersPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        suppliersTabbedPane.addTab("tab5", searchSupTab);

        javax.swing.GroupLayout suppliersTabLayout = new javax.swing.GroupLayout(suppliersTab);
        suppliersTab.setLayout(suppliersTabLayout);
        suppliersTabLayout.setHorizontalGroup(
            suppliersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suppliersTabLayout.createSequentialGroup()
                .addComponent(suppliersTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
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

        menuHomeTab.setBackground(new java.awt.Color(255, 255, 255));

        addMenu.setkEndColor(new java.awt.Color(74, 0, 224));
        addMenu.setkStartColor(new java.awt.Color(142, 45, 226));
        addMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMenuMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add menu icon.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Add Menu");

        javax.swing.GroupLayout addMenuLayout = new javax.swing.GroupLayout(addMenu);
        addMenu.setLayout(addMenuLayout);
        addMenuLayout.setHorizontalGroup(
            addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        addMenuLayout.setVerticalGroup(
            addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMenuLayout.createSequentialGroup()
                .addGroup(addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addMenuLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addGroup(addMenuLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        viewMenu.setkEndColor(new java.awt.Color(74, 0, 224));
        viewMenu.setkStartColor(new java.awt.Color(142, 45, 226));
        viewMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMenuMouseClicked(evt);
            }
        });

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view menu icon.png"))); // NOI18N

        jLabel42.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("View Menu");

        javax.swing.GroupLayout viewMenuLayout = new javax.swing.GroupLayout(viewMenu);
        viewMenu.setLayout(viewMenuLayout);
        viewMenuLayout.setHorizontalGroup(
            viewMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        viewMenuLayout.setVerticalGroup(
            viewMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewMenuLayout.createSequentialGroup()
                .addGroup(viewMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewMenuLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel42))
                    .addGroup(viewMenuLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel41)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuHomeTabLayout = new javax.swing.GroupLayout(menuHomeTab);
        menuHomeTab.setLayout(menuHomeTabLayout);
        menuHomeTabLayout.setHorizontalGroup(
            menuHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuHomeTabLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(viewMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        menuHomeTabLayout.setVerticalGroup(
            menuHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuHomeTabLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(menuHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuTabbedPane.addTab("tab1", menuHomeTab);

        addMenuTab.setBackground(new java.awt.Color(255, 255, 255));

        jLabel43.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 51, 51));
        jLabel43.setText("Plate Name");

        plateName.setBackground(new java.awt.Color(242, 242, 242));
        plateName.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        jLabel44.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 51, 51));
        jLabel44.setText("Welcome Drink");

        welcomeDrink.setBackground(new java.awt.Color(242, 242, 242));
        welcomeDrink.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        jLabel45.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 51, 51));
        jLabel45.setText("Starter");

        starter.setBackground(new java.awt.Color(242, 242, 242));
        starter.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        jLabel46.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 51, 51));
        jLabel46.setText("Cost ");

        cost.setBackground(new java.awt.Color(242, 242, 242));
        cost.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        addMenuButton.setBackground(new java.awt.Color(0, 0, 0));
        addMenuButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        addMenuButton.setForeground(new java.awt.Color(255, 255, 255));
        addMenuButton.setText("Add Menu");
        addMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addMenuTabLayout = new javax.swing.GroupLayout(addMenuTab);
        addMenuTab.setLayout(addMenuTabLayout);
        addMenuTabLayout.setHorizontalGroup(
            addMenuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMenuTabLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(addMenuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addMenuTabLayout.createSequentialGroup()
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(starter, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addMenuTabLayout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(plateName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addMenuTabLayout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(welcomeDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addMenuTabLayout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(514, 514, 514))
        );
        addMenuTabLayout.setVerticalGroup(
            addMenuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMenuTabLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(addMenuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plateName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(addMenuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(welcomeDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(addMenuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(starter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(addMenuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(addMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuTabbedPane.addTab("tab2", addMenuTab);

        viewMenuTab.setBackground(new java.awt.Color(255, 255, 255));

        menuTable.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menu ID", "Plate Name", "Welcome Drink", "Starter", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        menuTable.setFocusable(false);
        menuTable.setRowHeight(30);
        menuTable.setSelectionBackground(new java.awt.Color(237, 57, 95));
        menuTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(menuTable);
        if (menuTable.getColumnModel().getColumnCount() > 0) {
            menuTable.getColumnModel().getColumn(0).setResizable(false);
            menuTable.getColumnModel().getColumn(1).setResizable(false);
            menuTable.getColumnModel().getColumn(2).setResizable(false);
            menuTable.getColumnModel().getColumn(3).setResizable(false);
            menuTable.getColumnModel().getColumn(4).setResizable(false);
            menuTable.getColumnModel().getColumn(4).setHeaderValue("Cost");
        }

        javax.swing.GroupLayout viewMenuTabLayout = new javax.swing.GroupLayout(viewMenuTab);
        viewMenuTab.setLayout(viewMenuTabLayout);
        viewMenuTabLayout.setHorizontalGroup(
            viewMenuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewMenuTabLayout.createSequentialGroup()
                .addContainerGap(495, Short.MAX_VALUE)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
            .addGroup(viewMenuTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewMenuTabLayout.setVerticalGroup(
            viewMenuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewMenuTabLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jLabel47)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        menuTabbedPane.addTab("tab3", viewMenuTab);

        javax.swing.GroupLayout menuTabLayout = new javax.swing.GroupLayout(menuTab);
        menuTab.setLayout(menuTabLayout);
        menuTabLayout.setHorizontalGroup(
            menuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuTabLayout.createSequentialGroup()
                .addComponent(menuTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );
        menuTabLayout.setVerticalGroup(
            menuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        mainTabbedPane.addTab("tab3", menuTab);

        ordersTab.setBackground(new java.awt.Color(255, 255, 255));

        addEmployee1.setkEndColor(new java.awt.Color(74, 0, 224));
        addEmployee1.setkStartColor(new java.awt.Color(142, 45, 226));
        addEmployee1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEmployee1MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/take order.png"))); // NOI18N

        jLabel48.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("View Orders");

        javax.swing.GroupLayout addEmployee1Layout = new javax.swing.GroupLayout(addEmployee1);
        addEmployee1.setLayout(addEmployee1Layout);
        addEmployee1Layout.setHorizontalGroup(
            addEmployee1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmployee1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel48)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addEmployee1Layout.setVerticalGroup(
            addEmployee1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmployee1Layout.createSequentialGroup()
                .addGroup(addEmployee1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addEmployee1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5))
                    .addGroup(addEmployee1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel48)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        addEmployee2.setkEndColor(new java.awt.Color(74, 0, 224));
        addEmployee2.setkStartColor(new java.awt.Color(142, 45, 226));
        addEmployee2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEmployee2MouseClicked(evt);
            }
        });

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/take order.png"))); // NOI18N

        jLabel50.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Take Order");

        javax.swing.GroupLayout addEmployee2Layout = new javax.swing.GroupLayout(addEmployee2);
        addEmployee2.setLayout(addEmployee2Layout);
        addEmployee2Layout.setHorizontalGroup(
            addEmployee2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmployee2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addComponent(jLabel50)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addEmployee2Layout.setVerticalGroup(
            addEmployee2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmployee2Layout.createSequentialGroup()
                .addGroup(addEmployee2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addEmployee2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel49))
                    .addGroup(addEmployee2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel50)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout orderHomeTabLayout = new javax.swing.GroupLayout(orderHomeTab);
        orderHomeTab.setLayout(orderHomeTabLayout);
        orderHomeTabLayout.setHorizontalGroup(
            orderHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderHomeTabLayout.createSequentialGroup()
                .addGap(458, 458, 458)
                .addComponent(addEmployee1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(93, 93, 93))
            .addGroup(orderHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(orderHomeTabLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(addEmployee2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(487, 487, 487)))
        );
        orderHomeTabLayout.setVerticalGroup(
            orderHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderHomeTabLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(addEmployee1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(orderHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(orderHomeTabLayout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(addEmployee2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(466, Short.MAX_VALUE)))
        );

        ordersTabbedPane.addTab("tab1", orderHomeTab);

        jLabel51.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 51, 51));
        jLabel51.setText("Customer Name");

        customerName.setBackground(new java.awt.Color(242, 242, 242));
        customerName.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        jLabel52.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 51, 51));
        jLabel52.setText("Contact");

        customerContact.setBackground(new java.awt.Color(242, 242, 242));
        customerContact.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        searchEmpButton1.setBackground(new java.awt.Color(0, 0, 0));
        searchEmpButton1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        searchEmpButton1.setForeground(new java.awt.Color(255, 255, 255));
        searchEmpButton1.setText("Next");
        searchEmpButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEmpButton1ActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 51, 51));
        jLabel57.setText("Email");

        customerEmail.setBackground(new java.awt.Color(242, 242, 242));
        customerEmail.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Lucida Handwriting", 0, 22)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 156, 186));
        jLabel26.setText("Customer Details");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(searchEmpButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerContact, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(510, 510, 510))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(288, 288, 288))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerContact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(searchEmpButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ordersTabbedPane.addTab("tab2", jPanel3);

        jLabel54.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 51, 51));
        jLabel54.setText("Event Time");

        jLabel55.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 51, 51));
        jLabel55.setText("Event Date");

        jLabel56.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 51, 51));
        jLabel56.setText("Expected People");

        expectedPeople.setBackground(new java.awt.Color(242, 242, 242));
        expectedPeople.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        eventTime.setBackground(new java.awt.Color(242, 242, 242));
        eventTime.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        searchEmpButton2.setBackground(new java.awt.Color(0, 0, 0));
        searchEmpButton2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        searchEmpButton2.setForeground(new java.awt.Color(255, 255, 255));
        searchEmpButton2.setText("Next");
        searchEmpButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEmpButton2ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Lucida Handwriting", 0, 22)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 156, 186));
        jLabel27.setText("Event  Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchEmpButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(expectedPeople, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(eventTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(eventDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventTime, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expectedPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(searchEmpButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ordersTabbedPane.addTab("tab3", jPanel2);

        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Lucida Handwriting", 0, 22)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 156, 186));
        jLabel28.setText("Order  Details");

        specialRequest.setBackground(new java.awt.Color(242, 242, 242));
        specialRequest.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        deliveryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "At venue", "Self Pickup" }));

        placeOrderButton.setBackground(new java.awt.Color(0, 0, 0));
        placeOrderButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        placeOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        placeOrderButton.setText("Place Order");
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 51, 51));
        jLabel58.setText("Total Amount");

        totalAmount.setBackground(new java.awt.Color(242, 242, 242));
        totalAmount.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        jLabel59.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 51, 51));
        jLabel59.setText("Address");

        jLabel60.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 51, 51));
        jLabel60.setText("Delivery Type");

        jLabel61.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 51, 51));
        jLabel61.setText("Special Request");

        deliveryAddress.setBackground(new java.awt.Color(242, 242, 242));
        deliveryAddress.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        jLabel62.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 51, 51));
        jLabel62.setText("Menu ID");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(332, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(288, 288, 288))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(placeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deliveryAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deliveryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(specialRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deliveryAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deliveryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(specialRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(placeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 207, Short.MAX_VALUE))
        );

        ordersTabbedPane.addTab("tab4", jPanel4);

        jLabel29.setFont(new java.awt.Font("Lucida Handwriting", 0, 22)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 156, 186));
        jLabel29.setText("Payment");

        jLabel63.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 51, 51));
        jLabel63.setText("Order ");

        jLabel64.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 51, 51));
        jLabel64.setText("Menu ID");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(336, 336, 336))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(641, 641, 641)))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 495, Short.MAX_VALUE))
        );

        ordersTabbedPane.addTab("tab5", jPanel5);

        javax.swing.GroupLayout ordersTabLayout = new javax.swing.GroupLayout(ordersTab);
        ordersTab.setLayout(ordersTabLayout);
        ordersTabLayout.setHorizontalGroup(
            ordersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordersTabLayout.createSequentialGroup()
                .addComponent(ordersTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
        );
        ordersTabLayout.setVerticalGroup(
            ordersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordersTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ordersTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        mainTabbedPane.addTab("tab4", ordersTab);

        paymentsTab.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Payments Tab");

        javax.swing.GroupLayout paymentsTabLayout = new javax.swing.GroupLayout(paymentsTab);
        paymentsTab.setLayout(paymentsTabLayout);
        paymentsTabLayout.setHorizontalGroup(
            paymentsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentsTabLayout.createSequentialGroup()
                .addContainerGap(761, Short.MAX_VALUE)
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
        Payment.setBackground(new Color(191, 224, 233));
        Employee.setBackground(new Color(0, 172, 228));
        Menu.setBackground(new Color(0, 172, 228));
        Orders.setBackground(new Color(0, 172, 228));
        Suppliers.setBackground(new Color(0, 172, 228));
    }//GEN-LAST:event_PaymentMouseClicked

    private void OrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdersMouseClicked
        mainTabbedPane.setSelectedIndex(4);
        Orders.setBackground(new Color(191, 224, 233));
        Employee.setBackground(new Color(0, 172, 228));
        Menu.setBackground(new Color(0, 172, 228));
        Suppliers.setBackground(new Color(0, 172, 228));
        Payment.setBackground(new Color(0, 172, 228));
    }//GEN-LAST:event_OrdersMouseClicked

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        mainTabbedPane.setSelectedIndex(3);
        menuTabbedPane.setSelectedIndex(0);
        Menu.setBackground(new Color(191, 224, 233));
        Employee.setBackground(new Color(0, 172, 228));
        Suppliers.setBackground(new Color(0, 172, 228));
        Orders.setBackground(new Color(0, 172, 228));
        Payment.setBackground(new Color(0, 172, 228));
    }//GEN-LAST:event_MenuMouseClicked

    private void SuppliersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuppliersMouseClicked
        mainTabbedPane.setSelectedIndex(2);
        suppliersTabbedPane.setSelectedIndex(0); //Check if big is present
        Suppliers.setBackground(new Color(191, 224, 233));
        Employee.setBackground(new Color(0, 172, 228));
        Menu.setBackground(new Color(0, 172, 228));
        Orders.setBackground(new Color(0, 172, 228));
        Payment.setBackground(new Color(0, 172, 228));
    }//GEN-LAST:event_SuppliersMouseClicked

    private void EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseClicked
        mainTabbedPane.setSelectedIndex(1);
        employeeTabbedPane.setSelectedIndex(0); //Check if bug is present
        Employee.setBackground(new Color(191, 224, 233));
        Suppliers.setBackground(new Color(0, 172, 228));
        Menu.setBackground(new Color(0, 172, 228));
        Orders.setBackground(new Color(0, 172, 228));
        Payment.setBackground(new Color(0, 172, 228));
    }//GEN-LAST:event_EmployeeMouseClicked

    private void titlePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlePanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_titlePanelMousePressed

    private void titlePanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlePanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_titlePanelMouseDragged

    private void addEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmployeeMouseClicked
        employeeTabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_addEmployeeMouseClicked

    private void addSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSupplierMouseClicked
        suppliersTabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_addSupplierMouseClicked

    private void delEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delEmployeeMouseClicked
        employeeTabbedPane.setSelectedIndex(2);

    }//GEN-LAST:event_delEmployeeMouseClicked

    private void delEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delEmpButtonActionPerformed
        int empid = Integer.parseInt(empIDCombobox.getSelectedItem().toString());
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            String query = "delete from employees where EMP_ID=" + empid;
            int response = JOptionPane.showConfirmDialog(this,"Are you sure you want to delete?");
                if(response == JOptionPane.YES_OPTION){
                    statement.executeUpdate(query);
                    empIDCombobox.removeItemAt(empIDCombobox.getSelectedIndex());
                }
            

        } catch (SQLException se) {
            System.out.println(se);
        }
    }//GEN-LAST:event_delEmpButtonActionPerformed

    private void addSupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSupButtonActionPerformed
        String name = supName.getText();
        String con = supContact.getText();
        String supply = supplies.getText();
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            

            if(name.equals("") || con.equals("") || supply.equals("")){
                mainErrorLabel.setText("Please fill details");
            }
            else{
                long contact = Long.parseLong(con);
                String query = "Insert into suppliers(Name, Contact_No, Supplies) " + "values('" + name + "', '" + contact + "', '" + supply + "')";
                statement.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Supplier Inserted",
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
                    supName.setText("");
                    supContact.setText("");
                    supplies.setText("");
                }
            },
            2000
        );
    }//GEN-LAST:event_addSupButtonActionPerformed

    private void delSupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delSupButtonActionPerformed
        final long id = Long.parseLong(supIDCombobox.getSelectedItem().toString());

        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            String query = "Delete from suppliers where Supplier_ID=" + id;
            int response = JOptionPane.showConfirmDialog(this,"Are you sure you want to delete?");
                if(response == JOptionPane.YES_OPTION){
                    statement.executeUpdate(query);
                    supIDCombobox.removeItemAt(supIDCombobox.getSelectedIndex());
                }
            
        } catch (SQLException se) {

        }
    }//GEN-LAST:event_delSupButtonActionPerformed

    private void deleteSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteSupplierMouseClicked
        suppliersTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_deleteSupplierMouseClicked

    private void updateSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateSupplierMouseClicked
        suppliersTabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_updateSupplierMouseClicked

    private void searchSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchSupplierMouseClicked
        suppliersTabbedPane.setSelectedIndex(4);

    }//GEN-LAST:event_searchSupplierMouseClicked

    private void addMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMenuMouseClicked
        menuTabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_addMenuMouseClicked

    private void viewMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMenuMouseClicked
        menuTabbedPane.setSelectedIndex(2);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            String query = "select * from menu";
            ResultSet rs = statement.executeQuery(query);
            // ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) menuTable.getModel();
//            int col = rsmd.getColumnCount();
//            String[] colName = new String[col];
//            for(int i=0; i<col;i++){
//                colName[i] = rsmd.getColumnName(i+1);
//            }
//            model.setColumnIdentifiers(colName);
            while (rs.next()) {
                String menuID = String.valueOf(rs.getInt("Menu_ID"));
                String plate = rs.getString("Plate_Name");
                String wDrink = rs.getString("Welcome_Drink");
                String starter = rs.getString("Starter");
                String price = String.valueOf(rs.getDouble("Cost"));
                String[] tableContent = {menuID, plate, wDrink, starter, price};
                model.addRow(tableContent);
            }

        } catch (Exception se) {

        }
    }//GEN-LAST:event_viewMenuMouseClicked

    private void addMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuButtonActionPerformed
        final String pName = plateName.getText();
        final String drink = welcomeDrink.getText();
        final String strter = starter.getText();
        final double price = Double.parseDouble(cost.getText());

        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            String query = "Insert into menu(Plate_Name, Welcome_Drink, Starter, Cost) " + "values('" + pName + "', '" + drink + "', '" + strter + "'," + price + ")";
            statement.executeUpdate(query);

            //Code working properly, validation remaining
        } catch (SQLException se) {
            se.printStackTrace();
        }

    }//GEN-LAST:event_addMenuButtonActionPerformed

    private void searchEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchEmployeeMouseClicked
        employeeTabbedPane.setSelectedIndex(4);
    }//GEN-LAST:event_searchEmployeeMouseClicked

    private void addEmployee1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmployee1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addEmployee1MouseClicked

    private void addEmployee2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmployee2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addEmployee2MouseClicked

    private void searchEmpButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchEmpButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchEmpButton1ActionPerformed

    private void searchEmpButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchEmpButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchEmpButton2ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        employeeTabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void delSupTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delSupTabMouseEntered
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
    }//GEN-LAST:event_delSupTabMouseEntered

    private void delEmpTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delEmpTabMouseEntered
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
    }//GEN-LAST:event_delEmpTabMouseEntered

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
        String cusName = customerName.getText();
        String cusCon = customerContact.getText();
        String cusEmail = customerEmail.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(eventDate.getDate());
        String time = eventTime.getText();
        int exp_people = Integer.parseInt(expectedPeople.getText());
        int menuID = Integer.parseInt(menuIDCombobox.getSelectedItem().toString());
        double tot_amount = Double.parseDouble(totalAmount.getText());
        String delAddress = deliveryAddress.getText();
        String delType = deliveryComboBox.getSelectedItem().toString();
        String request = specialRequest.getText();


    }//GEN-LAST:event_placeOrderButtonActionPerformed

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
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
    }//GEN-LAST:event_jPanel4MouseEntered

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
    private javax.swing.JPanel addEmpTab;
    private keeptoo.KGradientPanel addEmployee;
    private keeptoo.KGradientPanel addEmployee1;
    private keeptoo.KGradientPanel addEmployee2;
    private panels.AddEmployeePanel addEmployeePanel1;
    private keeptoo.KGradientPanel addMenu;
    private javax.swing.JButton addMenuButton;
    private javax.swing.JPanel addMenuTab;
    private javax.swing.JButton addSupButton;
    private javax.swing.JPanel addSupTab;
    private keeptoo.KGradientPanel addSupplier;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JTextField cost;
    private javax.swing.JTextField customerContact;
    private javax.swing.JTextField customerEmail;
    private javax.swing.JTextField customerName;
    private javax.swing.JButton delEmpButton;
    private javax.swing.JPanel delEmpTab;
    private keeptoo.KGradientPanel delEmployee;
    private javax.swing.JButton delSupButton;
    private javax.swing.JPanel delSupTab;
    private keeptoo.KGradientPanel deleteSupplier;
    private javax.swing.JTextField deliveryAddress;
    private javax.swing.JComboBox<String> deliveryComboBox;
    private javax.swing.JComboBox<String> empIDCombobox;
    private javax.swing.JLabel emp_icon;
    private javax.swing.JLabel emp_text;
    private javax.swing.JPanel employeeHomeTab;
    private javax.swing.JPanel employeeTab;
    private javax.swing.JTabbedPane employeeTabbedPane;
    private com.toedter.calendar.JDateChooser eventDate;
    private javax.swing.JTextField eventTime;
    private javax.swing.JTextField expectedPeople;
    private javax.swing.JPanel homeTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mainErrorLabel;
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JPanel menuHomeTab;
    private javax.swing.JComboBox<String> menuIDCombobox;
    private javax.swing.JPanel menuTab;
    private javax.swing.JTabbedPane menuTabbedPane;
    private javax.swing.JTable menuTable;
    private javax.swing.JLabel menu_icon;
    private javax.swing.JLabel menu_text;
    private javax.swing.JPanel navigatorPanel;
    private javax.swing.JPanel orderHomeTab;
    private javax.swing.JLabel order_icon;
    private javax.swing.JLabel order_text;
    private javax.swing.JPanel ordersTab;
    private javax.swing.JTabbedPane ordersTabbedPane;
    private javax.swing.JLabel payment_icon;
    private javax.swing.JLabel payment_text;
    private javax.swing.JPanel paymentsTab;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JTextField plateName;
    private javax.swing.JButton searchEmpButton1;
    private javax.swing.JButton searchEmpButton2;
    private javax.swing.JPanel searchEmpTab;
    private keeptoo.KGradientPanel searchEmployee;
    private javax.swing.JPanel searchSupTab;
    private keeptoo.KGradientPanel searchSupplier;
    private javax.swing.JTextField specialRequest;
    private javax.swing.JTextField starter;
    private javax.swing.JTextField supContact;
    private javax.swing.JComboBox<String> supIDCombobox;
    private javax.swing.JTextField supName;
    private javax.swing.JLabel supp_icon;
    private javax.swing.JLabel supp_text;
    private javax.swing.JPanel suppliersHomeTab;
    private javax.swing.JPanel suppliersTab;
    private javax.swing.JTabbedPane suppliersTabbedPane;
    private javax.swing.JTextField supplies;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField totalAmount;
    private javax.swing.JPanel updateEmpTab;
    private panels.UpdateEmployePanel updateEmployePanel2;
    private keeptoo.KGradientPanel updateEmployee;
    private javax.swing.JPanel updateSupTab;
    private keeptoo.KGradientPanel updateSupplier;
    private panels.UpdateSupplierPanel updateSupplierPanel1;
    private panels.ViewEmployeesPanel viewEmployeesPanel1;
    private keeptoo.KGradientPanel viewMenu;
    private javax.swing.JPanel viewMenuTab;
    private panels.ViewSuppliersPanel viewSuppliersPanel1;
    private javax.swing.JTextField welcomeDrink;
    // End of variables declaration//GEN-END:variables
}

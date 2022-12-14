import java.awt.Toolkit;
import java.awt.event.WindowEvent;


/**
 *
 * @author HP
 */
public class AdminLogin extends javax.swing.JFrame {

    public AdminLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        adminLoginTitle = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        errorLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("SAI LEELA CATERERS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        adminLoginTitle.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        adminLoginTitle.setForeground(new java.awt.Color(255, 255, 255));
        adminLoginTitle.setText("ADMIN LOGIN");
        getContentPane().add(adminLoginTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        passLabel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("Enter Password");
        getContentPane().add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        password.setBackground(new java.awt.Color(77, 84, 84));
        password.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 118, 30));

        errorLabel.setBackground(new java.awt.Color(0, 0, 0));
        errorLabel.setFont(new java.awt.Font("Viner Hand ITC", 0, 16)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(errorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 150, 24));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 90, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Admin Background.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void close(){
         WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
         Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
 }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String pass = password.getText();
        if(pass.equals("")){
            errorLabel.setText("Enter Password");
        }
        else if(pass.equals("atharv")){
            
            HomePage.main(new String[]{});
            errorLabel.setText("");
            dispose();
            
        }
        else{
            errorLabel.setText("Invalid Password");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminLoginTitle;
    private javax.swing.JLabel background;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
